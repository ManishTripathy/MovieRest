package org.movierest.service.impl;

import java.util.List;

import org.movierest.api.MovieHitResult;
import org.movierest.service.MovieService;
import org.movierest.tmdb.proxy.MoviesProxyClient;
import org.movierest.tmdb.proxy.factory.MoviesProxyClientFactory;

public class MovieServiceImpl implements MovieService {

	private final MoviesProxyClient client;
	public MovieServiceImpl() {
		client = MoviesProxyClientFactory.createClient("https://api.themoviedb.org/3/");
	}
	

	@Override
	public List<MovieHitResult> getMoviesByPage(Integer page) {
		return client.getMovieByPage(page, null);
	}
}
