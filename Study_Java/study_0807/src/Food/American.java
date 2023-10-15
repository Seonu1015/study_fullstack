package Food;

public class American extends Restaurant {
	
	String drink; // Cafe의 drink와는 다름	
	
	American() { // 부모클래스의 생성자를 연결해서 알려줘야 한다!
		super("미국", "피자");
	}
	
	American(String menu) {
		super("미국", menu);
	}
	
	American(String menu, String drink) {
		super("미국", menu);
		this.drink = drink;
	}
	
	American(String nation, String menu, String drink) {
		super(nation, menu);
		this.drink = drink;
	}
	
	American(Restaurant res, String drink) { // 매개변수에 객체를 넣을 수 있다
		super(res.nation, res.menu);
		this.drink = drink;
	}
	
	void printDrink() {
		super.pringMenu();
		System.out.println("음식과 어울리는 술로 " + drink + "을(를) 추천합니다.");
		return;
	}

}
