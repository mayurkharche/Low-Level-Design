package com.shopping.website.model;

import java.util.List;

import com.shopping.website.constant.ProductCategory;

public class Product {
	
	int productId;
	String productDesc;
	String name;
	ProductCategory productCategory;
	Seller seller;
	Double cost;
	
	List<ProductReview> productReviews;

}
