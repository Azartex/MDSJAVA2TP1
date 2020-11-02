package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Aquatic;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Tetrapoda;

public class Dolphin extends Animal implements Aquatic, Carnivorus {

	public Dolphin() {
		super();
	}

	public Dolphin(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}

	@Override
	public void move() {
		System.out.println("Votre dauphin " + Dolphin.super.getName() + " vient de " + Aquatic.deplacement);
	}

	@Override
	public void eat(Eatable eatable) {
		if (eatable instanceof Animal) {
			System.out.println("Votre dauphin " + Dolphin.super.getName() + " vient de manger de la " + Carnivorus.nourritureOK);
		}

		else if (eatable instanceof Vegetable) {
			System.out.println("Votre dauphin " + Dolphin.super.getName() + " ne peut pas manger d'" + Carnivorus.nourritureX);
		}
	}
}