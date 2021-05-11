package com.shopping.website.model;

import java.util.List;

import com.shopping.website.constant.AccountStatus;

public class Account {

	String name;
	String email;
	String phoneNumber;
	String username;
	String password;
	
	List<Address> shippingAddress;
	
	AccountStatus accountStatus;
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
