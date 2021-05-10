package com.vending.machine;

import java.util.ArrayList;

public class IdleState implements MachineState{
	
	private Machine machine;
	
	IdleState(Machine machine){
		this.machine = machine;
	}

	@Override
	public void insertItems(ArrayList<ArrayList<Item>> itemGrid) {
		
		machine.setItemGrid(itemGrid);
		
		if(null == itemGrid || itemGrid.size() == 0){
		
			machine.setCurrentState(machine.getNoItems());
			System.out.println("Items removed successfully");
		}else{
			
			System.out.println("Items inserted successfully");
		}
	}

	@Override
	public void provideLocation(String location) {

		if(location.length() != 2){
			throw new InvalidLocation("Location is not valid");
		}
		
		Item item = machine.getItemGrid().get(location.charAt(0) - 'A').get(Integer.parseInt(location.charAt(1)+""));
		machine.setCurrentItem(item);
		
		System.out.println("Item selected with name : " + item.getName());
		
		machine.setCurrentState(machine.getHasLocation());
	}

	@Override
	public void insertMoney(Price amount) {
		
		System.out.println("Error : Cannot insert the money before seleting the item. Please provide the location first");
		
	}

	@Override
	public DeliveryResponse deliver() {
		
		System.out.println("Error : Please select the location and insert the money to get the item delivered");
		return null;
	}

}
