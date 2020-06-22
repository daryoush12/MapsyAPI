package com.mapsyapi.rest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mapsyapi.rest.models.Keyword;
import com.mapsyapi.rest.repositories.KeywordRepository;

@RestController
@CrossOrigin(origins = {"https://quiet-dawn-43151.herokuapp.com", 
		"http://localhost:3000"})
@RequestMapping("/keywords")
public class KeywordController {
	
	@Autowired
	private KeywordRepository repository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Keyword> getAll() {
		List<Keyword> words = repository.findAll();
		return words;
	}
	
	@RequestMapping(value="/search", method = RequestMethod.GET)
	public List<Keyword> getBySearchValue(@RequestParam String label){
		return repository.findByLabel(label);
	}

}
