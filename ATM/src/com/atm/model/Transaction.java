package com.atm.model;

import java.util.Date;

public class Transaction {

	Integer transactionId;
	String sourceAccountNumber;
	Date transactionTs;
	
	Customer customer;
}
