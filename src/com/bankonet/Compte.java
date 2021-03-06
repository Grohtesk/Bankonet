package com.bankonet;

public abstract class Compte implements CompteStat {
	
	private String numero;
	private String intitule;
	private double solde;
	
	public Compte() {
	}
	
	public Compte(String numero, String intitule, double solde) {
		if(solde<0){
			System.out.println("On ne peut pas initialiser un compte en n�gatif.");
			solde=0;
		}
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str="n� compte : "+this.numero+"; Solde : "+solde+"; Intitul� : "+this.intitule;
		return str;
	}
	
	public double crediter(double montant) throws CreditException{
		this.solde+=montant;
		return this.solde;
	}
	public double debiter(double montant) throws DebitException {
		
		double debitmax=debitMax();
		
		if(montant > debitmax){
			throw new DebitException("Erreur, solde insuffisant. D�bit max autoris� : "+debitmax);
		}
		
		this.solde-=montant;
		return this.solde;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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
	
	abstract double debitMax();
	
	public void effectuerVirement(Compte compte, double montant) throws CompteException {
		compte.debiter(montant);
		this.crediter(montant);
	}
	
}
