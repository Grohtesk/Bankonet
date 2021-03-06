package com.bankonet;

public class CompteCourant extends Compte {
	
	double montantDecouvertAutorise;
	
	public CompteCourant(){
	}
	
	public CompteCourant(String numero, String intitule, double solde,double montantDecouvertAutorise) {
		super(numero,intitule,solde);
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

	public static void main(String[] args) {
		
	}
	
	public String toString() {
		String str=super.toString();
		str+="; Montant devouvert autoris� : "+this.montantDecouvertAutorise;
		return str;
	}

	@Override
	double debitMax() {
		return this.getSolde()+montantDecouvertAutorise;
	}
	
	
	
}