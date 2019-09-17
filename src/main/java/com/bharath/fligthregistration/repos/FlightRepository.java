package com.bharath.fligthregistration.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.fligthregistration.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
