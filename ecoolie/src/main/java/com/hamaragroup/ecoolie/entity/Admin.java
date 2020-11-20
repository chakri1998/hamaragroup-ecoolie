package com.hamaragroup.ecoolie.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Admin {

	@Id
	private String adminId;
	
	private String adminRole;
	private String adminPassword;
	
	@ManyToOne
	@JoinColumn(name = "fk_station")
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminId == null) ? 0 : adminId.hashCode());
		result = prime * result + ((adminPassword == null) ? 0 : adminPassword.hashCode());
		result = prime * result + ((adminRole == null) ? 0 : adminRole.hashCode());
		result = prime * result + ((station == null) ? 0 : station.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (adminId == null) {
			if (other.adminId != null)
				return false;
		} else if (!adminId.equals(other.adminId))
			return false;
		if (adminPassword == null) {
			if (other.adminPassword != null)
				return false;
		} else if (!adminPassword.equals(other.adminPassword))
			return false;
		if (adminRole == null) {
			if (other.adminRole != null)
				return false;
		} else if (!adminRole.equals(other.adminRole))
			return false;
		if (station == null) {
			if (other.station != null)
				return false;
		} else if (!station.equals(other.station))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminRole=" + adminRole + ", adminPassword=" + adminPassword
				+ ", station=" + station + "]";
	}

	
	
}
