package com.vending.machine;
import java.util.HashSet;
import java.util.Set;


public class CostUtility {
	
	private static Set<Integer> costSet;
	private static Set<String> currencySet;
	
	static{
		
		costSet = new HashSet<>();
		costSet.add(10);
		costSet.add(20);
		costSet.add(50);
		costSet.add(100);
		costSet.add(200);
		
		currencySet = new HashSet<>();
		currencySet.add("Rupees");
	}
	
	public static boolean validataCost(int cost){
		
		if(costSet.contains(cost)){
			return true;
		}
		
		return false;
		
	}
	
	public static boolean validateCurrency(String currency){
		
		if(currencySet.contains(currency)){
			return true;
		}
		
		return false;
	}

}
