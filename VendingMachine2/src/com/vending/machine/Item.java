package com.vending.machine;
public class Item {

	private String name;
	private Price price;
	private int capacity;
	
	public Item(String name, Price price, int capacity) {
		super();
		this.name = name;
		this.price = price;
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}