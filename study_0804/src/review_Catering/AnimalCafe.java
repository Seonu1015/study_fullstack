package review_Catering;

public class AnimalCafe extends Cafe {

	String[] animal;
	
	AnimalCafe(String type, String name, boolean takeout, String animal) {
		super(type, name, takeout);
		this.animal[0] = animal;
	}
	
	AnimalCafe(String type, String name, boolean takeout, String[] animal) {
		super(type, name, takeout);
		this.animal = animal;
	}
	
	void animalSelect() {
		this.animal = new String[3];
		for (int i = 0; i < animal.length; i++) {
			animal[i] = "휴식 중";
		}
	}	

}
