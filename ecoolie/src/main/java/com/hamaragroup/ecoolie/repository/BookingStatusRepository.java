package com.hamaragroup.ecoolie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamaragroup.ecoolie.entity.BookingStatus;

public interface BookingStatusRepository extends JpaRepository<BookingStatus, String> {

}
