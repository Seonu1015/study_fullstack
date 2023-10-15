package CardGame;

public class Computer extends Card {
	
	int cardNumber;
	int count = 0;
	
	String name;

	Computer(String name) {
		this.name = name;
	}
	
	int inputComputer() {
		cardNumber = rand(super.arr);
		super.arr[count++] = cardNumber;
		System.out.println("컴퓨터 : " + cardNumber);
		
		return cardNumber;
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
