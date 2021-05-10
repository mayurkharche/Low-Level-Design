package com.vending.machine;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		
		
		Machine machine = new Machine();
		
		ArrayList<ArrayList<Item>> itemGrid = new ArrayList<>();
		
		for(int i=0;i<5;i++){
			
			ArrayList<Item> temp = new ArrayList<>();
			
			for(int j=0;j<5;j++){
				
				Price price = new Price("Rupees", 10);
				char ch = (char) (i+'A');
				temp.add(new Item(""+i+j,price,10));
			}
			
			itemGrid.add(temp);
		}
		
		machine.insertItemsInMachine(itemGrid);
		
		machine.provideLocation("B3");
		machine.insertMoney(new Price("Rupees", 20));
		machine.deliver();
	}
}
