package com.mycompany.day4;

public class Speaker {

	private int minVolLevel;
	private int maxVolLevel;

	public Speaker() {
		this.minVolLevel = 0; 
		this.maxVolLevel = 30;
	}

	public final int getMinVolLevel() {
		return minVolLevel;
	}

	public final void setMinVolLevel(int minVolLevel) {
		this.minVolLevel = minVolLevel;
	}

	public final int getMaxVolLevel() {
		return maxVolLevel;
	}

	public final void setMaxVolLevel(int maxVolLevel) {
		this.maxVolLevel = maxVolLevel;
	}

}