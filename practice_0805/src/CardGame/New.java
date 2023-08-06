package CardGame;

public class New {

	public static void main(String[] args) {
		
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		
		for (int i = 0; i < 4; i++) {
			int computer = rand(arr);
			arr[i] = computer;
			System.out.println("컴퓨터 : " + computer);
		}

	}
	
	public static int rand(int[] arr) {
		int computer = (int) (Math.random() * 4 + 1);

		for (int k = 0; k < arr.length; k++) {
			if (arr[k] == computer) {
				computer = (int) (Math.random() * 4 + 1);
				k = -1;// k = 0로 할 경우 -> k++ 1번째부터 검사가 되기 때문에 가장 처음 인덱스는 비교를 하지 않게 된다.
				continue;
			} else if (arr[k] == 0) {
				break;
			}
		}
		return computer;
	}

}
