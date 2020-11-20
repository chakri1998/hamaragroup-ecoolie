package com.hamaragroup.ecoolie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamaragroup.ecoolie.entity.Admin;

@Repository
public interface AdminRepositry extends JpaRepository<Admin, String> {

}
