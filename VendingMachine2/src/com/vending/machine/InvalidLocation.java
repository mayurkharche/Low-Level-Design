package com.vending.machine;

public class InvalidLocation extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidLocation(String message) {
		super(message);
	}

}
