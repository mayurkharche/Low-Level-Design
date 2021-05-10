package com.vending.machine;

import java.util.ArrayList;

public class HasAmountState implements MachineState{

	private Machine machine;
	
	HasAmountState(Machine machine){
		this.machine = machine;
	}
	
	@Override
	public void insertItems(ArrayList<ArrayList<Item>> itemGrid) {
		
		System.out.println("Error : cannot insert elements during transaction");
	}

	@Override
	public void provideLocation(String location) {
		
		System.out.println("Error : Cannot provide location duing transaction");
	}

	@Override
	public void insertMoney(Price amount) {
		
		System.out.println("Error : Cannot insert amount duing transaction");
	}

	@Override
	public DeliveryResponse deliver() {
		
		Item item = machine.getCurrentItem();
		Price amount = machine.getCurrrentAmount();
		
		DeliveryResponse response = new DeliveryResponse(item, amount.getCost() - item.getPrice().getCost());
		
		item.setCapacity(item.getCapacity() - 1);
		
		if(item.getCapacity() == 0){
			machine.setItemCount(machine.getItemCount() - 1);
		}
		
		if(machine.getItemCount() == 0){
			machine.setCurrentState(machine.getNoItems());
		}else{
			machine.setCurrentState(machine.getIdle());
		}
		
		System.out.println("Item delivered with name : "+ item.getName());
		
		return response;
	}
	
	

}
