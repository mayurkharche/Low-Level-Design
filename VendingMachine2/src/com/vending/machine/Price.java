package com.vending.machine;

public class Price {

	private String currency;
	private int cost;
	public Price(String currency, int cost) {
		super();
		this.currency = currency;
		this.cost = cost;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		
		if(CostUtility.validateCurrency(currency))
			this.currency = currency;
		else
			throw new InvalidCurrencyException("Currency is not valid");
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		
		if(CostUtility.validataCost(cost))
			this.cost = cost;
		else
			throw new InvalidCostException("Cost is not valid");
	}
}
