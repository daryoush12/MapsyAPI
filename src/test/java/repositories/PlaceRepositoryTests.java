package repositories;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.mapsyapi.rest.models.Place;
import com.mapsyapi.rest.repositories.PlaceRepository;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class PlaceRepositoryTests {
	
	   @Autowired PlaceRepository repository;

	    @SuppressWarnings("deprecation")
		@Test
	    public void readsFirstPageCorrectly() {

	      Page<Place> places = repository.findAll(PageRequest.of(0, 10));
	     
	      Assert.assertTrue(places.isFirst());
	    }
}
