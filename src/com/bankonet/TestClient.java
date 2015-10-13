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
		
		System.out.println("Création de Client");
		
		Client client=new Client("Jean","Rober","2278");
		client.creerCompte(new CompteCourant("100156235", "Axa banque", 1000d, 0d));
		client.creerCompte(new CompteCourant("553351521", "Groupama", 1500d, 0d));
		client.creerCompte(new CompteCourant("555285623", "BMP", 200d, 200d));

		client.creerCompte(new CompteEpargne("1231536", "Credit Mutuel", 500d,0d));
		client.creerCompte(new CompteEpargne("5521145", "Credit Agricole", -200d, 1200d));
		
		System.out.println(client);
		
		try {
			Compte compte=client.retournerCompte("1006235");
			System.out.println("intitulé : "+compte.getIntitule());
		} catch (CompteNonTrouveException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
