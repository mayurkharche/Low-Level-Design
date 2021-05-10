package com.vending.machine;

import java.util.ArrayList;

public class Machine {
	
	private ArrayList<ArrayList<Item>> itemGrid;
	
	private MachineState currentState;
	
	private MachineState idle;
	private MachineState noItems;
	private MachineState hasLocation;
	private MachineState hasAmount;
	
	private Item currentItem;
	private Price currrentAmount;
	
	private int itemCount;
	
	Machine(){
		
		this.idle = new IdleState(this);
		this.noItems = new NoItemsState(this);
		this.hasLocation = new HasLocationState(this);
		this.hasAmount = new HasAmountState(this);
		
		currentState = noItems;
	}
	
	public void insertItemsInMachine(ArrayList<ArrayList<Item>> itemGrid){
		
		currentState.insertItems(itemGrid);
		
		for(int i=0;i<itemGrid.size();i++){
			for(int j=0;j<itemGrid.get(0).size();j++){
				if(null != itemGrid.get(i).get(j)){
					itemCount++;
				}
			}
		}
	}
	
	public void provideLocation(String location){
		
		currentState.provideLocation(location);
	}
	
	public void insertMoney(Price amount){
		
		currentState.insertMoney(amount);
	}
	
	public DeliveryResponse deliver(){
		
		return currentState.deliver();
	}

	public ArrayList<ArrayList<Item>> getItemGrid() {
		return itemGrid;
	}

	public void setItemGrid(ArrayList<ArrayList<Item>> itemGrid) {
		this.itemGrid = itemGrid;
	}

	public MachineState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(MachineState currentState) {
		this.currentState = currentState;
	}

	public MachineState getIdle() {
		return idle;
	}

	public MachineState getNoItems() {
		return noItems;
	}

	public MachineState getHasLocation() {
		return hasLocation;
	}

	public MachineState getHasAmount() {
		return hasAmount;
	}

	public Item getCurrentItem() {
		return currentItem;
	}

	public void setCurrentItem(Item currentItem) {
		this.currentItem = currentItem;
	}

	public Price getCurrrentAmount() {
		return currrentAmount;
	}

	public void setCurrrentAmount(Price currrentAmount) {
		this.currrentAmount = currrentAmount;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
}
