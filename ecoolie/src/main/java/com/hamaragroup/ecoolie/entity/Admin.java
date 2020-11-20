
package com.hamaragroup.ecoolie.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Admin {

	@Id
	private String adminId;
	
	private String adminRole;
	private String adminPassword;
	
	@ManyToOne
	private Station station;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(String adminRole) {
		this.adminRole = adminRole;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Admin(String adminId, String adminRole, String adminPassword, Station station) {
		super();
		this.adminId = adminId;
		this.adminRole = adminRole;
		this.adminPassword = adminPassword;
		this.station = station;
	}

	public Admin() {
		super();
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminRole=" + adminRole + ", adminPassword=" + adminPassword
				+ ", station=" + station + "]";
	}

	
	
}
