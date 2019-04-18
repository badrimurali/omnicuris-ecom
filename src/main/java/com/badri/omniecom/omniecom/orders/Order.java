package com.badri.omniecom.omniecom.orders;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long customerId;
    private Long productId;
    private Long price;
    private Long quantity;
    private String trackingNumber;
    private Long createdDate;
    private String shippingAddressLine;
    private int shippingAddressPincode;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    private Long deliveryDate;
    private Long latestStatusUpdateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public String getShippingAddressLine() {
        return shippingAddressLine;
    }

    public void setShippingAddressLine(String shippingAddressLine) {
        this.shippingAddressLine = shippingAddressLine;
    }

    public int getShippingAddressPincode() {
        return shippingAddressPincode;
    }

    public void setShippingAddressPincode(int shippingAddressPincode) {
        this.shippingAddressPincode = shippingAddressPincode;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Long deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Long getLatestStatusUpdateDate() {
        return latestStatusUpdateDate;
    }

    public void setLatestStatusUpdateDate(Long latestStatusUpdateDate) {
        this.latestStatusUpdateDate = latestStatusUpdateDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
