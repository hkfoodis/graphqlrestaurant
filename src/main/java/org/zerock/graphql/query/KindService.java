package org.zerock.graphql.query;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.graphql.model.Kind;
import org.zerock.graphql.model.RestaurantInfo;

@Service
public class KindService {

	@Autowired
	private RestaurantService restaurantService;
	
	public List<RestaurantInfo> restaurants = new ArrayList<>();
	
	public KindService(RestaurantService restaurantService) {
	}
	
	public Kind lookupKind(String code) {
		restaurants = restaurantService.restaurants(code);
		Kind kind1 = new Kind(code);
		kind1.setRestaurants(restaurants.stream()
				.filter(restaurant -> restaurant.getKind().getKind_code().equals(kind1.getKind_code()))
				.collect(Collectors.toList()));
		
		return kind1;
	}
}