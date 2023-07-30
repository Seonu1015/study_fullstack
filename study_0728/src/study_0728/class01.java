package study_0728;

public class class01 {
	public static void main(String[] args) {
		
//			for(int i = 0; i < 10; i++/*i+=2 등 다양한 내용이 들어간다*/) {
//				System.out.println(i);
//			}
//		
//			int i = 0;		// 초기식
//			while(i<10) {
//				System.out.println(i++);
//				//i++;		// 증감식 -> 위 괄호 안에 i 대신 넣어줘도 된다
//			}
			
			//(0 2 4 6 8 10 ... 100)
//			System.out.print("(");
//			for(int i= 0; i<101; i+=2) {
//				System.out.print(i + " ");
//			}
//			System.out.println(")");
//		
//			int j = 0;							
//			while(j <= 100) {
//				if(j % 2 ==0) {
//				System.out.print(j);
//				}
//				j++;
//			}
//			
			// 구구단
			//-----------2단-------------
			// 2 X 1 = 2
			// 2 X 2 = 4
		
//			for(int i = 1; i<10; i++) {
//				System.out.println("2 X " + i + " = " + i*2);
//			}													
			
			for(int i = 2; i<10; i++) {
				System.out.println("-----------" + i + "단-------------");
				for(int j = 1; j<10; j++) {
					System.out.println(i + " X " + j + " = " + i*j);
				}
			}
			
			int i = 2;
			int j = 1;
			
			while(i<9) {				
				System.out.println("-----------" + i + "단-------------");
				while(j<10) {					
						System.out.println(i + " X " + j + " = " + i*j);
						j++;
				}
				i++;
				j = 1;			// j구간이 완료되고 다시 i구간으로 갔을 때
								// j의 위치를 처음 위치로 수정해줘야 x구간이 끝날 때까지 j구간을 반복하게 된다
								// System.out.println("i : " + i + ", j : " + j); 와 같은 코드를 입력해서
								// 어떻게 코드가 진행됐는지 확인하는 것이 좋다
			}

			i = 2;
			j = 1;
			
			while(i < 10) {
				if(j==1) {
					System.out.println("-----------" + i + "단-------------");
				}
				System.out.println(i + " X " + j + " = " + i*j);
				j++;
				if(j>=10) {
					j = 1;
					i++;
				}
			}
			
			
			
			
	}
}


// [[반복문]]

// for문
// for(1.초기식; 2.조건식; 3.증감식) {
//	코드
// }
// 1. 초기식 -> 처음 시작을 정해준다 -> 어디부터 시작할래?
// 2. 조건식 -> 특정 조건을 만족할 때까지 반복해라 -> 언제까지 할래?
// 3. 증감식 -> 시작부터 끝까지 도달할 때, 도달하는 방식 -> 어떻게 진행할래?

// while문
// while(조건식) {
//	코드
// }
// 언제까지 할래? -> 끝을 담당하는 내용만 들어간다

// for(1.초기식, 초기식, 초기식...; 2.조건식; 3.증감식, 증감식, 증감식...) <- 조건식은 ,로 쓸 수 없다
// for(int i=0, j=0, k=0; i<10 && j<20 && k<100; i++, j+=2, k*=2) <- 여러 개의 초기식, 조건식, 증감식이 들어갈 수 있다
// for(; 2.조건식;) <- while문과 비슷하게 사용할 수 있다
