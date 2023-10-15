package study_0731;

import java.util.Scanner;

public class class04_practice {
	public static void main(String[] args) {

		// String world = "Hello World." 모든 문장은 마침표로 이루어져 있다 라는 가정하에 length를 사용하지 않고
		// 총 길이를 출력해보자.
		// equalsIgnoreCase를 사용하지 않고, 2개의 문자열을 서로 비교해보자.
		// 문자열에 indexOf 처음이나 마지막에 특정 위치를 알 수 있었다. 그러면 해당 문자열에 원하는 문자가 몇개 들어있는지

		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine() + ".";
		String str2 = sc.nextLine() + ".";

		System.out.println(str1);
		System.out.println(str2);

		int lastCh;
		lastCh = str1.indexOf(".");

		System.out.println(lastCh + 1);

		//
		int index = 0;
		int cnt = 0;

		while (true) {
			// cnt++; 마침표 포함
			if (str1.charAt(index) == '.') {
				break;
			}
			cnt++;
			index++;
		}
		System.out.println(cnt);

		System.out.println("-----------------------");

		System.out.println(str1.toLowerCase().equals(str2.toLowerCase()));

		// String 은 변수가 아닌 객체이므로, 변수에서 사용하는 연산자를 쓸 수 없다
		// str1.toLowerCase() == str2.toLowerCase() <- 안된다!

		if (str1.length() != str2.length()) {
			// System.out.println(false);
			return;
		}

		// System.out.println((int) 'a');
		// int a = 'A';
		// System.out.println(a);

		for (int i = 0; i < str1.length(); i++) {
			int x = str1.charAt(i);
			int y = str2.charAt(i);

			if (x > 96) {
				x -= 32;
			}
			if (y > 96) {
				y -= 32;
			}

			// System.out.println("x : " + x + ", y : " + y);
			if (x != y) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);

		System.out.println("-----------------------");

		int c = 0;
		int n = 0;

		while (c < str1.length()) {

			if (str1.indexOf("l", c) >= c) {
				// System.out.println("c : " + c);
				// System.out.println("l의 위치 : " + str1.indexOf("l", c));
				c = str1.indexOf("l", c) + 1;
				n++;
				// System.out.println("c+1 : " + c);
				// System.out.println(n);
			}
			if (str1.indexOf("l", c) == str1.lastIndexOf("l")) {
				n++;
				break;
			}
		}
		System.out.println(n);

//		▼ while 을 for 로 수정
//
//		for (int i = 0; i < str1.length(); i++) {
//			if (str1.indexOf('l', i) != -1) {
//				i = (str1.indexOf('l', i));
//				n++;
//			} else {
//				break;
//			}
//		}

		System.out.println("다른 방법-----------------------");

		n = 0;

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'l') {
				n++;
			}
		}
		System.out.println(n);

//		System.out.println("다른 방법-----------------------");
//		
//		String s = sc.next();
//		n= 0;
//		
//		for(int i=0; i<str1.length(); i++) {
//			//if(str1.charAt(i) == s.charAt(0)) { // charAt으로 바꿔서 비교하는 방법
//			//	n++;
//			//}
//			if(s.equals(str1.substring(i, i+1))) { // 둘 다 string 형태로 비교하는 방법
//				n++;
//			}
//		}
//		System.out.println(n);	

		System.out.println("다른 방법-----------------------");

		n = 0;
		while (str1.length() > 0) {
			if (str1.indexOf('l') != -1) {
				n++;
				str1 = str1.substring(str1.indexOf('l') + 1);
			} else {
				break;
			}
		}
		System.out.println(n);

	}
}
