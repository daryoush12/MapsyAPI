package com.mapsyapi.rest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mapsyapi.rest.models.Place;

public interface PlaceRepository extends MongoRepository<Place, String> {

	Place findByTitle(String title);

	Place findByDescription(String description);
	
	

}
