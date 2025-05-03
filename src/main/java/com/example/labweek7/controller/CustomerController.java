package com.example.labweek7.controller;

import com.example.labweek7.model.Customer;
import com.example.labweek7.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomerController {

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("customer-name/{customerStatus}")
    public List<Customer> findByCustomerStatus(
            @PathVariable ("customerStatus") String customerStatus)
            {
        return customerService.findByCustomerStatus(customerStatus);
    }
}
