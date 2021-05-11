package com.hotel.management.service;

import java.util.List;

import com.hotel.management.model.Guest;
import com.hotel.management.model.RoomBooking;

public interface IGuestService {

	List<RoomBooking> getAllRoomBooking(Guest guest);
}
