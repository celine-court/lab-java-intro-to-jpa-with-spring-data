package com.example.labweek7.demo;

import com.example.labweek7.model.Customer;
import com.example.labweek7.model.FlightBooking;
import com.example.labweek7.model.Flight;
import com.example.labweek7.model.enums.CustomerStatus;
import com.example.labweek7.repository.CustomerRepository;
import com.example.labweek7.repository.FlightBookingRepository;
import com.example.labweek7.service.FlightBookingService;
import com.example.labweek7.repository.FlightRepository;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DataLoader implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final FlightBookingRepository flightBookingRepository;


    public DataLoader() {
            this(null, null);
    }

    public DataLoader(CustomerRepository customerRepository,
                      FlightBooking flightBooking) {
        this.customerRepository = customerRepository;
        this.flightBookingRepository = flightBookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }

    public void run(Integer... args) throws Exception {

        System.out.println("Loading data...");

        var flightBooking1 = new FlightBooking(1,1,1);
        var flightBooking2 = new FlightBooking(2, 2, 2);
        var flightBooking3 = new FlightBooking(3, 3, 3);

        flightBookingRepository.save(flightBooking1);
        flightBookingRepository.save(flightBooking2);
        flightBookingRepository.save(flightBooking3);

/*private Long Id;
        private String Customer_name;
        private Long Customer_Total_mileage;

        @Enumerated(EnumType.STRING)
        private CustomerStatus customerStatus;

        */
        var customer1 = new Customer(1, "Agustine Riviera", 115235,CustomerStatus.Silver);
        var customer2 = new Customer(2, "Alaina Sepulvida",6008,CustomerStatus.None);
        var customer3 = new Customer(3, "Tom Jones",205767,CustomerStatus.Gold);

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);

        System.out.println("Loading data complete.");
    }



}
