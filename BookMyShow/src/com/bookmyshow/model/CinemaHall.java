package com.bookmyshow.model;

import java.util.List;

public class CinemaHall {
	
	private long cinemaHallId;
	private String cinemaHallName;
	
	private Address address;
	
	private List<Audi> audiList;

	public long getCinemaHallId() {
		return cinemaHallId;
	}

	public void setCinemaHallId(long cinemaHallId) {
		this.cinemaHallId = cinemaHallId;
	}

	public String getCinemaHallName() {
		return cinemaHallName;
	}

	public void setCinemaHallName(String cinemaHallName) {
		this.cinemaHallName = cinemaHallName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Audi> getAudiList() {
		return audiList;
	}

	public void setAudiList(List<Audi> audiList) {
		this.audiList = audiList;
	}
}
