package com.atm.model;

import java.util.Date;

import com.atm.constant.CardStatus;
import com.atm.constant.CardType;

public class CardInfo {

	CardType cardType;
	Bank bank;
	String cardNumber;
	Date expiryDate;
	int cvv;
	Double withdrawlLimit;
	
	CardStatus cardStatus;
}
