
package com.hamaragroup.ecoolie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamaragroup.ecoolie.entity.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, String>{

}