package Test_Catering;

import java.util.ArrayList;

public class Class_Main {
	public static void main(String[] args) {
		
		Restaurant res1 = new Restaurant("대한민국", "식당", "Ares", 5);
		res1.printRes();
		
		Cafe cafe1 = new Cafe("대한민국", "카페", "Acafe", 3);
		cafe1.printRes();
		
		KoreanRes kres1 = new KoreanRes("Bres", 4, "김밥", 2500);
		kres1.printKRes();
		
		JapaneseRes jres1 = new JapaneseRes("jAres", 3, "카레", 11000);
		jres1.printKRes();
		
		System.out.println("-------------------------");
		
		//ArrayList<객체> 어레이리스트명 = new ArrayList<>();
		
//		ArrayList<Catering> caterList = new ArrayList<>();
//		ArrayList<Restaurant> resList = new ArrayList<>();
//		ArrayList<KoreanRes> kresList = new ArrayList<>();
		
		
		
	}
}

//1. (요식업) - (식당, 까페) - (나라별)