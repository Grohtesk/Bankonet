package com.bankonet;

public abstract class Compte implements CompteStat {
	
	private String numero;
	private String intitule;
	private double solde;
	
	public Compte() {
		// TODO Auto-generated constructor stub
	}
	
	public Compte(String numero, String intitule, double solde) {
		// TODO Auto-generated constructor stub

		if(solde<0){
			System.out.println("On ne peut pas initialiser un compte en négatif.");
			solde=0;
		}
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str="n° compte : "+this.numero+"; Solde : "+solde+"; Intitulé : "+this.intitule;
		return str;
	}
	
	public double crediter(double montant) {
		this.solde+=montant;
		return this.solde;
	}
	public double debiter(double montant) {
		this.solde-=montant;
		return this.solde;
	}
	
	// Accesseurs
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return numero;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
}
