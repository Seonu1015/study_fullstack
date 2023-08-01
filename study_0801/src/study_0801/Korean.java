package study_0801;

//가게 -> 메뉴, 가격 (자식 클래스)
public class Korean extends Restaurant {

	String[] menu;
	int[] price;

	Korean() {
		setting();
	}

	Korean(String nation, String name, int point) {
		super(nation, name, point); // 부모 클래스로 보낸다
		this.setting();
	}

	Korean(String nation, String name, int point, String menu, int price) {
		super(nation, name, point);

		this.setting();
		this.menu[0] = menu;
		this.price[0] = price;
	}

	Korean(String nation, String name, int point, String[] menu, int[] price) {
		super(nation, name, point);

		this.setting();
		this.menu = menu;
		this.price = price;
	}

	void setting() {

		menu = new String[3];
		price = new int[3];
		
		for (int i = 0; i < menu.length; i++) {
			menu[i] = "SOLD OUT";
			price[i] = 0;
		}
	}

	void printRes() {
		super.printRes();
		for (int i = 0; i < menu.length; i++) {
			System.out.println("메뉴 : " + menu[i] + ", 가격 : " + price[i]);
		}
	}

}
