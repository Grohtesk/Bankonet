package com.bankonet;

public class TestStockage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client<CompteEpargne> client1=new Client<CompteEpargne>("Bob", "Bradbord", "4472");
		Client<Compte> client2=new Client<Compte>("Stanley", "Seiger", "2237");
		Client<CompteCourant> client3=new Client<CompteCourant>("Frank", "Ferguson", "2356");
		
		Stockage<String, Client> stock=new Stockage();
		stock.ajouter("Bob", client1);
		stock.ajouter("Stan", client2);
		stock.ajouter("Francky", client3);
		
		System.out.println(stock.retournerElement("Stan"));
		
		Compte compte1= new CompteCourant("100156235", "Axa banque", 1000d, 0d);
		Compte compte2= new CompteCourant("100156235", "Axa banque", 1000d, 0d);
		Compte compte3= new CompteCourant("100156235", "Axa banque", 1000d, 0d);
		
		Stockage<String, Compte> stockCompte=new Stockage();
		stockCompte.ajouter("Compte1", compte1);
		stockCompte.ajouter("Compte2", compte2);
		stockCompte.ajouter("Compte3", compte3);
		
		System.out.println(stockCompte.retournerElement("Compte2"));
	}

}
