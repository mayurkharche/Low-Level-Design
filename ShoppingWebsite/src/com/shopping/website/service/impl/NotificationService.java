package com.shopping.website.service.impl;

import com.shopping.website.constant.NotificationType;
import com.shopping.website.model.MessageAttribute;
import com.shopping.website.model.NotificationDomain;
import com.shopping.website.service.INotification;
import com.shopping.website.service.INotificationService;

public class NotificationService implements INotificationService{

	@Override
	public boolean sendNotification(NotificationDomain notificationDomain) {
		INotification notification;
		MessageAttribute messageAttribute;
		
		switch(notificationDomain.getNotificationType()) {
		
		case EMAIL : 
			notification = new EmailNotification();
			messageAttribute = new MessageAttribute("abc@abc.com", notificationDomain.getUser().getAccount().getEmail(), "Order Details for Email....");
			notification.sendNotification(messageAttribute);
			break;
		case SMS :
			notification = new SMSNotification();
			messageAttribute = new MessageAttribute("999999999999", notificationDomain.getUser().getAccount().getPhoneNumber(), "Order Details for SMS....");
			notification.sendNotification(messageAttribute);
			break;
		case WHATSAPP :
			notification = new WhatsAppNotification();
			messageAttribute = new MessageAttribute("999999999999", notificationDomain.getUser().getAccount().getPhoneNumber(), "Order Details for whatsapp....");
			notification.sendNotification(messageAttribute);
			break;
		case ALL :
			notification = new EmailNotification();
			messageAttribute = new MessageAttribute("abc@abc.com", notificationDomain.getUser().getAccount().getEmail(), "Order Details for Email....");
			notification.sendNotification(messageAttribute);
			notification = new SMSNotification();
			messageAttribute = new MessageAttribute("999999999999", notificationDomain.getUser().getAccount().getPhoneNumber(), "Order Details for SMS....");
			notification.sendNotification(messageAttribute);
			notification = new WhatsAppNotification();
			messageAttribute = new MessageAttribute("999999999999", notificationDomain.getUser().getAccount().getPhoneNumber(), "Order Details for whatsapp....");
			notification.sendNotification(messageAttribute);
			break;
		}
		return true;
	}
}
