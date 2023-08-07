package Food_reservation_hw;

public class Main {
	public static void main(String[] args) {

		Korean kor1 = new Korean("한국", "삼계탕", "우리", "참이슬", 25);
		Customer cus1 = new Customer("홍길동");

		kor1.printInfo();
		cus1.reservation(kor1.getSeat());

		Customer cus2 = new Customer("성춘향");
		cus2.reservation(kor1.minusSeat(cus1));
		
		Customer cus3 = new Customer("김대한");
		cus3.reservation(kor1.minusSeat(cus2));

		
	}
}

// 손님이 빠져나간 경우도 추가해보자

// 빠져나간 손님이 발생한 경우 몇 명인지 확인하는 메서드
// seat 수를 수정하는 메서드