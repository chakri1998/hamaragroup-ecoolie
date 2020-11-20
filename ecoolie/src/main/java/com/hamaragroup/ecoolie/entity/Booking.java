package com.hamaragroup.ecoolie.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking {
	@Id
	private String bookingId;
	
	private String userName;
	private String userPhoneNumber;
	private String userAddress;
	private String trainNo;
	private String coachNo;
	private String seatNo;
	private String estimatedLaguageWeight;
	private String finalLaguageWeight;
	private String estimatedFare;
	private String finalFare;
	
	@ManyToOne
	private BookingStatus bookingStatus;
	
	@ManyToOne
	private Station station;

	public Booking(String bookingId, String userName, String userPhoneNumber, String userAddress, String trainNo,
			String coachNo, String seatNo, String estimatedLaguageWeight, String finalLaguageWeight,
			String estimatedFare, String finalFare, BookingStatus bookingStatus, Station station) {
		super();
		this.bookingId = bookingId;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
		this.userAddress = userAddress;
		this.trainNo = trainNo;
		this.coachNo = coachNo;
		this.seatNo = seatNo;
		this.estimatedLaguageWeight = estimatedLaguageWeight;
		this.finalLaguageWeight = finalLaguageWeight;
		this.estimatedFare = estimatedFare;
		this.finalFare = finalFare;
		this.bookingStatus = bookingStatus;
		this.station = station;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public String getCoachNo() {
		return coachNo;
	}

	public void setCoachNo(String coachNo) {
		this.coachNo = coachNo;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getEstimatedLaguageWeight() {
		return estimatedLaguageWeight;
	}

	public void setEstimatedLaguageWeight(String estimatedLaguageWeight) {
		this.estimatedLaguageWeight = estimatedLaguageWeight;
	}

	public String getFinalLaguageWeight() {
		return finalLaguageWeight;
	}

	public void setFinalLaguageWeight(String finalLaguageWeight) {
		this.finalLaguageWeight = finalLaguageWeight;
	}

	public String getEstimatedFare() {
		return estimatedFare;
	}

	public void setEstimatedFare(String estimatedFare) {
		this.estimatedFare = estimatedFare;
	}

	public String getFinalFare() {
		return finalFare;
	}

	public void setFinalFare(String finalFare) {
		this.finalFare = finalFare;
	}

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userName=" + userName + ", userPhoneNumber=" + userPhoneNumber
				+ ", userAddress=" + userAddress + ", trainNo=" + trainNo + ", coachNo=" + coachNo + ", seatNo="
				+ seatNo + ", estimatedLaguageWeight=" + estimatedLaguageWeight + ", finalLaguageWeight="
				+ finalLaguageWeight + ", estimatedFare=" + estimatedFare + ", finalFare=" + finalFare
				+ ", bookingStatus=" + bookingStatus + ", station=" + station + "]";
	}

	public Booking() {
		super();
	}
	
	

	

}
