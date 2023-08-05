package study_0731;

public class class05 {
	public static void main(String[] args) {

		// Math.random();
		// Math 도 String 처럼 객체다

		for (int i = 0; i < 20; i++) {
			System.out.print(((int) (Math.random() * 10) + 1) + " "); // 0~1
		}

		System.out.println();

		int[] arr = new int[7];

		for (int i = 0; i < 7; i++) {
			arr[i] = 0;
		}

		for (int i = 0, j = 0; i < 7; i++) {
			int num = (int) (Math.random() * 45) + 1;
			int check = 0;
			
			//중복되는 값이 있는지 확인하는 작업 ↓
			for (int k = 0; k <= j; k++) {
				if (arr[k] == num) {
					i--;
					check = 1;
					break;
				}
			}
			
			if (check == 1) {
				continue;
			}
			
			arr[j] = num;
			j++;
			System.out.print(num + " ");
		}

	}
}

// 랜덤 난수 1~4를 출력할 수 있도록 하여, 카드 게임을 컴퓨터 vs 사람으로 수정해보기
// (함수화를 할 수 있으면 해보기)
