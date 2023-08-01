package study_0801;

//자식 클래스
public class Store extends Restaurant {
	
	String menu;
	int price;
	
	Store(String type, String restaurantName, int grade, String menu, int price) {
		super(type, restaurantName, grade);
		this.menu = menu;
		this.price = price;
	}
	
	void printStore() {
		System.out.println(this.restaurantName + "(" + this.type + "), 메뉴 : " + this.menu +
				"(" + this.price + "원), 평점 : " + this.grade + "점");
	}
}
