package com.funkypanda.hiring;

import com.funkypanda.hiring.model.CreateGameResponse;
import com.funkypanda.hiring.model.GameState;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

@Path("/game")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RouletteResource {

	@POST
	@Path("/create")
	public CreateGameResponse createGame(@QueryParam("playerId") String player1) {
		throw new WebApplicationException(Status.NOT_IMPLEMENTED);
	}

	@GET
	@Path("/{gameId}")
	public GameState getGame(@PathParam("gameId") String gameId) {
		throw new WebApplicationException(Status.NOT_IMPLEMENTED);
	}
}