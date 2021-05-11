package com.hotel.management.service;

import java.util.Date;
import java.util.List;

import com.hotel.management.model.HouseKeepingLog;
import com.hotel.management.model.Room;

public interface IHouseKeepingService {

	Boolean addHouseKeepingLog(HouseKeepingLog houseKeepingLog, Room room);
	List<HouseKeepingLog> getRoomServicedOnDate(Date date);
	List<HouseKeepingLog> getRoomServiced(Date fromDate, Date toDate);
}
