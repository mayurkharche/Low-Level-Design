package com.bookmyshow.service.impl;

import java.util.Date;
import java.util.List;

import com.bookmyshow.model.CinemaHall;
import com.bookmyshow.model.Movie;
import com.bookmyshow.service.IBMSService;

public class BMSService implements IBMSService{
	
	List<CinemaHall> cinemas;

	@Override
	public List<Movie> getMovieList(Date date, String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CinemaHall> getCinemaHalls(String city) {
		// TODO Auto-generated method stub
		return null;
	}
}
