package study_0728;

public class homework01 {
	public static void main(String[] args) {

		String star = "*";
		String n = "n";

		String[][] arr = new String[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i >= j) {
					arr[i][j] = star;
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}

		System.out.println("-------------------------------"); // <- 여기 해결 필요

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				if (i < j) {
					arr[i][j] = " ";
					System.out.print(arr[i][j]);
				} else {
					arr[i][j] = star;
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}

		System.out.println("-------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i <= j) {
					arr[i][j] = star;
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}

		System.out.println("-------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i <= j) {
					arr[i][j] = star;
					System.out.print(arr[i][j]);
				} else {
					arr[i][j] = " ";
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}

	}
}

//		*
//		**
//		***
//		****
//		*****
//		
//		    *    j>=i, i<j " " / i>=j "*"
//		   **
//		  ***
//		 ****
//		*****
//		
//		*****
//		****
//		***
//		**
//		*
//		
//		*****
//		 ****
//		  ***
//		   **
//		    *
//		    
//		    "*", " ", "\n" 만 사용해서 위의 모양을 만들어보자