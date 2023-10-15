package study_0802;

// 변수
public class Class01 {
	public static void main(String[] args) {
		
		//1번
		int num1 = 10;
		int num2 = 20;
		
		//2번
		System.out.println(num1++); // 속해있는 해당 코드가 끝나고 나면 연산을 진행한다
		System.out.println("num1 : " + num1 + ", num2 : " + num2);

		int n1 = 1;
		int n2 = 2;
		int n3 = 3;

		System.out.println(n1 >= --n2 || n3 != 3 && n3 > n2 && n3-- > n2++);
		// T || F && T && T = T && T && T

	}
}

// 교육과정 : "자바 & 파이썬" -> 데이터베이트 -> 웹프론트(HTML, CSS, JSP) -> react -> "백엔드"