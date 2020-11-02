package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Aquatic;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Tetrapoda;

public class Turtle extends Animal implements Tetrapoda, Omnivorus {

	public Turtle() {
		super();
	}

	public Turtle(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}

	@Override
	public void move() {
		System.out.println("Votre Tortue " + Turtle.super.getName() + " vient de " + Tetrapoda.deplacement());
	}

	@Override
	public void eat(Eatable eatable) {
		if (eatable instanceof Vegetable || eatable instanceof Animal) {
			System.out.println("Votre Tortue " + Turtle.super.getName() + " vient de manger " + Omnivorus.nourriture());
		}
	}
}