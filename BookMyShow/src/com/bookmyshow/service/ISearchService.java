package com.bookmyshow.service;

import java.util.Date;
import java.util.List;

import com.bookmyshow.constant.Genre;
import com.bookmyshow.model.Movie;

public interface ISearchService {

	List<Movie> searchMoviesbyName(String name);
	List<Movie> searchMovieByGenre(Genre genre);
	List<Movie> searchMoviesByLanguage(String language);
	List<Movie> searchMoviesByDate(Date date);
}
