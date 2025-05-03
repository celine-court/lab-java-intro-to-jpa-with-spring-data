package com.example.labweek7.service;

import com.example.labweek7.model.Customer;
import com.example.labweek7.model.FlightBooking;
import com.example.labweek7.repository.FlightBookingRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;



@Service
public class FlightBookingService {

    private final FlightBookingRepository flightBookingRepository;

    public FlightBookingService(FlightBookingRepository flightBookingRepository) {
        this.flightBookingRepository = flightBookingRepository;
    }

    public List<FlightBooking> getAllFlightBookings() {
        return flightBookingRepository.findAll();
    }

    public List<FlightBooking> findFlightBookingByCustomerId(Integer customerId) {
        return flightBookingRepository.findFlightBookingByCustomerId(customerId);
    }


}