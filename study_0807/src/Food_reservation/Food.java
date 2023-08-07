package Food_reservation;

public class Food {

	private String nation;
	
	Food() {
		nation = "알 수 없음";
	}
	
	Food(String nation) {
		this.nation = nation;
	}
	
	void printNation() {
		System.out.println(nation + " 본토의 맛을 느낄 수 있습니다.");
		return; // <- void는 반환값이 없다
	}
	
}
