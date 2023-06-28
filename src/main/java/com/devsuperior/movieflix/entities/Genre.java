package com.devsuperior.movieflix.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_genre")
public class Genre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "genre")
	private Set<Movie> movies = new HashSet<>();
	
	
	public Genre() {
	}

	public Genre(Long id, String name, Set<Movie> movies) {
		super();
		this.id = id;
		this.name = name;
		this.movies = movies;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Set<Movie> getMovies() {
		return movies;
	}



	public void setMovie(Set<Movie> movie) {
		this.movies = movie;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, movies, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genre other = (Genre) obj;
		return Objects.equals(id, other.id) && Objects.equals(movies, other.movies) && Objects.equals(name, other.name);
	}
	
	

}
