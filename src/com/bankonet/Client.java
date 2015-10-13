package com.bankonet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private String identifiant;
	private List<Compte> comptesList;
	
	
	public Client(String nom, String prenom, String identifiant) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
		this.comptesList=new ArrayList<Compte>();
	}


	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", identifiant=" + identifiant + "]";
	}
	
	
	public double calculerAvoirGlobal(){
		double avoir=0;
		Iterator<Compte> iterator=comptesList.iterator();
		while (iterator.hasNext()) {
			Compte compte = (Compte) iterator.next();
			avoir+=compte.getSolde();
		}
		return avoir;
	}
	
	
	public List<Compte> getComptes() {
		
		return this.comptesList;
		
	}
	
	public void creerCompte(Compte compte) {
		this.comptesList.add(compte);
	}

	public void supprimerCompte(Compte compte){
		this.comptesList.remove(compte);
	}
	
	public void supprimerCompte(String numero) throws CompteNonTrouveException{
		Compte compte=retournerCompte(numero);
		this.comptesList.remove(compte);
	}
	
	public Compte retournerCompte(String numero) throws CompteNonTrouveException {
		Iterator<Compte> iterator=comptesList.iterator();
		while (iterator.hasNext()) {
			Compte compte = (Compte) iterator.next();
			if(compte.getNumero()==numero){
				return compte;
			}
		}
		throw new CompteNonTrouveException("Compte non trouvé pour le n°"+numero);
	}
	
	
	
}
