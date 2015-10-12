package com.bankonet;

public class TestAutomate {
	public static void main(String[] args) {
		
		CompteStat[] tableau=DonneesTest.construitEchantillonCompte();
		
		double somme=0d;
		int i;
		for (i = 0; i < tableau.length; i++) {
			System.out.println("solde : "+tableau[i].getSolde());
			somme+=tableau[i].getSolde();
		}
		System.out.println("Moyenne des comptes : "+(somme/i));
		
	}
}
