package com.hotel.management.service;

import java.util.List;

import com.hotel.management.model.Room;
import com.hotel.management.model.RoomKey;

public interface IRoomKeyService {
	
	Boolean assignKeyToRoom(RoomKey roomKey, Room room); // Room Number is Mandatory
	RoomKey createAndAssignRoomKey(Room room);
	List<RoomKey> getAllRoomKeysForRoom(Room room); 

}
