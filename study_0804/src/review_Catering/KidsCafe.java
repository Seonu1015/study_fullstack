package review_Catering;

public class KidsCafe extends Cafe {

	int kidsNum;
	
	KidsCafe(String type, String name, boolean takeout, int kidsNum) {
		super(type, name, takeout);
		this.kidsNum = kidsNum;
	}
	
	void reservation() {
		if(this.kidsNum >= 5) {
			System.out.println("아이가 5명 이상인 경우 예약이 필요합니다.");
		} else {
			System.out.println("아이가 4명 이하라면 예약없이 바로 이용이 가능합니다.");
		}
	}

}
