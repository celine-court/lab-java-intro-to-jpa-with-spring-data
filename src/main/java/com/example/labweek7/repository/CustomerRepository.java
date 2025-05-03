package com.example.labweek7.repository;

import com.example.labweek7.model.Customer;
import com.example.labweek7.model.enums.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
import java.util.Optional;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c WHERE c.customerStatus = ?1")

    List<Customer> findByCustomerStatus(CustomerStatus customerStatus);

    Optional<Customer> findByCustomerStatus(String customerStatus);
}
