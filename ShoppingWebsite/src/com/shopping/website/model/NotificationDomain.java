package com.shopping.website.model;

import com.shopping.website.constant.NotificationType;

public class NotificationDomain {
	
	String notificationID;
	NotificationType notificationType;
	User user;
	
	public NotificationType getNotificationType() {
		return this.notificationType;
	}
	
	public User getUser() {
		return this.user;
	}

}
