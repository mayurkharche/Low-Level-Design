package com.parkinglot;

import java.util.List;

public class ParkingLot {

	List<ParkingFloor> parkingFloors;
	List<EntranceGate> entrances;
	List<ExitGate> exits;
	
	Address address;
	
	String parkingLotName;
	
	public boolean isParkingSpaceAvailableForVehicle(Vehicle vehicle) {return true;}
	public boolean updateParkingAttendant(ParkingAttendant parkingAttendant, int gateId) {return true;}
}
