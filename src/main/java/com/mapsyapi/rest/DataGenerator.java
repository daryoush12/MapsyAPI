package com.mapsyapi.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mapsyapi.rest.models.Coordinates;
import com.mapsyapi.rest.models.Keyword;
import com.mapsyapi.rest.models.Openings;
import com.mapsyapi.rest.models.Place;
import com.mapsyapi.rest.repositories.KeywordRepository;
import com.mapsyapi.rest.repositories.PlaceRepository;

@Component
public class DataGenerator implements CommandLineRunner {

	@Autowired
	private PlaceRepository repository;
	
	@Autowired
	private KeywordRepository keyrepo;
	
	List<Place> keyPlaces;
	

	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Place place = new Place("Bear Coffee", "Quiet and relaxing coffee shop with nothing but the best coffee.", 
				new Coordinates(25, 50), new Openings(8, 20));
		Place place1 = new Place("Bear Burgers", "Greasiest burgers you can find around.", 
				new Coordinates(15, 70), new Openings(8, 20));
		Place place2 = new Place("Fake It Market", "For your everyday needs and requirements to be fufilled.", 
				new Coordinates(75, 10), new Openings(8, 20));
		
		
		
	
		
		this.repository.deleteAll();
		this.keyrepo.deleteAll();
		
		List<Place> places = Arrays.asList(place, place1, place2);
		this.repository.saveAll(places);
		
		
		keyPlaces = Arrays.asList(place1, place2);
		Keyword word = new Keyword("finland", keyPlaces);
		this.keyrepo.save(word);
		
		
	}

}
