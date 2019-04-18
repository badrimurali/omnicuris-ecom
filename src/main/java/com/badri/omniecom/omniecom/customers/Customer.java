package com.badri.omniecom.omniecom.customers;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="seq", initialValue=5)
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq")
    private Long id;
    private String name;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
