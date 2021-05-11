package com.shopping.website.model;

import java.util.Date;
import java.util.List;

import com.shopping.website.service.impl.NotificationService;

public class Order {
	
	int orderId;
	List<Item> orderItem;
	Double orderValue;
	Buyer buyer;
	Date orderDate;
	NotificationService notificationService;
	
	List<OrderLog> orderLog;

}
