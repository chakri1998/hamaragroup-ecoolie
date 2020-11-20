
package com.hamaragroup.ecoolie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamaragroup.ecoolie.entity.Coolie;

@Repository
public interface CoolieRepository extends JpaRepository<Coolie, String>{

}
