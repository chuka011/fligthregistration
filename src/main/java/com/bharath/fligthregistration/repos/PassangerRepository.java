package com.bharath.fligthregistration.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.fligthregistration.entities.Passanger;

public interface PassangerRepository extends JpaRepository<Passanger, Long> {

}
