package study_0801;

public class class02_practice {
	public static void main(String[] args) {
		
		Restaurant rest = new Restaurant();		
		Store store1 = new Store("한식", "우리음식", 4,"된장찌개", 7000);
		
		System.out.println(rest.restaurantName + "(" + rest.type + "), 평점 : " + rest.grade + "점");
		System.out.println(store1.restaurantName + "(" + store1.type + "), 메뉴 : " + store1.menu +
				"(" + store1.price + "원), 평점 : " + store1.grade + "점");
		
		store1.printStore();
		

	}
}
