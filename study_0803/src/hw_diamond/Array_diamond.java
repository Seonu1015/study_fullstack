package hw_diamond;

public class Array_diamond {
	public static void main(String[] args) {

		int[][] arr = new int[8][8];
		int num = 0;

		System.out.println("1번 ----------------------");

//		다이아몬드(?)

//		1	2	3	0	0	6	7	8
//		9	10	0	12	13	0	15	16
//		17	0	19	20	21	22	0	24
//		0	26	27	28	29	30	31	0
//		0	34	35	36	37	38	39	0
//		41	0	43	44	45	46	0	48
//		49	50	0	52	53	0	55	56
//		57	58	59	0	0	62	63	64

//		a[0][3], a[0][4]		a[4][0], a[4][7]
//		a[1][2], a[1][5]		a[5][1], a[5][6]
//		a[2][1], a[2][6]		a[6][2], a[6][5]
//		a[3][0], a[3][7]		a[7][3], a[7][4]

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i + j == 3) || (i + j == 11)) {
					arr[i][j] = 0;
				} else if (i < 4 && (i + 4 == j)) {
					arr[i][j] = 0;
				} else if (j < 4 && (j + 4 == i)) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = (i * 8) + j + 1;
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

		System.out.println();
		System.out.println("2번 ----------------------");

//		for (int i = 0; i < 8; i++) {
//		for (int j = 0; j < 8; j++) {
//			if ((i >= 8 / 2 && i % 2 == 1) || (j >= 8 / 2 && j % 2 == 1)) {
//				arr[i][j] = (i * 8) + j + 1;
//			} else if ((i < 8 / 2 && i % 2 == 0) || (j < 8 / 2 && j % 2 == 0)) {
//				arr[i][j] = (i * 8) + j + 1;
//			} else {
//				arr[i][j] =0;
//			}
//		}
//	}

		// ↓ i와 j가 겹치는 곳에서 문제가 발생해서 0이 되어야 할 곳에 계산값이 출력되고 있다

//	 1  2  3  4  5  6  7  8 
//	 9  0 11  0  0 14  0 16 
//	17 18 19 20 21 22 23 24 
//	25  0 27  0  0 30  0 32 
//	33  0 35  0  0 38  0 40 
//	41 42 43 44 45 46 47 48 
//	49  0 51  0  0 54  0 56 
//	57 58 59 60 61 62 63 64 

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

				if ((i > 0 && i < arr.length - 1) && (j > 0 && j < arr.length - 1)) {
					if ((i + j == 3) || (i + j == 11)) {
						arr[i][j] = 0;
					} else if (i < 4 && (i + 4 == j)) {
						arr[i][j] = 0;
					} else if (j < 4 && (j + 4 == i)) {
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
