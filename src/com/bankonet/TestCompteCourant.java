package com.bankonet;

public class TestCompteCourant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompteCourant compteCourant1=new CompteCourant("100156235", "Axa banque", 0d, 0d);
		CompteCourant compteCourant2=new CompteCourant("553351521", "Groupama", 0d, 0d);
		CompteCourant compteCourant3=new CompteCourant("555285623", "BMP", -200d, 0d);
		
		compteCourant1.crediter(700.00d);
		
		CompteCourant[] tabCompteCourrant={compteCourant1,compteCourant2,compteCourant3};
		
		for(int i=0;i<tabCompteCourrant.length;i++){
			System.out.println(tabCompteCourrant[i]);
		}
	}

}
