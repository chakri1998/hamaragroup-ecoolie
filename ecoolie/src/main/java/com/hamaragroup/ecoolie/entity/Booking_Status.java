package com.hamaragroup.ecoolie.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Booking_Status {
	
	@Id
	private String bookingStatusId;
	
	private String bookingLabel;
	private String order;
	private String bookingIsActive;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "bookingStatus")
	private List<Booking> bookings = new ArrayList<Booking>();

//	helper method
	public void addBookings(Booking booking)
	{
		this.bookings.add(booking);
		booking.setStatus(this);
	}
	
	public String getStatusId() {
		return bookingStatusId;
	}
	public void setStatusId(String bookingStatusId) {
		this.bookingStatusId = bookingStatusId;
	}
	public String getLabel() {
		return bookingLabel;
	}

	public void setLabel(String label) {
		this.bookingLabel = label;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getIsActive() {
		return bookingIsActive;
	}

	public void setIsActive(String bookingIsActive) {
		this.bookingIsActive = bookingIsActive;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) 
	{
		this.bookings = bookings;
	}


 public Booking_Status() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Status [statusId=" + bookingStatusId + ", label=" + bookingIsActive + ", order=" + order + ", isActive=" + bookingIsActive
				+ ", bookings=" + bookings + "]";
	}


	
}
