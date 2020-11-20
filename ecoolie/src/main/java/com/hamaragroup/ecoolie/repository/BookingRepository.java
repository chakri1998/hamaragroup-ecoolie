package com.hamaragroup.ecoolie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamaragroup.ecoolie.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, String>{

}
