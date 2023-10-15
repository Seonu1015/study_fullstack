package study_0728;

import java.util.Scanner;

public class class05 {
	public static void main(String[] args) {
		
//		String[] str = new String[5];
//		
//		Scanner scan = new Scanner(System.in);
//		for(int i=0; i<5; i++) {
//			str[i] = scan.next();
//		}											// <- 5칸 입력받겠다!!
//
//		for(int i=0; i<5; i++) {
//			System.out.println(str[i]);
//		}
		
		// String 배열 5개짜리 -> 사용자 입력 받은 값이 배열에 들어있는지, 없는지 찾아보자
		
		String[] str = new String[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			str[i] = sc.next();		
		}
		
		String input = sc.next();
		for(int i=0; i<5; i++) {
			if(input.equals(str[i])) {		// input 과 str[i] 자리가 바뀌어도 상관없음.
											// input == str[i] 과 같은 표현 단, string 형식이니까 equals 를 쓰겠다
				System.out.println("있습니다.");
				break;							// break 가 없었다면 "없습니다."가 같이 출력된다
			}
			if(i == 4) {
				System.out.println("없습니다.");
			}
		}
		
		
	
		
		
	}
}
