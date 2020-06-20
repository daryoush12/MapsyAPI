package repositories;



import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mapsyapi.rest.models.Place;
import com.mapsyapi.rest.repositories.PlaceRepository;




@SpringBootTest
public class PlaceRepositoryTests {
	
	   @Autowired PlaceRepository repository;

		@Test
	    public void readsFirstPageCorrectly() {

	      List<Place> places = repository.findAll();
	      assertTrue(!places.isEmpty());
	      
	    }
}
