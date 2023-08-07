package Food_reservation_hw;

public class Restaurant extends Food {

	private String menu;

	Restaurant(String nation, String menu) {
		super(nation);
		this.menu = menu;
	}
	
	String getMenu() {
		return this.menu;
	}
	
	void printInfo() {
		super.printNation();
		System.out.println("어서오십시오.");
		System.out.println("저희의 메인 메뉴는 " + menu + "입니다.");
		return;
	}
	
	
	
}
