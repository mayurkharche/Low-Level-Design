package com.bookmyshow.model;

import com.bookmyshow.constant.SeatStatus;
import com.bookmyshow.constant.SeatType;

public class Seat {
	
	private int seatId;
	private SeatType seatType;
	private SeatStatus seatStatus;
	private double price;
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	public SeatStatus getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(SeatStatus seatStatus) {
		this.seatStatus = seatStatus;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
