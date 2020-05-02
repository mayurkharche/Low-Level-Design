package com.vending.machine;

import java.util.ArrayList;

public interface MachineState {
	
	void insertItems(ArrayList<ArrayList<Item>> itemGrid);
	
	void provideLocation(String location);
	
	void insertMoney(Price amount);
	
	DeliveryResponse deliver();
}
