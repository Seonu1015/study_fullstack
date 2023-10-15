package study_0802;

import java.util.Scanner;

// break, continue
public class Class03 {
	public static void main(String[] args) {

//		for (int i = 1; i <= 100; i++) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();

//		for (int i = 1; i <= 100; i++) {
//			System.out.print(i + " ");
//			break;
//		}
//		
//		System.out.println();

//		for (int i = 1; i <= 100; i++) {
//			System.out.print(i + " ");
//			if (1 == 10) {
//				
//			}
//			break;
//		}

//		System.out.println();
//		
//		for (int i = 1; i <= 100; i++) {
//			if(i %2 ==1) {				
//				continue;
//			}
//			System.out.print(i + " ");
//		}
//		
//		System.out.println("");

		// 사용자가 숫자를 계속 입력 -> 이볅된 값을 합해서 출력
		// 사용자가 음수를 입력하면 종료, 사용자가 두 자리수 이상을 입력하면 더해지지 않는다

		Scanner sc = new Scanner(System.in);
		int plus = 0;

		for (int i = 0; true/*i >= 0*/ ; i++) { // a < 100 하면 틀린다

			int num = sc.nextInt();

			if (num < 0) {
				break;
			} else if (num >= 10) {
				continue;
			} 
			plus += num;
				//System.out.println("plus : " + plus + ", num :" + num);	
		}
		System.out.println(plus);
	
		

	}
}