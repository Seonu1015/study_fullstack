package study_0727;
import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		
		// 2. 점수 하나 입력 -> 학점을 A, B, C, D, F (점수 기준은 자율)
		
		int score;
		System.out.println("점수를 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		if(score >= 90) {
			System.out.println("학점은 A입니다");
		}
		else if(score >= 80) {
			System.out.println("학점은 B입니다");
		}
		else if(score >= 70) {
			System.out.println("학점은 C입니다");
		}
		else if(score >= 60) {
			System.out.println("학점은 D입니다");
		}
		else {
			System.out.println("학점은 F입니다");
		}

	}

}
