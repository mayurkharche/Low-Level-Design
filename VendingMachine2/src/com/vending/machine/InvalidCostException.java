package com.vending.machine;

public class InvalidCostException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidCostException(String message) {
		super(message);
	}

}
