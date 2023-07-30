package study_0728;

import java.util.Scanner;

public class class02 {
	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i == 5) {
				break;
			}
		}

		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.println("i : " + i + ", j : " + j);
				if(j ==5) {
					break;		// 자기 바로 위의 반복문 구간을 빠져나간다
				}
			}
		}
		
		for(int i=0; i<100; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		//10
		//9
		//8
		//7
		//...
		//발사!!
		
		for(int i=10; i>=0; i--) {
			if(i == 0) {
				System.out.println("발사!!");
				break;
			}
			System.out.println(i);
		}
		
	
		
		
	}
}


// break

// switch -> break를 쓰면 switch문을 빠져나왔다.
// break -> for문, while문, switch문을 빠져나올 수 있게 도와준다.

// continue
// for문, while문을 건너뛸 수 있게 -> 내 아래 코드 더 이상 실행하지 말고 계속해줘