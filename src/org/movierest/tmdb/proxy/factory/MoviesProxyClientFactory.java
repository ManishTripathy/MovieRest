package org.movierest.tmdb.proxy.factory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configuration;

import org.glassfish.jersey.client.proxy.WebResourceFactory;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.movierest.tmdb.proxy.MoviesProxyClient;


public class MoviesProxyClientFactory {
	
private MoviesProxyClientFactory() {
		
	}
	
	public static MoviesProxyClient createClient(String uri) {
		 Configuration configuration = new ResourceConfig()
         .packages("org.movierest.tmdb.proxy")
         .register(JacksonFeature.class);
		 
		 Client client = ClientBuilder.newClient(configuration);
	     WebTarget webTarget = client.target(uri);
	     MoviesProxyClient resource = WebResourceFactory.newResource(MoviesProxyClient.class, webTarget);
		 return resource;
	}

}
