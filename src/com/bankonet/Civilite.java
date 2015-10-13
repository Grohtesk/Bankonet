package com.bankonet;

public enum Civilite {
	MONSIEUR("Monsieur"),
	MADAME("Madame"),
	MADEMOISELLE("Mademoiselle");
	
	private String string;
	
	private Civilite(String string) {
		// TODO Auto-generated constructor stub
		this.string=string;
	}
	
	public String getString() {
		return this.string;
	}
}
