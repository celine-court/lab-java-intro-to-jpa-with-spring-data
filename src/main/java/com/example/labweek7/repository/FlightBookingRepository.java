package com.example.labweek7.repository;


import com.example.labweek7.model.Customer;
import com.example.labweek7.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;



@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer>{
    @Query("SELECT b FROM FlightBooking b WHERE b.id = ?1")

    List<FlightBooking> findFlightBookingByCustomerId(Integer customerId);


}
