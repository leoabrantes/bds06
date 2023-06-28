package com.devsuperior.movieflix.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.GenreRepository;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {

	private static Logger logger = LoggerFactory.getLogger(MovieService.class);

	@Autowired
	private MovieRepository repository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
		
	@Autowired
	private GenreRepository GenreRepository;

	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Optional<Movie> obj = repository.findById(id);
		Movie entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new MovieDTO(entity);
	}

//	public MovieDTO findMovie() {
//		Movie Movie = (Movie) loadMovieByMoviename(authService.authenticated().getMoviename());
//		return new MovieDTO(Movie);
//	}
//
//	@Override
//	public MovieDetails loadMovieByMoviename(String Moviename) throws MovienameNotFoundException {
//		Movie Movie = repository.findByEmail(Moviename);
//		if (Movie == null) {
//			logger.error("Movie not found: " + Moviename);
//			throw new MovienameNotFoundException("Email not found");
//		}
//		logger.info("Movie found: " + Moviename);
//		return Movie;
//	}

}
