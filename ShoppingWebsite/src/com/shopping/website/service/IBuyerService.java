package com.shopping.website.service;

import com.shopping.website.constant.OrderStatus;
import com.shopping.website.model.Buyer;
import com.shopping.website.model.ProductReview;
import com.shopping.website.model.ShoppingCart;

public interface IBuyerService {
	
	boolean addReview(ProductReview productReview, Buyer buyer);
	OrderStatus placeOrder(ShoppingCart shoppingCart, Buyer buyer);

}
