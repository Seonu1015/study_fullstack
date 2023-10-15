package study_0727;

public class class02 {

	public static void main(String[] args) {
		System.out.println(5 + 2);
		System.out.println(5 - 2);
		System.out.println(5 * 2);
		System.out.println(5.0 / 2);					// 5/2는 정수끼리 연산했기에  2로 츨력, 5.0/2(5/2.0)처럼 실수로 바꿔줘야 2.5가 출력
		System.out.println(5 % 2);
		
		System.out.println(5 < 6);	// true
		System.out.println(5 > 6);	// false
		System.out.println(5 <= 6);	// true
		System.out.println(6 >= 6);	// true
		System.out.println(5 == 5);	// true
		System.out.println(6 != 5);	// true
		
		System.out.println(!(5 == 5));	// !()
		
		int a = 1;
		int b = 2;
		
		System.out.println(a > b);
		System.out.println(a * b);
		System.out.println(!(a == b));
		
		// b가 1보다 크고 10보다 작은지?
		// System.out.println(1 < b < 10);	<< 이건 안돼!! why : 1<b 까지 연산해서 true를 리턴, true=1 인 상태에서 1<10 을 연산하게 된다
		System.out.println(1 < b && b < 10);
		
		// a,b 둘 중 하나라도 음수인지?
		System.out.println(a < 0 || b < 0);
		
		int num_123 = 123;
			num_123 = num_123 + 100;
			num_123 += 100;
			System.out.println(num_123);	// 323
			
		System.out.println(num_123++); 		// 324 <- 위에 num_123 += 100은 더이상 진행되지 않는다
		System.out.println(++num_123); 		// 325
		System.out.println(num_123);		// 325
		System.out.println(num_123--);		// 324
		System.out.println(--num_123);		// 323
		System.out.println(num_123);		// 323
		
		// sys 쓰고 ctrl + 스페이스 하면 코드 가져올 수 있음	
		
		
			
	}

}


// [[연산자]]

// 산술연산자 - +, -, *, /, %
// 비교연산자 - <, >, <=, >=, ==, !=
// 부정연산자 - !
// 논리연산자 - &&(and), ||(or)
// 대입연산자 - a = b -> 우항의 '값'을 좌항에 대입한다
//		자료형 변수명 = 값
//		식별자 - 숫자가 제일 앞에 올 수 없다(abc124는 가능하지만 124abc는 안된다), 특수문자 - 언더바(_)만 사용이 가능하다
//		int, double, out, System, print... - 변수명으로 사용할 수 없다
//		변수 - 전부 소문자로 작성 / 클래스, 함수 - 첫 글자만 대문자
//		snake표기법 - helloWorld / camel표기법 - AsdfAsdf, Print_Out 
// 증감연산자 - +=, -=, *=, /=, %=, ++(+1), --(-1) <- 값을 증가시키거나 감소시키거나...
//		전위증가 전위감소 -> ++num, --num -> 코드를 실행하기 전에
//		후위증가 후위감소 -> num++, num-- -> 코드를 실행한 후에
// 비트연산자 - &, | <- 이진법 내에서 연산을 진행할 때 사용

// 주석 -> 컴퓨터는 못 읽고 사람만 읽을 수 있는 메모, ctrl + / (단축키)
//		/* ~ */ : 사이의 내용은 주석으로 처리된다, ctrl + shift + / (단축키)

// 들여쓰기 TAB, 내어쓰기 TAP + shift





