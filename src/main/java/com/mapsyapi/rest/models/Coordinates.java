package com.mapsyapi.rest.models;

public class Coordinates {

	private int longitude;
	private int latitude;

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public Coordinates(int longitude, int latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public Coordinates() {}
}
