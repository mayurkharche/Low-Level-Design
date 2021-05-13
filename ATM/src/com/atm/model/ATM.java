package com.atm.model;

import com.atm.constant.CashType;
import com.atm.service.IBankService;
import com.atm.service.ICardReaderService;
import com.atm.service.ICashDepositService;
import com.atm.service.ICashDispenserService;
import com.atm.service.IChequeDepositService;
import com.atm.service.IKeypadService;
import com.atm.service.IScreenService;
import com.atm.service.impl.ATMsBankService;

public class ATM {
	
	String atmId;
	Address location;
	
	CashType defaultCashType;
	
	ICashDispenserService cashDispenserService;
	IScreenService screenService;
	IKeypadService keypadService;
	ICashDepositService cashDepositService;
	ICardReaderService cardReaderService;
	IChequeDepositService chequeDeposit;
	
	IBankService bankService;
	
	ATM(CashType cashType) {
		
		this.bankService = new ATMsBankService();
		this.defaultCashType = cashType;
	}
}
