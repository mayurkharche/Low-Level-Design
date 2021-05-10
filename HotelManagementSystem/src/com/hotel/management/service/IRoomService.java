package com.hotel.management.service;

import java.util.List;

import com.hotel.management.model.Room;
import com.hotel.management.model.Search;

public interface IRoomService {
	
	List<Room> searchRoom(Search search);

}
