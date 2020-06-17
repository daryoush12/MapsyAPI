package com.mapsyapi.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mapsyapi.rest.models.Coordinates;
import com.mapsyapi.rest.models.Place;
import com.mapsyapi.rest.repositories.PlaceRepository;

@Component
public class DataSeeder implements CommandLineRunner {

	
	private PlaceRepository repository;
	
	public DataSeeder(PlaceRepository repository) {
		this.repository = repository;
	}
	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Place place = new Place("Bear Coffee", "Quiet and relaxing coffee shop with nothing but the best coffee.", new Coordinates(25, 50));
		Place place1 = new Place("Bob's Burgers", "Greasiest burgers you can find around.", new Coordinates(15, 70));
		Place place2 = new Place("Fake It Market", "For your everyday needs and requirements to be fufilled.", new Coordinates(75, 10));
		
		
		this.repository.deleteAll();
		
		List<Place> places = Arrays.asList(place, place1, place2);
		this.repository.saveAll(places);
		
	}

}
