package org.zerock.graphql.model;

import org.zerock.graphql.entity.Restaurant;

public class RestaurantInfo {

	private String company_code;
	private String member_id;
	private String restaurant_name;
	private String restaurant_address;
	private String restaurant_phone;
	private String restaurant_img;
	private String board_comment_code;
	private Integer star_avg_score;
	private Kind kind;
	
	public RestaurantInfo(Restaurant restaurant, final Kind kind) {
		this.company_code = restaurant.getCompany_code();
		this.member_id = restaurant.getMember_id();
		this.restaurant_name = restaurant.getRestaurant_name();
		this.restaurant_address = restaurant.getRestaurant_address();
		this.restaurant_phone = restaurant.getRestaurant_phone();
		this.restaurant_img = restaurant.getRestaurant_img();
		this.board_comment_code = restaurant.getBoard_comment_code();
		this.star_avg_score = restaurant.getStar_avg_score();
		this.kind = kind;
	}
	
	public RestaurantInfo(Restaurant restaurant) {
		this.company_code = restaurant.getCompany_code();
		this.member_id = restaurant.getMember_id();
		this.restaurant_name = restaurant.getRestaurant_name();
		this.restaurant_address = restaurant.getRestaurant_address();
		this.restaurant_phone = restaurant.getRestaurant_phone();
		this.restaurant_img = restaurant.getRestaurant_img();
		this.board_comment_code = restaurant.getBoard_comment_code();
		this.star_avg_score = restaurant.getStar_avg_score();
	}
	
	public RestaurantInfo() {
		
	}
	
	public String getCompany_code() {
		return company_code;
	}
	
	public void setCompnay_code(String company_code) {
		this.company_code = company_code;
	}
	
	public String getMember_id() {
		return member_id;
	}
	
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getRestaurant_name() {
		return restaurant_name;
	}
	
	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}
	
	public String getRestaurant_address() {
		return restaurant_address;
	}
	
	public void setRestaurant_address(String restaurant_address) {
		this.restaurant_address = restaurant_address;
	}
	
	public String getRestaurant_phone() {
		return restaurant_phone;
	}
	
	public void setRestaurant_phone(String restaurant_phone) {
		this.restaurant_phone = restaurant_phone;
	}
	
	public String getRestaurant_img() {
		return restaurant_img;
	}
	
	public void setRestaurant_img(String restaurant_img) {
		this.restaurant_img = restaurant_img;
	}
	
	public String getBoard_comment_code() {
		return board_comment_code;
	}
	
	public void setBoard_comment_code(String board_comment_code) {
		this.board_comment_code = board_comment_code;
	}
	
	public Integer getStar_avg_score() {
		return star_avg_score;
	}
	
	public void setStar_avg_score(Integer star_avg_score) {
		this.star_avg_score = star_avg_score;
	}
	
	public Kind getKind() {
		return kind;
	}
	
	public void setKind(Kind kind) {
		this.kind = kind;
	}
}
