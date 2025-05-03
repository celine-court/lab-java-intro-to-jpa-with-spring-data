package com.example.labweek7.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FlightBooking {


    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

   @Table(name = "booking")
    public static class FlightbookingEntity{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer Id;
        private Integer Customer_id;
        private Integer flight_id;

        public FlightbookingEntity(Integer id, Integer customer_id, Integer flight_id) {
            Id = id;
            Customer_id = customer_id;
            this.flight_id = flight_id;
        }

        public Integer getId() {
            return Id;
        }

        public void setId(Integer id) {
            Id = id;
        }

        public Integer getCustomer_id() {
            return Customer_id;
        }

        public void setCustomer_id(Integer customer_id) {
            Customer_id = customer_id;
        }

        public Integer getFlight_id() {
            return flight_id;
        }

        public void setFlight_id(Integer flight_id) {
            this.flight_id = flight_id;
        }
    }
}
