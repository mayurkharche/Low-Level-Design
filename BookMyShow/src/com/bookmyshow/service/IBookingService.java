package com.bookmyshow.service;

import com.bookmyshow.model.Payment;

public interface IBookingService {
	
	boolean makePayment(Payment payment);

}
