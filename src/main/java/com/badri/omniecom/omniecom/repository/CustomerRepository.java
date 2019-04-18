package com.badri.omniecom.omniecom.repository;

import com.badri.omniecom.omniecom.customers.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByName(String name);
    Customer findByEmail(String email);
}
