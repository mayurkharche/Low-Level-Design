package com.shopping.website.service;

import java.util.List;

import com.shopping.website.exception.CustomerNotFoundException;
import com.shopping.website.exception.ItemNotFoundException;
import com.shopping.website.model.Item;
import com.shopping.website.model.ShoppingCart;

public interface ICartService {

	ShoppingCart getShoppingCart(int customerId) throws CustomerNotFoundException;
	boolean addItemToCart(Item item, int customerId) throws CustomerNotFoundException;
	boolean removeItemFromCart(Item item, int customerId) throws CustomerNotFoundException, ItemNotFoundException;
	boolean updateItemInCart(Item item, int customerId) throws CustomerNotFoundException, ItemNotFoundException;
	List<Item> checkoutItems(ShoppingCart shoppingCart, int customerId) throws CustomerNotFoundException;
	List<Item> getItems(int customerId) throws CustomerNotFoundException;
	Double getCartValue(int customerId) throws CustomerNotFoundException;
}
