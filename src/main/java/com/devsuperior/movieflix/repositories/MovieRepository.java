package com.devsuperior.movieflix.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.movieflix.entities.Movie;

public interface MovieRepository extends JpaRepository <Movie, Long> {

//	@Query(nativeQuery = true, value = "SELECT movie.*, genre.* "
//			+ "FROM movie "
//			+ "INNER JOIN genre ON movie.genre_id = genre.id "
//			+ "WHERE movie.id = ? ")
//	
//	List<MovieGenreProjection> search1();
//	
	
}
