package com.bookmyshow.model;

import java.lang.reflect.Member;
import java.util.Date;
import java.util.List;

import com.bookmyshow.constant.BookingStatus;

public class Booking {
	
	private String bookingId;
	private Date bookingDate;
	private Member member;
	private Show show;
	private Audi audi;
	private BookingStatus bookingStatus;
	private double totalAmount;
	private List<Seat> seats;
	private Payment paymentObj;
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	public Audi getAudi() {
		return audi;
	}
	public void setAudi(Audi audi) {
		this.audi = audi;
	}
	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	public Payment getPaymentObj() {
		return paymentObj;
	}
	public void setPaymentObj(Payment paymentObj) {
		this.paymentObj = paymentObj;
	}
}
