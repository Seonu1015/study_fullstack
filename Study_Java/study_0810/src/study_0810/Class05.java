package study_0810;

public class Class05 {

	public static void main(String[] args) {
		
		//보충수업 내용 추가하기

		int[][] arr = new int[8][8];

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				arr[i][j] = 8*i+j+1;
//				if(i<arr.length/2 && i%2==1) {
//					if(!(j<arr.length/2 && j%2==0 || (j>=arr.length/2 && j%2==1))) {
//						arr[i][j] = 0;
//					}
//				} else if(i>=arr.length/2 && i%2==0) {
//					if(!(j<arr.length/2 && j%2==0 || (j>=arr.length/2 && j%2==1))) {
//						arr[i][j] = 0;
//					}
//				}
//				if(j<arr.length/2 && j%2==1) {
//					if(!(i<arr.length/2 && i%2==0 || (i>=arr.length/2 && i%2==1))) {
//						arr[i][j] = 0;
//					}
//				} else if(j>=arr.length/2 && j%2==0) {
//					if(!(i<arr.length/2 && i%2==0 || (i>=arr.length/2 && i%2==1))) {
//						arr[i][j] = 0;
//					}
//				}
//			}
//		}
		
		
		
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
