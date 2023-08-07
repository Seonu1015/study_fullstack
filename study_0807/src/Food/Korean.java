package Food;

public class Korean extends Restaurant {
	
	String soju;
	
	Korean() {
		super("한국", "김치");
	}

	Korean(String menu) {
		super("한국", menu);
	}
	
	Korean(String menu, String soju) {
		super("한국", menu);
		this.soju = soju;
	}
	
	Korean(String nation, String menu, String soju) {
		super(nation, menu);
		this.soju = soju;
	}
	
	void printsoju() {
		super.pringMenu();
		System.out.println("음식과 어울리는 술로 " + soju + "을(를) 추천합니다.");
		return;
	}

}
