package com.hamaragroup.ecoolie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamaragroup.ecoolie.entity.Booking_Status;


@Repository
public interface StatusRepository extends JpaRepository<Booking_Status, String>{

}
