package com.mapsyapi.rest.models;



public class Openings {
	
	long From;
	long To;
	
	
	public Openings(long from, long to) {
		this.From = from;
		this.To = to;

	}
	
	public Openings() {
		
	}


	public long getFrom() {
		return From;
	}


	public void setFrom(long dateFrom) {
		this.From = dateFrom;
	}


	public long getTo() {
		return To;
	}


	public void setTo(long dateTo) {
		this.To = dateTo;
	}
	
	
}
