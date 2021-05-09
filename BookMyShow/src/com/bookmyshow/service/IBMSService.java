package com.bookmyshow.service;

import java.util.Date;
import java.util.List;

import com.bookmyshow.model.CinemaHall;
import com.bookmyshow.model.Movie;

public interface IBMSService {
	
	List<Movie> getMovieList(Date date, String city);
	List<CinemaHall> getCinemaHalls(String city);

}
