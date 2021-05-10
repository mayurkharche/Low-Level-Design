package com.hotel.management.model;

public class RoomCharge implements BaseRoomCharge {

	Double cost;
	
	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

	@Override
	public void setCost(Double cost) {
		// TODO Auto-generated method stub
		this.cost = cost;
	}

}
