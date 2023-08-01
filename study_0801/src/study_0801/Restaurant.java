package study_0801;

//부모 클래스
public class Restaurant {

	String type;
	String restaurantName;
	int grade;
	
	Restaurant() {
		type = "**";
		restaurantName = "???";
		grade = 0;
	}
	
	Restaurant(String type, String restaurantName, int grade) {
		this.type = type;
		this.restaurantName = restaurantName;
		this.grade = grade;
	}

}
