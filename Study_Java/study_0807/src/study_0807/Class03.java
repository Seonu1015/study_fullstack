package study_0807;

public class Class03 {
	public static void main(String[] args) {
		
		BankAccount Kim = new BankAccount("123-12-123456", 1000000);
		
		System.out.println("계좌번호 : " + Kim.getAccountNumber() + ", 잔액 : " + Kim.getBalance() + "원");
		
		Kim.deposit(1000000);
		Kim.deposit(-1000000);
		
		Kim.withdraw(1000000);
		Kim.withdraw(9999999);
		
		System.out.println("잔액 : " + Kim.getBalance() + "원");
		
	}
}

//캡슐화 - 정보은닉
//은행 계좌 클래스
//계좌번호, 잔액

//1.
//식당 + 좌석 수, 소비자 -> 예약자명, 인원 수
//남은 좌석 수보다 인원 수가 더 많으면 예약 불가
//오버라이딩, 캡슐화

//2.
//RPG 게임
//유닛 - 캐릭터, 몬스터 - 직업(캐릭터)
//유닛 - 공격, 레벨업, 체력
//몬스터 - 타입
//캐릭터 - 경험치
//직업 - 직업이름