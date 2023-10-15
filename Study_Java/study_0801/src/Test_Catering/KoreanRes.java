package Test_Catering;

public class KoreanRes extends Restaurant {

	String[] menu;
	int[] price;

	KoreanRes() {
		setting();
	}

	KoreanRes(String name, int rank) {
		super(name, rank);
		this.setting();
	}

//	KoreanRes(String name, int rank, String menu, int price) {
//		super(name, rank);
//		this.setting();
//		this.menu[0] = menu;
//		this.price[0] = price;
//	}

	// 앞의 Restaurant 클래스와 같은 방식으로 수정
	
	KoreanRes(String name, int rank, String menu, int price) {
		super(name, rank);
		this.menu = new String[] { menu };
		this.price = new int[] { price };
	}

	KoreanRes(String name, int rank, String[] menu, int[] price) {
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
