package Test_Catering;

public class Class_Main {
	public static void main(String[] args) {
		
		Restaurant res1 = new Restaurant("대한민국", "식당", "Ares", 5);
		res1.printRes();
		
		Cafe cafe1 = new Cafe("대한민국", "카페", "Acafe", 3);
		cafe1.printRes();
		
		KoreanRes kres1 = new KoreanRes("Bres", 4, "김밥", 2500);
		kres1.printKRes(); // 얘가 오류가 나고 있어
		
		
	}
}

//1. (요식업) - (식당, 까페) - (나라별)