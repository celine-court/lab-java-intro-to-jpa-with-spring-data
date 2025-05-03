package com.example.labweek7.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.labweek7.model.Customer;
import com.example.labweek7.model.enums.CustomerStatus;
import com.example.labweek7.repository.CustomerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;




import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class CustomerService {
    private final CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer findByCustomerStatus(String customerStatus) {
        Optional<Customer> customer;
        customer = customerRepository.findByCustomerStatus(customerStatus);
        if (customer.isPresent()) {
            return customer.get();
        }
        throw new EntityNotFoundException("Customer with status " + customerStatus + " not found");
    }





}
