package com.hotel.management.model;

public class RoomServiceCharge implements BaseRoomCharge{

	Double cost;
	BaseRoomCharge baseRoomCharge;
	
	RoomServiceCharge(Double cost, BaseRoomCharge baseRoomCharge) {
		this.cost = cost;
		this.baseRoomCharge = baseRoomCharge;
	}
	
	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		baseRoomCharge.setCost(baseRoomCharge.getCost() + cost);
		return baseRoomCharge.getCost();
	}

	@Override
	public void setCost(Double cost) {
		// TODO Auto-generated method stub
		this.cost = cost;
	}

}
