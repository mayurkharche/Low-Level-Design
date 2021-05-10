package com.vending.machine;

import java.util.ArrayList;

public class HasLocationState implements MachineState{
	
	private Machine machine;
	
	HasLocationState(Machine machine){
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
	
		Item item = machine.getCurrentItem();
		
		if(item.getCapacity() <= 0){
			
			System.out.println("Error : Item out of stock!!!");
			return;
		}
		
		if(!item.getPrice().getCurrency().equals(amount.getCurrency())){
			System.out.println("Error : Currency do not match");
			return;
		}
		
		if(item.getPrice().getCost() > amount.getCost()){
			
			System.out.println("Error : Insert more amount");
			return;
		}
		
		machine.setCurrrentAmount(amount);
		machine.setCurrentState(machine.getHasAmount());
		System.out.println("Amount inserted successfully");
	}

	@Override
	public DeliveryResponse deliver() {
		// TODO Auto-generated method stub
		System.out.println("Error : Please insert money to get the item");
		return null;
	}

}
