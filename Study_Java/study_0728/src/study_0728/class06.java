package study_0728;

public class class06 {
	public static void main(String[] args) {
		
		int[][] student = new int[6][4];
		
		for(int i = 0; i<6; i++) {
			// student[i][i] = 20;			// 0 0 1 1 2 2 << 이렇게 입력된다
			for(int j = 0; j<4; j++) {
				student[i][j] = 20;
			}
		}
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(student[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// 10X10 배열을 만들어서 1~100까지 넣어주고 사각형으로 출력
		
		
		int[][] num = new int[10][10];
		
		int n = 1;
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				num[i][j] = n++;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("-----------------------");
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				num[i][j] = i+j+1;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int i=0, k=0; i<10; i++, k+=10) {
			for(int j=0; j<10; j++) {
				num[i][j] = k+j+1;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				num[i][j] = 10*i+j+1;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}
}

// 이전 단계는 1차원 배열이었다

// 다차원 배열
// 자료형[][] 배열명 = new 자료형[크기][크기] <- 2차원 배열 