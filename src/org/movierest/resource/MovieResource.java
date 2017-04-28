package org.movierest.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.movierest.api.MovieHitResult;
import org.movierest.service.MovieService;
import org.movierest.service.impl.MovieServiceImpl;

@Path("/movies")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class MovieResource {
	
private MovieService movieService = new MovieServiceImpl();
	
	@GET
	public Response getAllBooks(@QueryParam("page") Integer page) {
		List<MovieHitResult> movies = movieService.getMoviesByPage(page);
		System.out.println(movies);
		return Response.ok().entity(movies).build();
	}
}
