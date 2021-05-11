package com.hotel.management.service;

import com.hotel.management.model.Room;

public interface IAdminService {
	
	Room addRoom(Room room);
	Room editRoom(Room room);
	Room deleteRoom(Room room); //Mandatory parameter here will room number inside room object

}
