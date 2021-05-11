package com.shopping.website.service;

import com.shopping.website.model.NotificationDomain;

public interface INotificationService {

	boolean sendNotification(NotificationDomain notificationDomain);
}
