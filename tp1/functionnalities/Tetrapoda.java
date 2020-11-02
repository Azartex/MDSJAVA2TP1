package com.tactfactory.javaniveau2.tps.tp1.functionnalities;

public interface Tetrapoda extends Terrestrial, Aquatic {

	public static String deplacement() {

		String deplacement = null;

		int max = 2; 
		int min = 1; 
		int range = max - min + 1; 
		int rand = (int)(Math.random() * range) + min;

		if(rand == 1) {
			deplacement = "nager";
		}
		else if (rand == 2) {
			deplacement = "marcher";
		}
		return deplacement;
	}
}