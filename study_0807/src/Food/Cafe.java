package Food;

public class Cafe extends Food {

	String drink;
	
	Cafe() {
		super();
		drink = "없음";
	}
	
	Cafe(String nation, String drink) {
		super(nation);
		this.drink = drink;
	}
	
	void printDrink() {
		System.out.println("저희의 메인 음료는 " + drink + "입니다.");
		return;
	}
	
}
