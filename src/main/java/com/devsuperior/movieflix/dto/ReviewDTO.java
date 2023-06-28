package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.User;

public class ReviewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String text;
	private User user;
	
	public ReviewDTO() {
	}
	
	public ReviewDTO(Long id, String title, String subTitle, Integer year, String imgUrl) {
		this.id = id;

	}
	
	public ReviewDTO(Movie entity) {
		id = entity.getId();

	}

	
}
