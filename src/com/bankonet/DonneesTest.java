package com.bankonet;

public class DonneesTest {

	public DonneesTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static CompteStat[] construitEchantillonCompte() {
		
		CompteStat[] arr={
				new CompteCourant("100156235", "Axa banque", 1000d, 0d),
				new CompteCourant("553351521", "Groupama", 1500d, 0d),
				new CompteCourant("555285623", "BMP", 200d, 200d),

				new CompteEpargne("1231536", "Credit Mutuel", 500d,0d),
				new CompteEpargne("5521145", "Credit Agricole", -200d, 1200d)
		};
		return arr;
	}

}
