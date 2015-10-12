package com.bankonet;

public class CompteEpargne extends Compte{

	double tauxInteret;
	
	public CompteEpargne() {
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

	@Override
	double debitMax() {
		// TODO Auto-generated method stub
		return this.getSolde();
	}	

}
