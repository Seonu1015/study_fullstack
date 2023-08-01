package Test_Catering;

public class KoreanCafe extends Cafe {

	String[] menu;
	int[] price;

	KoreanCafe() {
		setting();
	}

	KoreanCafe(String name, int rank) {
		super(name, rank);
		this.setting();
	}

	KoreanCafe(String name, int rank, String menu, int price) {
		super(name, rank);
		this.menu = new String[] { menu };
		this.price = new int[] { price };
	}

	KoreanCafe(String name, int rank, String[] menu, int[] price) {
		super(name, rank);
		this.setting();
		this.menu = menu;
		this.price = price;
	}

	void setting() {
		menu = new String[2];
		price = new int[2];

		for (int i = 0; i < menu.length; i++) {
			menu[i] = "SOLD OUT";
			price[i] = 0;
		}
	}

	void printKRes() {
		super.printRes();
		for (int i = 0; i < menu.length; i++) {
			System.out.println("메뉴 : " + menu[i] + ", 가격 : " + price[i]);
		}
	}

}
