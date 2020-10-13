package org.zerock.graphql.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESTAURANT")
public class Restaurant implements Serializable {

	private static final long serialVersionUID = -1000119078147252957L;
	
	@Id
	@Column(name = "Company_code", length = 20, nullable = false)
	private String company_code;
	
	@Column(name = "Member_id", length = 15, nullable = false)
	private String member_id;
	
	@Column(name = "Kind_code", length = 20, nullable = false)
	private String kind_code;
	
	@Column(name = "Restaurant_name", length = 50, nullable = false)
	private String restaurant_name;
	
	@Column(name = "Restaurant_address", length = 200, nullable = false)
	private String restaurant_address;
	
	@Column(name = "Restaurant_phone", length = 11, nullable = false)
	private String restaurant_phone;
	
	@Column(name = "Restaurant_img", length = 300)
	private String restaurant_img;
	
	@Column(name = "Board_comment_code", length = 10)
	private String board_comment_code;
	
	@Column(name = "Star_avg_score")
	private Integer star_avg_score;
	
	public Restaurant() {
		
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
	
	public String getKind_code() {
		return kind_code;
	}
	
	public void setKind_code(String kind_code) {
		this.kind_code = kind_code;
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
}
