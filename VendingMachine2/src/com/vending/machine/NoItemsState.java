package com.vending.machine;

import java.util.ArrayList;

public class NoItemsState implements MachineState{
	
	private Machine machine;
	
	NoItemsState(Machine machine){
		this.machine = machine;
	}

	@Override
	public void insertItems(ArrayList<ArrayList<Item>> itemGrid) {
		
		machine.setItemGrid(itemGrid);
		
		if(null == itemGrid || itemGrid.size() == 0){

			System.out.println("No item passed");
		}else{
			
			System.out.println("Items inserted successfully");
			machine.setCurrentState(machine.getIdle());
		}
		
	}

	@Override
	public void provideLocation(String location) {
		
		System.out.println("Error : Machine is empty. Please provide the items first");
		
	}

	@Override
	public void insertMoney(Price amount) {
		
		System.out.println("Error : Machine is empty. Please provide the items first");
	}

	@Override
	public DeliveryResponse deliver() {
		
		System.out.println("Error : Machine is empty. Please provide the items first");
		return null;
	}

}
