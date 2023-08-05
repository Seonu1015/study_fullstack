package Array_Swirl;

public class Array_Diamond {
	public static void main(String[] args) {

int[][] arr = new int[8][8];
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				arr[i][j] = i*8+j+1;
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

//기본형에서 시계 방향으로 소용돌이 치듯이 채워보자