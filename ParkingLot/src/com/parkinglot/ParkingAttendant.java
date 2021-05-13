package com.parkinglot;

public class ParkingAttendant extends Account {

	Payment payment ;
	
	public Boolean processVehicleEntry(Vehicle vehicle) {return true;}
	public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType) {return null;}
	
}
