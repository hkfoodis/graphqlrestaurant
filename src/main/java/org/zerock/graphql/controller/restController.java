package org.zerock.graphql.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.graphql.entity.Restaurant;
import org.zerock.graphql.repository.RestaurantRepository;

@RestController
@Transactional
public class restController {

	@Autowired
	protected RestaurantRepository restaurantRepository;
	
	@InitBinder
	public void myInitBinder(WebDataBinder dataBinder) {
	   Object target = dataBinder.getTarget();
	   if (target == null) {
	      return;
	   }
	   System.out.println("Target=" + target); 
	}
	
	@RequestMapping(value="/restaurants/{kind_code}", method = RequestMethod.GET)
	public @ResponseBody
	 List<Restaurant> getRestaurants(@PathVariable String kind_code) {
		
		List<Restaurant> restaurantList = restaurantRepository.findbyKind_code1(kind_code);
		
		return restaurantList;
	}
}
