package study_0728;

public class homework02 {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int n = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = n++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");

		n = 1;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				arr[i][j] = n++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");

		n = 1;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 4; j >= 0; j--) {
					arr[i][j] = n++;
				}
			} else {
				for (int j = 0; j < 5; j++) {
					arr[i][j] = n++;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");

		n = 1;
		for (int j = 0; j < 5; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < 5; i++) {
					arr[i][j] = n++;
				}
			} else {
				for (int i = 4; i >= 0; i--) {
					arr[i][j] = n++;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}

// i가 가로, j가 세로

//			1 2 3 4 5
//			6 7 8 9 10
//			11 12 13 14 15
//			16 17 18 19 20
//			21 22 23 24 25
//			
//			1 6 11 16 21
//			2 7 12 17 22
//			3 8 13 18 23
//			4 9 14 19 24
//			5 10 15 20 25
//			
//			5 4 3 2 1
//			6 7 8 9 10
//			15 14 13 12 11
//			16 17 18 19 20
//			25 24 23 22 21
//			
//			1 10 11 20 21
//			2 9 12 19 22
//			3 8 13 18 23
//			4 7 14 17 24
//			5 6 15 16 25
//			
//			반복문 2개 채워넣기 -> 출력
//			
//			for(int i=0; i<5; i++) {
//				for(int j=0; j<5, j++) {
//					System.out.println(배열이름[i][j] + " ");
//				}
//				System.out.println();
//			}