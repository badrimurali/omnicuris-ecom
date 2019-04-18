package com.badri.omniecom.omniecom.customers;

import com.badri.omniecom.omniecom.Response;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/saveOrEdit", method = RequestMethod.POST)
    public ResponseEntity<String> addCustomer(@RequestBody  Customer customer) {
        Response response = new Response();
        try {
            customerService.saveOrEditCustomer(customer);
            response.setStatus(true);
            return ResponseEntity.ok().body(new Gson().toJson(response));
        }catch (EntityNotFoundException e) {
            response.setStatus(false);
            response.setErrorMessage(e.getMessage());
            return ResponseEntity.badRequest().body(new Gson().toJson(response));
        }
    }
}
