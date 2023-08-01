package study_0801;

public class class02_practice {
	public static void main(String[] args) {

//		Restaurant rest1 = new Restaurant();		
//		Store store1 = new Store("한식", "우리음식", 4,"된장찌개", 7000);
//		
//		System.out.println(rest1.restaurantName + "(" + rest1.type + "), 평점 : " + rest1.grade + "점");
//		System.out.println(store1.restaurantName + "(" + store1.type + "), 메뉴 : " + store1.menu +
//				"(" + store1.price + "원), 평점 : " + store1.grade + "점");
//		
//		store1.printStore();
//		
//		System.out.println("---------------------");
//		
//		Store store2 = new Store("중식", "옆집음식", 4,"차돌짬뽕", 9000);
//		store2.infor();
//		store2.open();
//		store2.close();
//		store2.menuInfor();

		System.out.println("풀이------------------");

		Restaurant res = new Restaurant();
		res.printRes();

		Korean kor = new Korean();
		kor.printRes();

		Japanese jap = new Japanese();
		jap.printRes();

		American ame = new American();
		ame.printRes();

		Korean kor2 = new Korean("대한민국", "한식당", 5, "백반", 5000);
		kor.printRes();

		System.out.println("---------------------");

		String[] menu = { "초밥", "라멘", "우동" };
		int[] price = { 10000, 8000, 6000 };
		Japanese jap2 = new Japanese("일본", "일식당", 4, menu, price);
		jap2.printRes();

		jap2.setPoint(1);
		jap2.setPoint(1);
		jap2.setPoint(1);
		jap2.setPoint(1);
		jap2.setPoint(1);
		jap2.printRes();

	}
}

//객체는 매열에 못넣나?
