
package com.hamaragroup.ecoolie.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Coolie {

	@Id
	private String coolieId;
	
	private String coolieName;
	private String coolieAddress;
	private String cooliePhoneNumber;
	private String coolieNumber;
	
	@ManyToOne
	private Station station;

	public String getCoolieId() {
		return coolieId;
	}

	public void setCoolieId(String coolieId) {
		this.coolieId = coolieId;
	}

	public String getCoolieName() {
		return coolieName;
	}

	public void setCoolieName(String coolieName) {
		this.coolieName = coolieName;
	}

	public String getCoolieAddress() {
		return coolieAddress;
	}

	public void setCoolieAddress(String coolieAddress) {
		this.coolieAddress = coolieAddress;
	}

	public String getCooliePhoneNumber() {
		return cooliePhoneNumber;
	}

	public void setCooliePhoneNumber(String cooliePhoneNumber) {
		this.cooliePhoneNumber = cooliePhoneNumber;
	}

	public String getCoolieNumber() {
		return coolieNumber;
	}

	public void setCoolieNumber(String coolieNumber) {
		this.coolieNumber = coolieNumber;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Coolie(String coolieId, String coolieName, String coolieAddress, String cooliePhoneNumber,
			String coolieNumber, Station station) {
		super();
		this.coolieId = coolieId;
		this.coolieName = coolieName;
		this.coolieAddress = coolieAddress;
		this.cooliePhoneNumber = cooliePhoneNumber;
		this.coolieNumber = coolieNumber;
		this.station = station;
	}

	public Coolie() {
		super();
	}

	@Override
	public String toString() {
		return "Coolie [coolieId=" + coolieId + ", coolieName=" + coolieName + ", coolieAddress=" + coolieAddress
				+ ", cooliePhoneNumber=" + cooliePhoneNumber + ", coolieNumber=" + coolieNumber + ", station=" + station
				+ "]";
	}



}
