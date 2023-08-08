package Food_reservation_hw;

public class Korean extends Restaurant {

	private String name;
	private String soju;
	private int seat;
	
	int[] timeTable;
	
	Korean(String nation, String menu, String name, String soju, int seat) {
		super(nation, menu);
		this.name = name;
		this.soju = soju;
		this.seat = seat;
		timeTable = new int[7];
	}

	int getSeat() {
		return this.seat;
	}
	
	void setSeat(int peopleNum) {
		this.seat -= peopleNum;
	}
	
	int[] getTimeTable() {
		System.out.println("예약이 불가능한 시간 : ");
		for(int i=0; i<7; i++) {
			System.out.println(this.timeTable[i] + " ");
		}
		return timeT
	}
	
	
	void inputTimeTable(Customer cus) {
		timeTable[cus.getStartTime()-6] = cus.getStartTime();
	}

	@Override
	void printInfo() {
		super.printNation();
		System.out.println("어서오십시오. \"" + this.name + "\" 입니다.");
		System.out.println("저희의 메인 메뉴는 " + this.getMenu() + "입니다.");
		System.out.println("음식과 어울리는 술로 " + this.soju + "을(를) 추천합니다.");
		return;
	}

}
