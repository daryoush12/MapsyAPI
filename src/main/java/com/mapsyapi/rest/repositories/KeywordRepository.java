package com.mapsyapi.rest.repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.mapsyapi.rest.models.Keyword;

public interface KeywordRepository extends MongoRepository<Keyword, String> {
	List<Keyword>findByLabel(String label);
}
