package com.hamaragroup.ecoolie.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BookingStatus {

	@Id
	private String bookingStatusId;
	
	private String bookingLabel;
	private String bookingOrder;
	private String bookingIsActive;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bookingStatus" )
	private List<Booking> bookings;

	public BookingStatus(String bookingStatusId, String bookingLabel, String bookingOrder, String bookingIsActive,
			List<Booking> bookings) {
		super();
		this.bookingStatusId = bookingStatusId;
		this.bookingLabel = bookingLabel;
		this.bookingOrder = bookingOrder;
		this.bookingIsActive = bookingIsActive;
		this.bookings = bookings;
	}

	public String getBookingStatusId() {
		return bookingStatusId;
	}

	public void setBookingStatusId(String bookingStatusId) {
		this.bookingStatusId = bookingStatusId;
	}

	public String getBookingLabel() {
		return bookingLabel;
	}

	public void setBookingLabel(String bookingLabel) {
		this.bookingLabel = bookingLabel;
	}

	public String getBookingOrder() {
		return bookingOrder;
	}

	public void setBookingOrder(String bookingOrder) {
		this.bookingOrder = bookingOrder;
	}

	public String getBookingIsActive() {
		return bookingIsActive;
	}

	public void setBookingIsActive(String bookingIsActive) {
		this.bookingIsActive = bookingIsActive;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public BookingStatus() {
		super();
	}

	@Override
	public String toString() {
		return "BookingStatus [bookingStatusId=" + bookingStatusId + ", bookingLabel=" + bookingLabel
				+ ", bookingOrder=" + bookingOrder + ", bookingIsActive=" + bookingIsActive + ", bookings=" + bookings
				+ "]";
	}
	
	
	
	
}
