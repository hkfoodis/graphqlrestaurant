package org.zerock.graphql.query;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.zerock.graphql.entity.Restaurant;
import org.zerock.graphql.model.RestaurantInfo;
import org.zerock.graphql.repository.RestaurantRepository;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {
	
	private final RestaurantService restaurantService;
	
	public Query(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
	
	public List<RestaurantInfo> restaurants() {
		List<RestaurantInfo> result = new ArrayList<>();
		
		result = restaurantService.findAll();
		
		return result;
	}
	
	public RestaurantInfo restaurant(String name) {
		
		return restaurantService.restaurant(name);
	}
}