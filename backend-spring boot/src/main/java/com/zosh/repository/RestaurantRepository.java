package com.zosh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zosh.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> { //entity,id

	@Query("SELECT r FROM Restaurant r WHERE lower(r.name) LIKE lower(concat('%', :query, '%')) OR lower(r.cuisineType) LIKE lower(concat('%', :query, '%'))")
	List<Restaurant> findBySearchQuery(String query); //seraching resturant
	//query will treat lower and uppercase as same so using query

	Restaurant findByOwnerId(Long userId);
	//query



}
