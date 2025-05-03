package com.example.labweek7.controller;

import com.example.labweek7.model.Customer;
import com.example.labweek7.model.FlightBooking;
import com.example.labweek7.service.FlightBookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/bookings")
public class FlightBookingController {


    private final FlightBookingService flightBookingService;


    public FlightBookingController(FlightBookingService flightBookingService) {
        this.flightBookingService = flightBookingService;

    }

    @GetMapping("booking_CustomerId/{Customer_id}")
    public List<FlightBooking> findFlightBookingByCustomerId(
            @PathVariable ("customerId") Integer Customer_id)
    {
        return flightBookingService.findFlightBookingByCustomerId(Customer_id);
    }



}
