package com.shopping.website.service;

import java.util.List;

import com.shopping.website.constant.ProductCategory;
import com.shopping.website.model.Product;

public interface ISearchService {

	List<Product> searchByName(String name);
	List<Product> searchByCategory(ProductCategory productCategory);
}
