package home_0730;

import java.util.Scanner;

public class practice_0730 {
	public static void main(String[] args) {
		
		// while문
		
		// 초기식				<- 초기식과 증감식은 필수는 아니지만 대부분 사용한다
		// while(조건식) {
		// 	실행구문;
		// 	증감식;
		// }
		
		int num = 0, sum = 0;
		while(sum < 100) {
			sum += num;
			num++;
		}
		System.out.println((num-1) + "까지의 합 = " + sum);
		
		// 교재 4장
		
		// 연습문제 3번
		
		for(int i=0; ; i++) {
			if(i % 2 == 1) {
				continue;
			}
			if(i > 10) {
				break;
			}
			System.out.print(i + " ");
		}
		
		// 연습문제 4번
		int i1 = 10;
		while(i1 > 0) {
			System.out.println(i1);
			i1 -= 2;
		}
		
		System.out.println("----------------------");
		
		// 연습문제 5번
				for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 2) {
					continue;
				}
				if(j == 1) {
					break;
				}
				System.out.println(i + " " + j + " A");
			}
		}
		
		System.out.println("----------------------");
		
		// 연습문제 6번		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 3 && j == 2) {
					break;
				}
				System.out.println(i + " " + j);
			}			
		}
		
		System.out.println("----------------------");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 3 && j == 2) {
					i = 100;			// i의 값을 임의로 100으로 변경하고 내부 루프가 종료되었을 때,
										// i의 값은 100이 되었으므로 외부 반복문을 종료시키기 위해서 넣은 것이다
					break;				// break는 가장 가까운 루프를 종료시키기 때문에
										// 외부 루프는 내부 루프가 종료되도 계속 진행된다
										// 그래서 출력을 확인하면 앞에 i=100을 넣지 않은 경우
										// 3 1 여기까지 출력되고 break 된 다음 4 0 부터 다시 시작된 것이다
				}
				System.out.println(i + " " + j);
			}			
		}
		
		System.out.println("----------------------");
		
		
		// 교재 5장
		
		// 연습문제 5번, 6번
		int[][] a = new int[2][];
		a[0] = new int[] {1, 3, 5};
		a[1] = new int[] {7,9};
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}
		
		// 
		
		
		
		
		
		
		
		
		
	}
}
