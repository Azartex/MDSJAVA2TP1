package com.tactfactory.javaniveau2.tps.tp1.functionnalities;

public interface Omnivorus extends Herbivorus, Carnivorus {
	
	public static String nourriture() {

		String nourriture = null;

		int max = 2; 
		int min = 1; 
		int range = max - min + 1; 
		int rand = (int)(Math.random() * range) + min;

		if(rand == 1) {
			nourriture = "herbe";
		}
		else if (rand == 2) {
			nourriture = "viande";
		}
		return nourriture;
	}

}
