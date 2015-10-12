package com.bankonet;

public class CompteEpargne extends Compte{

	double tauxInteret;
	
	public CompteEpargne() {
		// TODO Auto-generated constructor stub
	}
	
	public CompteEpargne(String numero, String intitule, double solde,double tauxInteret) {
		super(numero,intitule,solde);
		this.tauxInteret = tauxInteret;
	}
	
	public String toString() {
		String str=super.toString();
		str+="Taux intéret : "+this.tauxInteret;
		return str;
	}	

}
