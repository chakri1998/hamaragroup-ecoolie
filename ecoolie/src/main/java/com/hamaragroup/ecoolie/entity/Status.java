package com.hamaragroup.ecoolie.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Status {
	@Id
	private String statusId;
	
	private String label;
	private String order;
	private String isActive;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "status")
	private List<Booking>bookings;

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Status(String statusId, String label, String order, String isActive, List<Booking> bookings) {
		super();
		this.statusId = statusId;
		this.label = label;
		this.order = order;
		this.isActive = isActive;
		this.bookings = bookings;
	}

	public Status() {
		super();
	}

	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", label=" + label + ", order=" + order + ", isActive=" + isActive
				+ ", bookings=" + bookings + "]";
	}


	
}
