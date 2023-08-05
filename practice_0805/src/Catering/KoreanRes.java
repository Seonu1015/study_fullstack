package Catering;

public class KoreanRes extends Restaurant {

	String[] koreanFood;
	int[] popularity;
	
	KoreanRes (String type, String name, boolean openAlltime, String koreanFood, int popularity) {
		super(type, name, openAlltime);
		this.menuSetting();
		this.koreanFood[0] = koreanFood;
		this.popularity[0] = popularity;
	}

	KoreanRes (String type, String name, boolean openAlltime, String[] koreanFood, int[] popularity) {
		super(type, name, openAlltime);
		this.menuSetting();
		this.koreanFood = koreanFood;
		this.popularity = popularity;	
	}
	
	void menuSetting() {
		this.koreanFood = new String[2];
		this.popularity = new int[2];

		for (int i = 0; i < koreanFood.length; i++) {
			koreanFood[i] = "SOLD OUT";
			popularity[i] = 0;
		}
	}
	
	void printMenu() {
		for (int i = 0; i < koreanFood.length; i++) {
			if(this.popularity[i] >=4) {
				System.out.println("메뉴 : " + koreanFood[i] + " ★추천★");
			} else {
				System.out.println("메뉴 : " + koreanFood[i]);
			}
		}
	}

}
