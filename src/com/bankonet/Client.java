package com.bankonet;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Client<E extends Compte> {
	@ToString (uppercase=true)
	private String nom;
	@ToString
	private String prenom;
	private String identifiant;
//	private List<Compte> comptesList;
	private HashMap<String, E> compteMap;
	private Civilite civilite;
	
	
	public Client(String nom, String prenom, Civilite civilite, String identifiant) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
//		this.comptesList=new ArrayList<Compte>();
		this.compteMap=new HashMap<>();
		this.civilite=civilite;
	}


	
	
//	public double calculerAvoirGlobal(){
//		double avoir=0;
//		Iterator<Compte> iterator=comptesList.iterator();
//		while (iterator.hasNext()) {
//			Compte compte = (Compte) iterator.next();
//			avoir+=compte.getSolde();
//		}
//		return avoir;
//	}
//	
	
	@Override
	public String toString() {
		
		StringBuilder str= new StringBuilder();
		
		Field[] fields= Client.class.getDeclaredFields();
		for (Field f : fields) {
			ToString annotation=f.getAnnotation(ToString.class);
			if(annotation != null){
				try {
					if(annotation.uppercase()){
						str.append(f.getName()+" : "+f.get(this).toString().toUpperCase()+"; ");
					}else{
						str.append(f.getName()+" : "+f.get(this)+"; ");
					}
					
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return str.toString();
	}




	public HashMap<String,E> getComptes() {
		
		return this.compteMap;
		
	}
	
	public void creerCompte(E compte) {
		this.compteMap.put(compte.getNumero(), compte);
//		this.comptesList.add(compte);
	}

	public void supprimerCompte(E compte){
		this.compteMap.remove(compte.getNumero());
//		this.comptesList.remove(compte);
	}
	
	public void supprimerCompte(String numero) throws CompteNonTrouveException{
//		Compte compte=retournerCompte(numero);
//		this.comptesList.remove(compte);
		this.compteMap.remove(numero);
	}
	
	public E retournerCompte(String numero) throws CompteNonTrouveException {
		if(this.compteMap.get(numero)!=null){
			return (E)this.compteMap.get(numero);
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
