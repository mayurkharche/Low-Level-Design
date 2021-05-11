package com.bookmyshow.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bookmyshow.constant.Genre;

public class Movie {
	
	private int movieId;
	private String movieName;
	private int durationInMin;
	private String language;
	private Genre genre;
	private Date releaseDate;
	
	private Map<String, List<Show>> cityShowMap;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getDurationInMin() {
		return durationInMin;
	}

	public void setDurationInMin(int durationInMin) {
		this.durationInMin = durationInMin;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Map<String, List<Show>> getCityShowMap() {
		return cityShowMap;
	}

	public void setCityShowMap(Map<String, List<Show>> cityShowMap) {
		this.cityShowMap = cityShowMap;
	}
}
