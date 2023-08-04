package review_Catering;

public class JapaneseRes extends Restaurant {

	String[] plateColor;
	int[] price;
	
	JapaneseRes (String type, String name, boolean openAlltime, String plateColor, int price) {
		super(type, name, openAlltime);
		this.sushiPrice();
		this.plateColor[0] = plateColor;
		this.price[0] = price;
	}
	
	JapaneseRes (String type, String name, boolean openAlltime, String[] plateColor, int[] price) {
		super(type, name, openAlltime);
		this.sushiPrice();
		this.plateColor = plateColor;
		this.price = price;
	}
	
	void info() {
		super.info(0, 0);
		this.sushiPrice();
		System.out.println("접시 색깔별 가격");
		System.out.println(plateColor[0] + " : " + price[0] + "원");
	}
	
	
	void sushiPrice() {
		this.plateColor = new String[2];
		this.price = new int[2];
		super.info(0, 0);
		System.out.println("접시 색깔별 가격");
		for (int i = 0; i < plateColor.length; i++) {
				plateColor[i] = "흰색";
				price[i] = 1000;				
				System.out.println(plateColor[i] + " : " + price[i] + "원");
		}
	}
	
	
	
}
