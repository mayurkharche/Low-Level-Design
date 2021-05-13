package com.atm.service;

import com.atm.model.CardInfo;

public interface IBankServiceFactory {

	IBankService getBankService(CardInfo cardinfo);
}
