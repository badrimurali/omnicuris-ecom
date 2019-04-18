package com.badri.omniecom.omniecom.orders;

import com.badri.omniecom.omniecom.Response;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<String> addOrder(@RequestBody Order order) {
        Response response = new Response();
        try {
            orderService.placeOrder(order);
            response.setStatus(true);
            return ResponseEntity.ok().body(new Gson().toJson(response));
        } catch (Exception e) {
            response.setStatus(false);
            response.setErrorMessage(e.getMessage());
            return ResponseEntity.badRequest().body(new Gson().toJson(response));
        }
    }

    @RequestMapping(value = "/{orderId}", method = RequestMethod.DELETE)
    public ResponseEntity<String> cancelOrder(@PathVariable Long orderId) {
        Response response = new Response();
        try {
            orderService.cancelOrder(orderId);
            response.setStatus(true);
            return ResponseEntity.ok().body(new Gson().toJson(response));
        } catch (Exception e) {
            response.setStatus(false);
            response.setErrorMessage(e.getMessage());
            return ResponseEntity.badRequest().body(new Gson().toJson(response));
        }
    }

    @RequestMapping(value = "/all/{customerId}", method = RequestMethod.GET)
    public ResponseEntity<String> getAllOrders(@PathVariable Long customerId) {
        Response response = new Response();
        try {
            return ResponseEntity.ok().body(new Gson().toJson(orderService.getByCustomerId(customerId)));
        }catch (Exception e) {
            e.printStackTrace();
            response.setStatus(false);
            response.setErrorMessage(e.getMessage());
            return ResponseEntity.badRequest().body(new Gson().toJson(response));
        }
    }


    @RequestMapping(value = "/markDelivery/{orderId}", method = RequestMethod.GET)
    public ResponseEntity<String> markDelivery(@PathVariable Long orderId) {
        Response response = new Response();
        try {
            orderService.markDelivery(orderId);
            response.setStatus(true);
            return ResponseEntity.ok().body(new Gson().toJson(response));
        }catch (Exception e) {
            response.setStatus(false);
            response.setErrorMessage(e.getMessage());
            return ResponseEntity.badRequest().body(new Gson().toJson(response));
        }
    }
}
