package com.hamaragroup.ecoolie.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Station {

	@Id
	private String StationId;
	
	private String StationName;
	private String StationFare;
	
	@OneToMany(cascade =  CascadeType.ALL, mappedBy = "station")
	private List<Coolie> coolies = new ArrayList<Coolie>();

	@OneToMany(cascade =  CascadeType.ALL, mappedBy = "station")
	private List<Admin> admins = new ArrayList<Admin>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "station")
	private List<Booking> bookings = new ArrayList<Booking>();;

//	helper method start
	public void addCollie(Coolie coolie)
	{
		this.coolies.add(coolie);
		coolie.setStation(this);
	}
	
	public void addAdmin(Admin admin)
	{
		this.admins.add(admin);
		admin.setStation(this);
	}
	
	public void addBooking(Booking booking)
	{
		this.bookings.add(booking);
		booking.setStation(this);
	}
//helper method ends
	public String getStationId() {
		return StationId;
	}

	public void setStationId(String stationId) {
		StationId = stationId;
	}

	public String getStationName() {
		return StationName;
	}

	public void setStationName(String stationName) {
		StationName = stationName;
	}

	public String getStationFare() {
		return StationFare;
	}

	public void setStationFare(String stationFare) {
		StationFare = stationFare;
	}

	public List<Coolie> getCoolies() {
		return coolies;
	}

	public void setCoolies(List<Coolie> coolies) {
		this.coolies = coolies;
	}

	public List<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "Station [StationId=" + StationId + ", StationName=" + StationName + ", StationFare=" + StationFare
				+ ", coolies=" + coolies + ", admins=" + admins + ", bookings=" + bookings + "]";
	}

	public Station(String stationId, String stationName, String stationFare, List<Coolie> coolies, List<Admin> admins,
			List<Booking> bookings) {
		super();
		StationId = stationId;
		StationName = stationName;
		StationFare = stationFare;
		this.coolies = coolies;
		this.admins = admins;
		this.bookings = bookings;
	}

	public Station() {
		super();
	}
	
	


	
}
