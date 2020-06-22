package com.mapsyapi.rest.models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "mapsy-places")
public class Place {

	@Id
	@JsonProperty("_id")
	private String id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("description")
	private String description;
	@JsonProperty("coordinates")
	private Coordinates coordinates;
	
	@JsonProperty("open_hours")
	private Openings openings;
	
	public String getTitle() {
		return title;
	}

	public String getId() {
		return this.id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	
	

	public Openings getOpenings() {
		return openings;
	}

	public void setOpenings(Openings openings) {
		this.openings = openings;
	}

	public Place(String title, String description, Coordinates coordinates) {
		super();
		this.title = title;
		this.description = description;
		this.coordinates = coordinates;
	}
	
	public Place(String id, String title, String description, Coordinates coordinates) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.coordinates = coordinates;
	}
	
	

	public Place(String title, String description, Coordinates coordinates, Openings openings) {
		super();
		this.title = title;
		this.description = description;
		this.coordinates = coordinates;
		this.openings = openings;
	}

	public Place() {
	}
	
}
