package com.bankonet;

public class DonneesTest {

	public DonneesTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static CompteStat[] construitEchantillonCompte() {
		CompteCourant compteCourant1=new CompteCourant("100156235", "Axa banque", 1000d, 0d);
		CompteCourant compteCourant2=new CompteCourant("553351521", "Groupama", 1500d, 0d);
		CompteCourant compteCourant3=new CompteCourant("555285623", "BMP", -200d, 0d);

		CompteEpargne compteEpargne1=new CompteEpargne("1231536", "Credit Mutuel", 500d, 0d);
		CompteEpargne compteEpargne2=new CompteEpargne("5521145", "Credit Agricole", -200d, 0d);
		CompteStat[] arr={compteCourant1,compteCourant2,compteCourant3,compteEpargne1,compteEpargne2};
		return arr;
	}

}
