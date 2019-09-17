package com.bharath.fligthregistration.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.fligthregistration.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
