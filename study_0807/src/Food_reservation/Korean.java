package Food_reservation;

public class Korean extends Restaurant {

	String name;
	String soju;
	private int seat;

	Korean(String nation, String menu, String name, String soju, int seat) {
		super(nation, menu);
		this.name = name;
		this.soju = soju;
		this.seat = seat;
	}

	int getSeat() {
		return this.seat;
	}

	void setSeat(Customer cus) {
		this.seat -= cus.getPeopleNum();
	}

	@Override
	void printInfo() {
		super.printNation();
		System.out.println("어서오십시오. \"" + name + "\" 입니다.");
		System.out.println("저희의 메인 메뉴는 " + menu + "입니다.");
		System.out.println("음식과 어울리는 술로 " + soju + "을(를) 추천합니다.");
		return;
	}

}
