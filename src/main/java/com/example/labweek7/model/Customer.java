package com.example.labweek7.model;

import com.example.labweek7.model.enums.CustomerStatus;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
       public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer Id;
        private String Customer_name;
        private Integer Customer_Total_mileage;

        @Enumerated(EnumType.STRING)
        private CustomerStatus customerStatus;

        public Customer() {

        }

    public Customer(Integer id, String customer_name, Integer customer_Total_mileage, CustomerStatus customerStatus) {
        Id = id;
        Customer_name = customer_name;
        Customer_Total_mileage = customer_Total_mileage;
        this.customerStatus = customerStatus;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setCustomer_name(String customer_name) {
        Customer_name = customer_name;
    }

    public Integer getCustomer_Total_mileage() {
        return Customer_Total_mileage;
    }

    public void setCustomer_Total_mileage(Integer customer_Total_mileage) {
        Customer_Total_mileage = customer_Total_mileage;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }
}









