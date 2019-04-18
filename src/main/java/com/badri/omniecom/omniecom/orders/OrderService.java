package com.badri.omniecom.omniecom.orders;

import com.badri.omniecom.omniecom.products.Product;
import com.badri.omniecom.omniecom.products.ProductsService;
import com.badri.omniecom.omniecom.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.badri.omniecom.omniecom.orders.OrderStatus.*;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductsService productsService;


    public void placeOrder(Order newOrder) {
        if (newOrder.getId() == null) {
            Product product = productsService.getProduct(newOrder.getProductId());
            if (product.getStock() >= newOrder.getQuantity()) {
                product.setStock(product.getStock() - newOrder.getQuantity());
                productsService.saveOrEdit(product);
                newOrder.setCreatedDate(new Date().getTime());
                newOrder.setOrderStatus(ACCEPTED);
                orderRepository.save(newOrder);
            } else {
                throw new IndexOutOfBoundsException("Unable to place order. Out of stock");
            }

        }else {
            throw new IllegalStateException("Order with OrderId not accepted");
        }
    }

    public void cancelOrder(Long orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new EntityNotFoundException("Invalid Order Id"));
        Product product = productsService.getProduct(order.getProductId());
        product.setStock(product.getStock() + order.getQuantity());
        productsService.saveOrEdit(product);
        order.setOrderStatus(CANCELLED);
        orderRepository.save(order);
    }

    public List<Order> getByCustomerId(Long customerId) {
       List<Order> orders = orderRepository.findByCustomerId(customerId);
       return orders.stream().filter(o -> Arrays.asList(ACCEPTED, DELIVERED, DISPATCHED).contains(o.getOrderStatus())).collect(Collectors.toList());
    }

    public void markDelivery(Long orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new EntityNotFoundException("Invalid Order Id"));
        order.setDeliveryDate(new Date().getTime());
        order.setOrderStatus(DELIVERED);
        orderRepository.save(order);
    }
}
