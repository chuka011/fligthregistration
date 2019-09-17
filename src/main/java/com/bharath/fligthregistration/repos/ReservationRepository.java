package com.bharath.fligthregistration.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.fligthregistration.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
