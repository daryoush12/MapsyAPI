package com.mapsyapi.rest.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;


@Document(collection = "keywords")
public class Keyword {

	@Id
	@JsonProperty("_id")
	private String id;
	@JsonProperty("label")
	private String label;
	@JsonProperty("associated_places")
	@DBRef
	private List<Place> associated_places;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public List<Place> getAssociated_places() {
		return associated_places;
	}
	public void setAssociated_places(List<Place> associated_places) {
		this.associated_places = associated_places;
	}
	
	public Keyword() {}
	
	public Keyword(String label, List<Place> associated_places) {
		super();
		this.label = label;
		this.associated_places = associated_places;
	}
	
	
	
	
	
}
