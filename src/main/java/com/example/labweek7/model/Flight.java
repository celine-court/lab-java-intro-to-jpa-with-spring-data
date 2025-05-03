package com.example.labweek7.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private Integer flight_number;
    private String flight_aircraft_name;
    private Integer flight_mileage;


    public Flight() {

    }

    public Flight(Integer id, Integer flight_number, String flight_aircraft_name, Integer flight_mileage) {
        Id = id;
        this.flight_number = flight_number;
        this.flight_aircraft_name = flight_aircraft_name;
        this.flight_mileage = flight_mileage;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(Integer flight_number) {
        this.flight_number = flight_number;
    }

    public String getFlight_aircraft_name() {
        return flight_aircraft_name;
    }

    public void setFlight_aircraft_name(String flight_aircraft_name) {
        this.flight_aircraft_name = flight_aircraft_name;
    }

    public Integer getFlight_mileage() {
        return flight_mileage;
    }

    public void setFlight_mileage(Integer flight_mileage) {
        this.flight_mileage = flight_mileage;
    }
}


