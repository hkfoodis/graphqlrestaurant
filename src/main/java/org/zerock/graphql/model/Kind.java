package org.zerock.graphql.model;

import java.util.List;

public class Kind {

	private String kind_code;
	private List<RestaurantInfo> restaurants;
	
	public Kind(final String kind_code, final List<RestaurantInfo> restaurants) {
		this.kind_code = kind_code;
		this.restaurants = restaurants;
	}
	
	public Kind(final String kind_code) {
		this.kind_code = kind_code;
	}
	
	public Kind() {
		
	}
	
	public String getKind_code() {
		return kind_code;
	}
	
	public void setKind_code(String kind_code) {
		this.kind_code = kind_code;
	}
	
	public List<RestaurantInfo> getRestaurants(){
		return restaurants;
	}
	
	public void setRestaurants(final List<RestaurantInfo> restaurants) {
		this.restaurants = restaurants;
	}
}