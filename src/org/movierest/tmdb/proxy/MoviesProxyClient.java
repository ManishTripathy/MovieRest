package org.movierest.tmdb.proxy;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.movierest.api.MovieHitResult;

@Path("movie")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public interface MoviesProxyClient {
	final String apiKey = "2849d8294a494d526134ef8dd0726e7e";

	@GET
	@Path("/now_playing")
	public List<MovieHitResult> getMovieByPage(@QueryParam("page")@DefaultValue("1") Integer page, @QueryParam("api_key") @DefaultValue(apiKey) String apiKey);
}
