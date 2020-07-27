package com.gdu.bowling.vo;

public class BowlingScore {
	private int playerNo;
	private String playerName;
	private int playerScore;
	private String playerDate;
	public int getPlayerNo() {
		return playerNo;
	}
	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}
	public String getPlayerDate() {
		return playerDate;
	}
	public void setPlayerDate(String playerDate) {
		this.playerDate = playerDate;
	}
	@Override
	public String toString() {
		return "BowlingScore [playerNo=" + playerNo + ", playerName=" + playerName + ", playerScore=" + playerScore
				+ ", playerDate=" + playerDate + "]";
	}
	
	
}
