package com.hotel.management.model;

import java.util.List;

import com.hotel.management.constant.RoomStatus;
import com.hotel.management.constant.RoomStyle;

public class Room {

	String roomNumber;
	RoomStyle roomStyle;
	RoomStatus roomStatus;
	Double bookingPrice;
	List<RoomKey> roomKeys;
	List<HouseKeepingLog> houseKeepingLogs;
}
