package com.bankonet;

import java.util.HashMap;
import java.util.Map;

public class Stockage<T, E> {
	
	private Map<T,E> maplist;
	
	public E retournerElement(T cle) {
		return maplist.get(cle);
	}
	
	public void ajouter(T cle,E element) {
		maplist.put(cle, element);
	}
	
	public void supprimer(T cle) {
		maplist.remove(cle);
	}

	public Stockage() {
		this.maplist=new HashMap<T,E>();
	}

}
