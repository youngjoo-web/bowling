package com.gdu.bowling.vo;

public class BowlingScore {
	private String userName;
	private int score;
	private String lastUpdate;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "BowlingScore [userName=" + userName + ", score=" + score + ", lastUpdate=" + lastUpdate + "]";
	}
	
	
}
