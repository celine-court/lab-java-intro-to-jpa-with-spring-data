package com.example.labweek7.controller;

import com.example.labweek7.model.Flight;
import com.example.labweek7.service.FlightService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/flights")
public class FlightController {

    private final FlightService flightService;


    public FlightController(FlightService flightService, FlightService flightService) {
        this.flightService = flightService;

    }


}
