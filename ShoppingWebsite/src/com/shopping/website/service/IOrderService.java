package com.shopping.website.service;

import com.shopping.website.constant.OrderStatus;
import com.shopping.website.constant.PaymentStatus;
import com.shopping.website.constant.PaymentType;
import com.shopping.website.model.Order;
import com.shopping.website.model.OrderLog;

public interface IOrderService {

	OrderStatus placeOrder(Order order);
	OrderStatus trackOrder(int orderId);
	boolean addOrderLog(OrderLog orderLog, int orderId);
	PaymentStatus makePayment(PaymentType paymentType);
}
