package com.bookmyshow.model;

import java.util.List;

public class Audi {

	private int audiId;
	private String audiName;
	private int totalSeat;
	private List<Show> shows;
	public int getAudiId() {
		return audiId;
	}
	public void setAudiId(int audiId) {
		this.audiId = audiId;
	}
	public String getAudiName() {
		return audiName;
	}
	public void setAudiName(String audiName) {
		this.audiName = audiName;
	}
	public int getTotalSeat() {
		return totalSeat;
	}
	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	public List<Show> getShows() {
		return shows;
	}
	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
	
	
}
