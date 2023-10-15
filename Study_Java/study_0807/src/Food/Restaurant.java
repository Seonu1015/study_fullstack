package Food;

public class Restaurant extends Food {
	
	String menu;
	
	Restaurant() {
		super();
		menu = "없음";
	}

	Restaurant(String nation, String menu) {
		super(nation);
		this.menu = menu;
	}
	
	void pringMenu() {
		super.printNation();
		System.out.println("저희의 메인 메뉴는 " + menu + "입니다.");
		return;
	}
	
}
