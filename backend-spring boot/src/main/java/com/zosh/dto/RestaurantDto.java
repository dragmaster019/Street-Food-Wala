package com.zosh.dto;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.List;

@Data
@Embeddable //this property can be included in another class
public class RestaurantDto {
	
	private String title;


	@Column(length = 1000)
	private List<String> images;

	private String description;
	private Long id;
	

}
