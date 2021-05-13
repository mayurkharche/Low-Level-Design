package com.atm.service;

import com.atm.model.Amount;

public interface ICashDispenserService {
	
	Double getAvailableCash();
	boolean isAmountAvailable(Amount amount);
	void dipenseAmount(Amount amount);
}
