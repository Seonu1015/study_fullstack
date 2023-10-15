package Catering;

import java.util.ArrayList;

public class Class_Main {
	public static void main(String[] args) {

		Restaurant res1 = new Restaurant("한식", "대한", false);
		res1.infoRes(10, 20);

		System.out.println("------------------------");

		Cafe caf1 = new Cafe("카페", "쉼터", true);
		caf1.info();
		caf1.takeOut();

		System.out.println("------------------------");

		KidsCafe kids1 = new KidsCafe("키즈카페", "아이들", false, "정글짐");
		kids1.infoKidscafe();
		kids1.reservation();

		System.out.println("------------------------");

		String[] sushi = { "연어", "문어", "장어", "새우", "군함" };
		JapaneseRes jres1 = new JapaneseRes("일식", "바다건너", true, sushi);
		jres1.info();
		jres1.printSushi();
		jres1.billJres();

		System.out.println("------------------------");

		String[] koreanFood = { "불고기", "비빔밥" };
		int[] popularity = { 3, 4 };
		KoreanRes kres1 = new KoreanRes("한식", "무궁", false, koreanFood, popularity);

		kres1.infoRes(12, 22);
		kres1.printMenu();

		System.out.println("------------------------");

		KoreanRes kres2 = new KoreanRes("한식", "나라", false, "육개장", 3);

		kres2.infoRes(11, 19);
		kres2.printMenu();

		System.out.println("------------------------");

		AnimalCafe aniCaf1 = new AnimalCafe("애견카페", "프렌즈", false, "치와와", "활발");
		aniCaf1.info();
		aniCaf1.animalList();

	}
}

//1. (요식업) - (식당, 까페) - (나라별)

//생성자도 늘리고 메소드도 늘리고
//이것저것 추가해서 멋드러지게 만들어 보자