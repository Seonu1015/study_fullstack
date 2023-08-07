package Food_reservation;

public class Main {
	public static void main(String[] args) {

		Korean kor1 = new Korean("한국", "삼계탕", "우리", "참이슬", 25);
		Customer cus1 = new Customer("홍길동");

		kor1.printInfo();
		cus1.reservation(kor1.getSeat());

		Customer cus2 = new Customer("성춘향");
		cus2.reservation(kor1.getSeat() - cus1.getPeopleNum());

	}
}

// 손님이 빠져나간 경우도 추가해보자