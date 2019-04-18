package com.badri.omniecom.omniecom.products;

import javax.persistence.*;

@Entity
@Table(name = "products")
@SequenceGenerator(name="seq", initialValue=11)
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq")
    private Long id;
    private String name;
    private long price;
    private long stock;
    private String merchant;
    private String addressLine;
    private int addressPincode;
    private Long categoryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public int getAddressPincode() {
        return addressPincode;
    }

    public void setAddressPincode(int addressPincode) {
        this.addressPincode = addressPincode;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
