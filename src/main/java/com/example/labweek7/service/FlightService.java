package com.example.labweek7.service;

import com.example.labweek7.model.Flight;
import com.example.labweek7.repository.FlightBookingRepository;
import com.example.labweek7.repository.FlightRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }
}
