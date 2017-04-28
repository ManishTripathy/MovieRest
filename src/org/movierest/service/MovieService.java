package org.movierest.service;

import java.util.List;

import org.movierest.api.MovieHitResult;

public interface MovieService {
	
	public List<MovieHitResult> getMoviesByPage(Integer page);
	
}
