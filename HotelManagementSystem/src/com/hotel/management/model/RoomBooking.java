package com.hotel.management.model;

import java.util.Date;
import java.util.List;

import com.hotel.management.constant.BookingStatus;

public class RoomBooking {
	
	String bookingId;
	Date startDate;
	int durationInDays;
	BookingStatus bookingStatus;
	List<Guest> guestList;
	List<Room> roomList;
	BaseRoomCharge totalRoomCharges;
}
