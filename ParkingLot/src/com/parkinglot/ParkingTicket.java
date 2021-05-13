package com.parkinglot;

import java.util.Date;

public class ParkingTicket {

	int ticketId;
	int levelId;
	int spaceId;
	Date vehicleEntryDateTime;
	Date vehicleExitDateTime;
	ParkingSpaceType parkingSpaceType;
	Double totalCost;
	ParkingTicketStatus parkingTicketStatus;
	
	public void updateTotalCost() {}
	public void updateVehicleExitTime(Date vehicleExitDateTime) {}
}
