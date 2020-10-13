package org.zerock.graphql.query;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.graphql.entity.Restaurant;
import org.zerock.graphql.model.Kind;
import org.zerock.graphql.model.RestaurantInfo;
import org.zerock.graphql.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepository;
	
	public RestaurantInfo restaurant(String name) {
		RestaurantInfo restaurantInfo;
		Restaurant restaurant;
		
		restaurant = restaurantRepository.findRestaurant(name);
		
		restaurantInfo = new RestaurantInfo(restaurant);
		
		return restaurantInfo;
	}
	
	public List<RestaurantInfo> findAll(){
		List<RestaurantInfo> restaurantsInfo1 = new ArrayList<>();
		List<Restaurant> restaurants = new ArrayList<>();
		restaurants = restaurantRepository.findAll();
		
		for(int i=0; i<restaurants.size(); i++) {
			restaurantsInfo1.add(new RestaurantInfo(restaurants.get(i)));
		}
		
		return restaurantsInfo1;
	}
	public List<RestaurantInfo> restaurants(String code){
		List<RestaurantInfo> restaurantsInfo = new ArrayList<>();
		List<Restaurant> restaurants = new ArrayList<>();
		restaurants = restaurantRepository.findbyKind_code(code);
		
		for(int i=0; i<restaurants.size(); i++) {
			restaurantsInfo.add(new RestaurantInfo(restaurants.get(i), new Kind(code)));
		}
		
		return restaurantsInfo;
	}
}
