package study_0728;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {

		
		
		//구구단 -> Scanner 1을 입력하면 홀수단만 출력되고, 2를 입력하면 짝수단만 출력되도록
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i<10; i++) {
			if(num == 1) {
				if(i % 2 == 0) {
					continue;
				}
			}
			else {
				if(i % 2 == 1) {
					continue;
				}
			}
			System.out.println("-----------" + i + "단-------------");
			for(int j = 1; j<10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
				
		// 해설
		
			
		
		
		
		
		
		
	}
}
