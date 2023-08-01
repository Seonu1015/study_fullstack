package study_0801;

import java.util.ArrayList;

public class class02_practice {
	public static void main(String[] args) {

//		Restaurant rest1 = new Restaurant();		
//		Store store1 = new Store("한식", "우리음식", 4,"된장찌개", 7000);
//		
//		System.out.println(rest1.restaurantName + "(" + rest1.type + "), 평점 : " + rest1.grade + "점");
//		System.out.println(store1.restaurantName + "(" + store1.type + "), 메뉴 : " + store1.menu +
//				"(" + store1.price + "원), 평점 : " + store1.grade + "점");
//		
//		store1.printStore();
//		
//		System.out.println("---------------------");
//		
//		Store store2 = new Store("중식", "옆집음식", 4,"차돌짬뽕", 9000);
//		store2.infor();
//		store2.open();
//		store2.close();
//		store2.menuInfor();

		System.out.println("풀이------------------");

		Restaurant res = new Restaurant();
		res.printRes();
		
		System.out.println("---------------------");

		Korean kor = new Korean();
		kor.printRes();

		Japanese jap = new Japanese();
		jap.printRes();

		American ame = new American();
		ame.printRes();

		Korean kor2 = new Korean("대한민국", "A", 5, "백반", 5000);
		kor.printRes();

		System.out.println("---------------------");

		String[] menu = { "초밥", "라멘", "우동" };
		int[] price = { 10000, 8000, 6000 };
		Japanese jap2 = new Japanese("일본", "일식당", 4, menu, price);
		jap2.printRes();

		jap2.setPoint(1);
		jap2.setPoint(1);
		jap2.setPoint(1);
		jap2.setPoint(1);
		jap2.setPoint(1);
		jap2.printRes();
		
		// --------------------------------------------------
		
		ArrayList<Korean> koreaList = new ArrayList<>();
		System.out.println("size : " + koreaList.size());
		koreaList.add(kor);
		System.out.println("size : " + koreaList.size());
		koreaList.add(kor2);
		System.out.println("size : " + koreaList.size());
		
		Korean kor3 = new Korean("대한민국", "B", 3, "뚝불", 6500);
		koreaList.add(kor3);
		
		koreaList.add(new Korean("대한민국", "C", 4, "김밥", 2500));
		
		System.out.println(koreaList.get(2).name);
		
		koreaList.remove(2);
		System.out.println("size : " + koreaList.size());
		
		System.out.println("---------------------");
		
		for(int i=0; i<koreaList.size(); i++) {
			koreaList.get(i).printRes();
		}
		
		// --------------------------------------------------
		
		System.out.println("---------------------");
		
		ArrayList<American> ameList = new ArrayList<>();
		
		String[] menu2 = { "피자", "파스타", "커피" };
		int[] price2 = { 12000, 9000, 3000 };
		American ame2 = new American("미국", "양식당", 4, menu2, price2);
		
		ameList.add(ame);
		ameList.add(ame2);
		
		ameList.get(1).printRes();
		
		// --------------------------------------------------
		
		

	}
}

//객체는 매열에 못넣나?
//String[] -> 객체를 배열에 넣어서 사용했었다.

//배열(Array) List
//ArrayList
//객체 밖에 못 넣는다.
//배열의 단점 : 사이즈를 지정해줘야 한다.
//ArrayList는 사이즈가 유동적이다.

//ArrayList<객체> 어레이리스트명 = new ArrayList<>();

//1. (요식업) - (식당, 까페) - (나라별)
//2. 주사위 게임하는 사람들 : 객체가 생성되면 각 사람마다 랜덤한 주사위 값(1~6)을 가지고 있다.
//						다른 객체와 주사위 값을 가지고 승부한다. 누가 이겼는지 판단하고,
//						게임을 할 때마다 주사위 값이 바뀌어야 한다.
//3. 카드게임 -> 객체화
//		컴퓨터와 사람을 각각 객체화 한다. 컴퓨터vs컴퓨터, 컴퓨터vs사람, 사람vs사람