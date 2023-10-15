package practice_Catering;

import java.util.Scanner;

public class AnimalCafe extends Cafe {

	String[] animal;
	String[] condition;

	AnimalCafe(String type, String name, boolean takeout, String animal, String condition) {
		super(type, name, takeout);
		this.animalSetting();
		this.animal[0] = animal;
		this.condition[0] = condition;
	}

	AnimalCafe(String type, String name, boolean takeout, String[] animal, String[] condition) {
		super(type, name, takeout);
		this.animalSetting();
		this.animal = animal;
		this.condition = condition;
	}

	void animalSetting() {
		this.animal = new String[3];
		this.condition = new String[3];

		for (int i = 0; i < animal.length; i++) {
			this.animal[i] = "입양완료";
			this.condition[i] = "휴식";
		}
	}

	void animalList() {
		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i] + " : " + condition[i]);
		}
	}

}
