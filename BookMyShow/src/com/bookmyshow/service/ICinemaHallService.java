package com.bookmyshow.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bookmyshow.model.Movie;
import com.bookmyshow.model.Show;

public interface ICinemaHallService {
	
	Map<Date, List<Movie>> getMovies(List<Date> datelist);
	Map<Date, List<Show>> getShow(List<Date> dateList);

}
