package com.bankonet;

public class CompteEpargne extends Compte{

	private double tauxInteret;
	public static final double PLAFOND=12000d;
	
	public CompteEpargne() {
	}
	
	public CompteEpargne(String numero, String intitule, double solde, double tauxInteret) {
		super(numero,intitule,solde);
		this.tauxInteret = tauxInteret;
	}
	
	public String toString() {
		String str=super.toString();
		str+="; Plafond : "+this.PLAFOND+"; Taux int�ret : "+this.tauxInteret;
		return str;
	}
	
	@Override
	public double crediter(double montant) throws CreditException {
		// TODO Auto-generated method stub
		if(PLAFOND<this.getSolde()+montant){
			throw new CreditException("Erreur, plafond d�pass�. Solde max autoris� : "+this.PLAFOND);
		}
		return super.crediter(montant);
	}

	@Override
	double debitMax() {
		// TODO Auto-generated method stub
		return this.getSolde();
	}	

}
