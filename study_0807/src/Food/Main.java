package Food;

public class Main {
	public static void main(String[] args) {
		
		Food food1 = new Food();
		Food food2 = new Food("북한");
		Restaurant res = new Restaurant();
		Korean kor = new Korean("삼계탕", "참이슬");
		Japanese jap = new Japanese("타코야끼", "사케");
		American ame = new American("미국(LA)", "스테이크", "와인");
		
		// 위에 만든 것은 다 각각의 객체이므로 자동으로 컴퓨터가 연결해주지 않는다
		
//		System.out.println(kor.nation + kor.menu + kor.soju);
//		System.out.println(jap.nation + jap.menu + jap.sake);
//		System.out.println(ame.nation + ame.menu + ame.drink);
		
//		kor.printNation();
//		kor.pringMenu();
		kor.printsoju(); // super를 이용해서 한번에 입력하게 바꿀 수 있다

	}
}
