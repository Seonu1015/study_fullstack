package study_0803;

// 함수
// 강의 내용 그대로 쓴건데 오류 발생
public class Class01 {
	public static void main(String[] args) {

		int arr[][] = new int[8][8];
		
		for (int i = 0; i < 8; i++) {
			func1(arr, i);
		}
	}
	
	
	static void func1(int[][] arr, int i) {
		for (int j = 0; j < 8; j++) {
			arr[i][j] = (i * 8) + j + 1;
			printArr(arr, i, j);
		}
		newLine();
	}
	
	static void printArr(int[][] arr, int i, int j) {
		System.out.print(arr[i][j] + " ");
	}
	
	static void newLine() {
		System.out.println();
	}
}

