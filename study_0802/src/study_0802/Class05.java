package study_0802;

// 2차원 배열
public class Class05 {
	public static void main(String[] args) {
		
		int[][] arr = new int[8][8];
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				arr[i][j] = j+1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		int num = 0;
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				num++;
				arr[i][j] = num;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("숙제 ----------------------");
		
		num = 0;
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if((i==1 || i==6) && (j>=1 && j<7)) {
					num++;
					arr[i][j] = 0;
					System.out.print(arr[i][j] + " ");
				} else if((j==1 || j==6) && (i>=1 && i<7)) {
					num++;
					arr[i][j] = 0;
					System.out.print(arr[i][j] + " ");
				} else if((i==3||i==4) && (j == 3 || j==4)) {
					num++;
					arr[i][j] = 0;
					System.out.print(arr[i][j] + " ");
				}
				else {
					num++;
					arr[i][j] = num;
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}

// 아래 빈칸은 0이 들어가게 출력해보자

// 1  2  3  4  5  6  7  8 
// 9                   16 
//17    19 20 21 22    24 
//25    27       30    32 
//33    35       38    40 
//41    43 44 45 46    48 
//49                   56 
//57 58 59 60 61 62 63 64 
