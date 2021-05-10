package com.hotel.management.service;

import com.hotel.management.model.Guest;
import com.hotel.management.model.RoomBooking;

public interface IReceptionistService {

	void checkInGuest(Guest guest, RoomBooking bookingInfo);
	void checkOutGuest(Guest guest, RoomBooking bookingInfo);
	
	RoomBooking createBooking(Guest guestInfo);
	RoomBooking cancelBooking(int bookingId);
}
