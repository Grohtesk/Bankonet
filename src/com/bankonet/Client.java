package com.bankonet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private String identifiant;
	private List<Compte> comptesList;
	private HashMap<String, Compte> compteMap;
	
	
	public Client(String nom, String prenom, String identifiant) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
		this.comptesList=new ArrayList<Compte>();
		this.compteMap=new HashMap<>();
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
		this.compteMap.put(compte.getNumero(), compte);
		this.comptesList.add(compte);
	}

	public void supprimerCompte(Compte compte){
		this.compteMap.remove(compte.getNumero());
		this.comptesList.remove(compte);
	}
	
	public void supprimerCompte(String numero) throws CompteNonTrouveException{
		Compte compte=retournerCompte(numero);
		this.comptesList.remove(compte);
		this.compteMap.remove(numero);
	}
	
	public Compte retournerCompte(String numero) throws CompteNonTrouveException {
		if(this.compteMap.get(numero)!=null){
			return (Compte)this.compteMap.get(numero);
		}else{
			throw new CompteNonTrouveException("Compte non trouvé pour le n°"+numero);
		}
		
//		Iterator<Compte> iterator=comptesList.iterator();
//		while (iterator.hasNext()) {
//			Compte compte = (Compte) iterator.next();
//			if(compte.getNumero()==numero){
//				return compte;
//			}
//		}
//		throw new CompteNonTrouveException("Compte non trouvé pour le n°"+numero);
	}
	
	
	
}
