package com.shopping.website.service;

import com.shopping.website.model.MessageAttribute;

public interface INotification {

	boolean sendNotification(MessageAttribute messageAttribute);
}
