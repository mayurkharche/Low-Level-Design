package com.shopping.website.service;

import com.shopping.website.model.Account;
import com.shopping.website.model.Guest;

public interface IAccountService {
	
	Account createNewAccount(Guest guest);

}
