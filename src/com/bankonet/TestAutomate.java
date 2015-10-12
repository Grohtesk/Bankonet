package com.bankonet;

public class TestAutomate {
	public static void main(String[] args) {
		
		CompteStat[] tableau=DonneesTest.construitEchantillonCompte();
		
		double somme=0d;
		int i;
		for (i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
			somme+=tableau[i].getSolde();
		}
		System.out.println("Moyenne des comptes : "+(somme/i));
		
		try {
			tableau[2].debiter(401);
		} catch (CompteException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
