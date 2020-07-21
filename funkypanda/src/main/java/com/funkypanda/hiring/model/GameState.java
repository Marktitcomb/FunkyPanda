package com.funkypanda.hiring.model;

public class GameState {

	public GameState() {
	}

	public GameState(boolean open, int lastResult, int numberOfMembers, long lastResultTime) {
		this.open = open;
		this.lastResult = lastResult;
		this.numberOfMembers = numberOfMembers;
		this.lastResultTime = lastResultTime;
	}

	private boolean open;
	private int lastResult;
	private int numberOfMembers;
	private long lastResultTime;

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public int getLastResult() {
		return lastResult;
	}

	public void setLastResult(int lastResult) {
		this.lastResult = lastResult;
	}

	public int getNumberOfMembers() {
		return numberOfMembers;
	}

	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

	public long getLastResultTime() {
		return lastResultTime;
	}

	public void setLastResultTime(long lastResultTime) {
		this.lastResultTime = lastResultTime;
	}
}
