package CardGame;

public class Computer extends Card {
	
	int cardNumber;
	
	void inputComputer() {
		cardNumber = rand(super.arr);
		super.arr[i] = cardNumber;
		System.out.println("컴퓨터 : " + cardNumber);
	}	
	
	int rand(int[] arr) {
		int computer = (int) (Math.random() * 4 + 1);

		for (int k = 0; k < arr.length; k++) {
			if (arr[k] == computer) {
				computer = (int) (Math.random() * 4 + 1);
				k = -1;
				continue;
			} else if (arr[k] == 0) {
				break;
			}
		}
		return computer;
	}
	
	
	
}
