package study_0727;
import java.util.Scanner;						// scanner 를 사용할 때 실행하기 위한 코드

public class class03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;									// 변수 선언
		double d = 123.123;						// 변수 선언과 초기화
		// a = 12;								// 변수 초기화
		// a = a + 100;							// 초기화 이전엔 쓰레기 값이 들어가있다
		
//		a = scan.nextInt();
//		System.out.println("a : " + a);
//		
//		d = scan.nextDouble();
//		System.out.println("d : " + d);
//		
//		String str;
//		str = scan.next();						// next 는 공백을 잘라버림, Hello World 를 입력하면
//		System.out.println("str : " + str);		// Hello 출력
//		str = scan.next();
//		System.out.println("str : " + str);		// World 출력
//
//		scan.nextLine();						// 아래 nextline 코드가 정상적으로 출력되기 위한 장치
//												// 이 장치가 없으면 위에서 입력한 엔터를 nextline 이 받아들여서 출력하게 된다
//		
//		str = scan.nextLine();					// 입력한 문장을 모두 출력하는 코드
//		System.out.println("str : " + str);
		
		
		// 실수 2개를 입력받고, 2개의 합을 출력
		
//		double f;
//		double e;
		
		double f, e;
		System.out.println("실수 2개를 입력하세요 : ");
		
		f = scan.nextDouble();
		e = scan.nextDouble();
//		System.out.println(f + e);
		System.out.println("두 수의 합 : " + (f + e));
		
		
		// 철수, 영희가 둘 다 시험에서 100점을 맞으면 -> 사용자 2개 입력받아 true나 false를 출력
		// 철수 : ?점, 영희 : ?점, 성공 : true or false
		
//		int c;
//		int y;

		int c, y;
		System.out.println("철수와 영희의 점수를 입력하세요 : ");
				
		c = scan.nextInt();
		y = scan.nextInt();
		System.out.println("철수 : " + c + "점, 영희 : " + y + "점, 성공 : " + (c >= 100 && y >= 100));
		
		


	}
}

// 출력 - System.out
// 입력 - System.in 아님!! Scanner 를 사용





