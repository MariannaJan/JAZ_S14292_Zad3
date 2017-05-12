package main.java.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import main.java.domain.Film;
import main.java.domain.services.FilmService;



@Path("/films")
public class FilmResources {

private FilmService db = new FilmService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Film> getAll(){
		return db.getAll();
	}
	
}
