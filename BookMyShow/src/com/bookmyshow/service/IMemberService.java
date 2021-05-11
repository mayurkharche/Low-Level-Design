package com.bookmyshow.service;

import java.util.List;

import com.bookmyshow.model.Booking;

public interface IMemberService {
	
	Booking makeBooking(Booking booking);
	List<Booking> getBooking();

}
