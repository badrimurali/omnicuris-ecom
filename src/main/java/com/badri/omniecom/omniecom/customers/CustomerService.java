package com.badri.omniecom.omniecom.customers;

import com.badri.omniecom.omniecom.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    public void saveOrEditCustomer(Customer newCustomer) {
        Customer customer = null;
        if (newCustomer.getId() != null) {
            customer = customerRepository.findById(newCustomer.getId()).orElseThrow(() -> new EntityNotFoundException("Invalid customer id"));
        } else if (newCustomer.getName() != null) {
            customer = customerRepository.findByName(newCustomer.getName());
        } else if (newCustomer.getEmail() != null) {
            customer = customerRepository.findByEmail(newCustomer.getEmail());
        }

        if(customer == null) {
            customer = newCustomer;
        } else {
            customer.setName(newCustomer.getName());
            customer.setEmail(newCustomer.getEmail());
        }
        customerRepository.save(customer);
    }
}
