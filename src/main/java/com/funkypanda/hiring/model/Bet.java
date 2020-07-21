package com.funkypanda.hiring.model;

public class Bet {

	public Bet() {
	}

	public Bet(String playerId, int betAmount, String betType, int betTypeValue) {
		this.playerId = playerId;
		this.betAmount = betAmount;
		this.betType = betType;
		this.betTypeValue = betTypeValue;
	}

	private String playerId;
	private int betAmount;
	private String betType;
	private int betTypeValue;

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public int getBetAmount() {
		return betAmount;
	}

	public void setBetAmount(int betAmount) {
		this.betAmount = betAmount;
	}

	public String getBetType() {
		return betType;
	}

	public void setBetType(String betType) {
		this.betType = betType;
	}

	public int getBetTypeValue() {
		return betTypeValue;
	}

	public void setBetTypeValue(int betTypeValue) {
		this.betTypeValue = betTypeValue;
	}
}
