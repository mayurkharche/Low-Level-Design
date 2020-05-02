package com.vending.machine;

public class DeliveryResponse {
	
	private Item item;
	private int costToReturn;
	
	public DeliveryResponse(Item item, int cost) {
		super();
		this.item = item;
		this.costToReturn = cost;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getCost() {
		return costToReturn;
	}
	public void setCost(int cost) {
		this.costToReturn = cost;
	}
}
