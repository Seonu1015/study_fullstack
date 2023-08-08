package Food_reservation_hw;

public class Main {
	public static void main(String[] args) {

		Korean kor1 = new Korean("한국", "삼계탕", "우리", "참이슬", 25);
		kor1.printInfo();
		
//		Customer cus1 = new Customer("홍길동");
//		cus1.reservation(kor1);
//
//		Customer cus2 = new Customer("성춘향");
//		cus2.reservation(kor1);
//		
//		cus1.outTeam(kor1);
		
		Customer cus3 = new Customer("김대한");
		cus3.reservation(kor1);

		System.out.println();
		OffCustomer offcus1 = new OffCustomer("김마리", 3);
		offcus1.entrance(kor1);
		
		System.out.println();
		OffCustomer offcus2 = new OffCustomer("이몽룡", 5);
		offcus2.entrance(kor1);
		
	}
}

// 손님이 빠져나간 경우도 추가해보자

// 빠져나간 손님이 발생한 경우 몇 명인지 확인하는 메서드
// seat 수를 수정하는 메서드

// 오프라인 손님이 추가됐다면??