package com.bookmyshow.service;

import com.bookmyshow.model.Movie;
import com.bookmyshow.model.Show;

public interface IAdminService {
	
	boolean addMovie(Movie movie);
	boolean addShow(Show show);

}
