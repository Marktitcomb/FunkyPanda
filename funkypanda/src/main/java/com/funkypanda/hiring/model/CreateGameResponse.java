package com.funkypanda.hiring.model;

public class CreateGameResponse {

	public CreateGameResponse() {
	}

	public CreateGameResponse(String gameId) {
		this.gameId = gameId;
	}

	private String gameId;

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
}
