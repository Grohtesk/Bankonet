package com.bankonet;

public class TestClient {

	public static void main(String[] args) {
		
		CompteStat[] tableau=DonneesTest.construitEchantillonCompte();
		double somme=0d;
		int i;
		
		try {
			tableau[3].effectuerVirement((Compte) tableau[1],900);
		} catch (CompteException e) {
			System.out.println(e.getMessage());
		}
		
		for (i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
			somme+=tableau[i].getSolde();
		}
		System.out.println("Moyenne des comptes : "+(somme/i));
	}

}
