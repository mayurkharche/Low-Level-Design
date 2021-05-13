package com.atm.service;

import com.atm.model.CardInfo;
import com.atm.model.Customer;
import com.atm.model.Transaction;

public interface IBankService {

	Boolean isValidUser(String pin, CardInfo cardinfo);
	Customer getCustomerDetails(CardInfo cardInfo);
	Transaction executeTransaction(Transaction transaction);
}
