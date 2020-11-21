package org.zerock.graphql.repository;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.graphql.entity.Restaurant;

@Transactional
@Repository
public class RestaurantRepository {

	@Autowired
    private SessionFactory sessionFactory;
	
	public Restaurant findRestaurant(String name) {
		try {
			String sql = "Select e from " + Restaurant.class.getName() + " e where e.company_code =: company_code";
			
			Session session = this.sessionFactory.getCurrentSession();
			Query<Restaurant> query = session.createQuery(sql, Restaurant.class);
			query.setParameter("company_code", name);
			return (Restaurant) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<Restaurant> findbyKind_code(String code) {
		try {
			String sql = "Select e from " + Restaurant.class.getName() + " e where e.kind_code =: kind_code";
			//String sql = "Select restaurant_name, restaurant_address, restaurant_phone, member_id from " + Restaurant.class.getName() + " e where e.kind_code =: kind_code";
			
			Session session = this.sessionFactory.getCurrentSession();
			Query<Restaurant> query = session.createQuery(sql, Restaurant.class);
			query.setParameter("kind_code", code);
			
			List<Restaurant> results = query.list();
			return results;
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<Restaurant> findbyKind_code1(String code) {
		try {
			String sql = "Select e from " + Restaurant.class.getName() + " e where e.kind_code =: kind_code";
			
			Session session = this.sessionFactory.getCurrentSession();
			Query<Restaurant> query = session.createQuery(sql, Restaurant.class);
			query.setParameter("kind_code", code);
			
			List<Restaurant> results = query.list();
			return results;
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<Restaurant> findAll() {
		try {
			String sql = "Select e from " + Restaurant.class.getName() + " e ";
			
			Session session = this.sessionFactory.getCurrentSession();
			Query<Restaurant> query = session.createQuery(sql, Restaurant.class);
			
			List<Restaurant> results = query.list();
	        return results;
		} catch (NoResultException e) {
			return null;
		}
	}
}
