package com.bankonet;

public interface CompteStat {
	
	double getSolde();
	double debiter(double montant) throws DebitException;
}
