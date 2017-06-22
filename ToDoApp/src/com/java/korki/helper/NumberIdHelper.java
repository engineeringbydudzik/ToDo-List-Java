package com.java.korki.helper;

public class NumberIdHelper {
	
	private long idCounter;

	public NumberIdHelper() {
		idCounter = 0;
	}
	
	public NumberIdHelper(long idCounter) {
		this.idCounter = idCounter;
	}

	public long getIdCounter() {
		return idCounter++;
	}

}
