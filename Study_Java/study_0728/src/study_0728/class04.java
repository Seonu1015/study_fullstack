package study_0728;

import java.util.Scanner;

public class class04 {
	public static void main(String[] args) {
		
		
		// test02 를 배열을 사용하여 다시 작성 <- 연습하기
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = 0;
		}
		int max = 0;
		int min = 100;
		
		for(int i=0; i<5; i++) {
			int score = sc.nextInt();
			if(max < score) {
				max = score;
			}
			if(min > score) {
				min = score;
			}
			
			if(score >= 90) {
				System.out.println("A학점");
				arr[0]++;					// arr[0] 에 "A학점" 을 넣어주겠다!!
			}
			else if(score>=80) {
				System.out.println("B학점");
				arr[1]++;
			}
			else if(score >= 70) {
				System.out.println("C학점");
				arr[2]++;
			}
			else if(score >= 60 ) {
				System.out.println("D학점");
				arr[3]++;
			}
			else {
				System.out.println("F학점");
				arr[4]++;
			}
		}
		System.out.println("A : " + arr[0] + ", B : " + arr[1] + ", C : " + arr[2] + ", D : " + arr[3] + 
				", F : " + arr[4]);
		System.out.println("Max : " + max + ", Min : " + min);

		
		
		
		
	}
}