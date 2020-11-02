package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Aquatic;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Tetrapoda;

public class Deer extends Animal implements Terrestrial, Herbivorus {

	public Deer() {
		super();
	}

	public Deer(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}

	@Override
	public void move() {
		System.out.println("Votre Cerf " + Deer.super.getName() + " vient de " + Terrestrial.deplacement);
	}

	@Override
	public void eat(Eatable eatable) {
		if (eatable instanceof Vegetable) {
			System.out.println("Votre Cerf " + Deer.super.getName() + " vient de manger de l'" + Herbivorus.nourritureOK);
		}

		else if (eatable instanceof Animal) {
			System.out.println("Votre Cerf " + Deer.super.getName() + " ne peut pas manger de " + Herbivorus.nourritureX);
		}
	}
}
