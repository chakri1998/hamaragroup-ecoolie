package com.hamaragroup.ecoolie.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamaragroup.ecoolie.repository.AdminRepositry;
import com.hamaragroup.ecoolie.repository.BookingRepository;
import com.hamaragroup.ecoolie.repository.CoolieRepository;
import com.hamaragroup.ecoolie.repository.StationRepository;
import com.hamaragroup.ecoolie.repository.StatusRepository;
import com.hamaragroup.ecoolie.serviceinterface.EcoolieServiceInterface;

@Service
public class EcoolieServiceImplimentation implements EcoolieServiceInterface {

	@Autowired
	AdminRepositry adminRepositry;
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	CoolieRepository coolieRepository;
	
	@Autowired
	StatusRepository statusRepository;
	
	@Autowired
	StationRepository stationRepository;

	@Override
	public String helloWorld() {
		// TODO Auto-generated method stub
		return "Hello World.";
	}
	
	
	
}
