package study_0727;
import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {


		// 3. 점수 5개를 입력받는다. 최고점을 출력.
		
		int a, b, c, d, e;
		System.out.println("점수 5개를 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		e = scan.nextInt();
		
		if(a > b && a > c && a > d && a > e) {
			System.out.println("최고점은 " + a + "점 입니다.");
		}
		else if(b > c && b > d && b > e) {
			System.out.println("최고점은 " + b + "점 입니다.");
		}
		else if(c > d && c > e) {
			System.out.println("최고점은 " + c + "점 입니다.");
		}
		else if(d > e) {
			System.out.println("최고점은 " + d + "점 입니다.");
		}
		else {
			System.out.println("최고점은 " + e + "점 입니다.");
		}
		
				
		// 수정
		
		int max = a;
		
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		if(e > max) {
			max = e;
		}
		System.out.println("최고점은 " + max + "점 입니다.");
				
				
		// 해설
		
		int max_n = 0;
		
		System.out.println("점수를 입력하세요 : ");
		int n1 = scan.nextInt();
		if(max_n < n1) {
			max_n = n1;
		}
		System.out.println("점수를 입력하세요 : ");
		int n2 = scan.nextInt();
		if(max_n < n2) {
			max_n = n2;
		}
		System.out.println("점수를 입력하세요 : ");
		int n3 = scan.nextInt();
		if(max_n < n3) {
			max_n = n3;
		}
		System.out.println("점수를 입력하세요 : ");
		int n4 = scan.nextInt();
		if(max_n < n4) {
			max_n = n4;
		}
		System.out.println("점수를 입력하세요 : ");
		int n5 = scan.nextInt();
		if(max_n < n5) {
			max_n = n5;
		}
		System.out.println("최고점은 " + max_n + "점 입니다.");
		
	}

}
