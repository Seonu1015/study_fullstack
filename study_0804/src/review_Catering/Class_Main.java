package review_Catering;

import java.util.ArrayList;

public class Class_Main {
	public static void main(String[] args) {
		
		Restaurant res1 = new Restaurant("한식", "대한", false);
		res1.info(10, 20);
		
		System.out.println("------------------------");
		
		Cafe caf1 = new Cafe("카페", "쉼터", true);
		caf1.info();
		caf1.takeOut();
		
		System.out.println("------------------------");
		
		KidsCafe kids1 = new KidsCafe("키즈카페", "아이들", false, 11);
		kids1.info();
		kids1.reservation();
		
		System.out.println("------------------------");
		
		JapaneseRes jres1 = new JapaneseRes("일식", "바다건너", true, "흰색", 1500);
		jres1.info();
		
	}
}

//1. (요식업) - (식당, 까페) - (나라별)