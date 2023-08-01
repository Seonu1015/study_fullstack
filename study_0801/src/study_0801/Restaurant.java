package study_0801;

//부모 클래스
public class Restaurant {

//	String type;
//	String restaurantName;
//	int grade;
//	
//	Restaurant() {
//		type = "**";
//		restaurantName = "???";
//		grade = 0;
//	}
//	
//	Restaurant(String type, String restaurantName, int grade) {
//		this.type = type;
//		this.restaurantName = restaurantName;
//		this.grade = grade;
//	}
//	
//	void infor() {
//		System.out.println(this.restaurantName + "(" + this.type + "), 평점 : " + this.grade + "점");
//	}
//	
//	void open() {
//		System.out.println("	09시 영업을 시작합니다.");
//	}
//	
//	void close() {
//		System.out.println("	20시 영업을 마감합니다.");
//	}

	String nation;
	String name;
	int point = 0;
	int count = 0;

	Restaurant() {
		nation = " ";
		name = " ";
	}

	Restaurant(String nation, String name, int point) {
		this.nation = nation;
		this.name = name;
		this.point += point;
		count++;
	}

	void printRes() {
		if (count == 0) {
			System.out.println("국가 : " + nation + ", 이름 : " + name + ", 평점 : 0");
		} else {
			System.out.println("국가 : " + nation + ", 이름 : " + name + ", 평점 : " + point / count);
		}
	}

	void setPoint(int point) {
		this.point += point;
		count++;
	}

}
