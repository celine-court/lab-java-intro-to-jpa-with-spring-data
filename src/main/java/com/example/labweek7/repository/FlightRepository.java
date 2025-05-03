package com.example.labweek7.repository;

import com.example.labweek7.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
