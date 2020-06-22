package com.mapsyapi.rest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mapsyapi.rest.excpetion.PlaceResourceNotFound;
import com.mapsyapi.rest.models.Place;
import com.mapsyapi.rest.repositories.PlaceRepository;

@RestController
@CrossOrigin(origins = {"https://quiet-dawn-43151.herokuapp.com", 
		"http://localhost:3000"})
@RequestMapping("/places")
public class PlaceController {

	@Autowired
	private PlaceRepository repo;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Place> AllPlaces() {

		List<Place> places = this.repo.findAll();
		return places;
	}

	@RequestMapping(value = "/title", method = RequestMethod.GET)
	public Place PlaceByTitle(@RequestParam String title) {
		Place result = this.repo.findByTitle(title);
		return result;
	}

	@RequestMapping(value = "/description", method = RequestMethod.GET)
	public Place PlaceByDescription(@RequestParam String desc) {
		Place result = this.repo.findByDescription(desc);
		return result;
	}
	
	@RequestMapping(value = "/all/search", method = RequestMethod.GET)
	public List<Place> PlacesBySearchValue(@RequestParam String value){
		if(value == ""){
			List<Place> result = this.repo.findAll();
			return result;
		}else {
			List<Place> result = this.repo.findByTitleLikeIgnoreCase(value);
			return result;
		}
		
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public void deletePlaceById(@RequestParam String id) throws PlaceResourceNotFound {

		if (this.repo.existsById(id)) {
			this.repo.deleteById(id);
		} else
			throw new PlaceResourceNotFound("Place by that id was not found");

	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT,  consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updatePlace(@RequestBody Place place) throws PlaceResourceNotFound {
		if(this.repo.existsById(place.getId()))
				this.repo.save(place);
		else throw new PlaceResourceNotFound("Place by that id was not found");
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addNewPlace(@RequestBody Place place) {
			this.repo.save(place);
	}
}
