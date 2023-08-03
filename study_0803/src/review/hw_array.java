package review;

public class hw_array {
	public static void main(String[] args) {

		int[][] arr = new int[8][8];

		System.out.println("1번 ----------------------");

		// int num; <- 변수 하나를 줄일 수 있어서 좋은 코드다
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				arr[j][i] = (j * 8) + i + 1;
			}
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("2번 ----------------------");

		int num = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i == 1 || i == 6) && (j >= 1 && j < 7)) {
					num++;
					arr[i][j] = 0;
					// System.out.print(arr[i][j] + " ");
				} else if ((j == 1 || j == 6) && (i >= 1 && i < 7)) {
					num++;
					arr[i][j] = 0;
					// System.out.print(arr[i][j] + " ");
				} else if ((i == 3 || i == 4) && (j == 3 || j == 4)) {
					num++;
					arr[i][j] = 0;
					// System.out.print(arr[i][j] + " ");
				} else {
					num++;
					arr[i][j] = num;
					// System.out.print(arr[i][j] + " ");
				}
			}
			// System.out.println();
		}

		// 위 코드에서 출력도 반복되고 있으니 따로 빼줄 수 있다
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (arr[i][j] < 10) {
					System.out.print(" " + arr[i][j] + " ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("2번 review ---------------");

//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 8; j++) {
//				if ((i >= 8 / 2 && i % 2 == 1) || (j >= 8 / 2 && j % 2 == 1)) {
//					arr[i][j] = (i * 8) + j + 1;
//				} else if ((i < 8 / 2 && i % 2 == 0) || (j < 8 / 2 && j % 2 == 0)) {
//					arr[i][j] = (i * 8) + j + 1;
//				} else {
//					arr[i][j] =0;
//				}
//			}
//		}

		// ↓ i와 j가 겹치는 곳에서 문제가 발생해서 0이 되어야 할 곳에 계산값이 출력되고 있다

//		 1  2  3  4  5  6  7  8 
//		 9  0 11  0  0 14  0 16 
//		17 18 19 20 21 22 23 24 
//		25  0 27  0  0 30  0 32 
//		33  0 35  0  0 38  0 40 
//		41 42 43 44 45 46 47 48 
//		49  0 51  0  0 54  0 56 
//		57 58 59 60 61 62 63 64 
		
		// 숙제!! 0으로 출력되지 않는 부분을 고쳐보자!

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
				if ((i >= 8 / 2 && i % 2 == 1) || (j >= 8 / 2 && j % 2 == 1)) {
					arr[i][j] = (i * 8) + j + 1;
				} else if ((i < 8 / 2 && i % 2 == 0) || (j < 8 / 2 && j % 2 == 0)) {
					arr[i][j] = (i * 8) + j + 1;
				} else {
					arr[i][j] = 0;
				}

				// 수정 필요함!!
				if ((i > 0 && i < arr.length - 1) && ( j > 0 && j < arr.length - 1)) {
					if(i+j == 3 || i+j==6 || i+j==8 || i+j ==11) {
						if(i ==0 || j==0) {
							continue;
						}
						arr[i][j] = 0;
					}
				}

			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (arr[i][j] < 10) {
					System.out.print(" " + arr[i][j] + " ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}
