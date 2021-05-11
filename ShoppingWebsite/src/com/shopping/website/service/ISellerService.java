package com.shopping.website.service;

import com.shopping.website.model.Product;
import com.shopping.website.model.Seller;

public interface ISellerService {
	
	boolean addProduct(Product product, Seller seller);

}
