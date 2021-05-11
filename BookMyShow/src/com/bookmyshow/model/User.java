package com.bookmyshow.model;

import com.bookmyshow.service.ISearchService;

public class User {

	private int userId;
	private ISearchService search;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public ISearchService getSearch() {
		return search;
	}
	public void setSearch(ISearchService search) {
		this.search = search;
	}
}
