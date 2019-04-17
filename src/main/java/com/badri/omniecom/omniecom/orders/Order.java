package com.badri.omniecom.omniecom.orders;

import javax.persistence.Entity;

@Entity
public class Order {
    private Long id;
    private String customerId;
    private Long productId;
    private Long price;
    private Long quantity;
    private String trackingNumber;
    private Long createdDate;
    private String shippingAddressLine;
    private int shippingAddressPincode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
}
