package hw_CardGame;

public class Computer_copy {

	String[] cards;
	int cardIndex;
	int[] arr = new int[4];

	Computer_copy() {
		cards = new String[] { "거지", "시민", "귀족", "왕" };
	}

	Computer_copy(String[] cards) {
		this.drawCard();
		this.cards = new String[] { cards[cardIndex] };
	}

	void drawCard() {
		
		cardIndex = (int) (Math.random() * 4);
		
		for (int i = 0; i < 4; i++) {
			if (arr[i] == cardIndex) {
				cardIndex = (int) (Math.random() * 4);
				i = -1;
				continue;
			} else if (arr[i] == 0) {
				arr[i] = cardIndex;
				break;
			}
		}
		
//		중복으로 뽑히는 거 해결 못함.... ㅠㅠ
//		여기서는 중복되지 않는 4개를 뽑긴 하는데, 메인으로 넘어갈 때 그중 하나가 넘어가서 결국 중복이 발생하고 있음
//		여기서 만든 배열을 그대로 옮겨서 라운드때 순서대로 출력하게 만들면 될 것 같은데...
//		ArrayList<객체> 어레이리스트명 = new ArrayList<>();	<- 이걸 쓰나?
		
//		걍 중복으로 뽑으면서 게임하면 안되나... 히든룰로 져도 뭐... 자기 운인거 아닐까...
		
		System.out.println("컴퓨터가 뽑은 카드 : " + (cardIndex + 1) + ". " + cards[cardIndex]);
		// 승패 여부를 가리기 위해 숫자로 가져오기로 결정!
	}
}