package DiceGame;

import java.util.ArrayList;
import java.util.Scanner;

public class DicePlayer extends Player {
	
	int diceValue;
	ArrayList<Integer> dicePlayerValue;
	int roundCount;
	
	DicePlayer() {
		dicePlayerValue = new ArrayList<>();
	}
	
	void playGame(int playerCount) {
		for(int i=0; i<playerCount; i++) {
			this.rollDice();
			dicePlayerValue.add(diceValue);
			
		}
		int maxValue = findMaxValue(dicePlayerValue);
		System.out.println(dicePlayerValue);
	}
	
	void rollDice() {
		diceValue = (int) (Math.random()*6) +1;
	}
	
	void diceRound() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 라운드를 진행하시겠습니까? :");
		this.roundCount = sc.nextInt();
	}
	
	int findMaxValue(ArrayList<Integer> values) {
		int maxValue = values.get(0);
		for(int i=0; i<values.size(); i++) {
			int nextValue = values.get(i);
			if(nextValue > maxValue) {
				maxValue = nextValue;
			}
		}
		return maxValue;
	}
	
    int findMaxValueIndex(ArrayList<Integer> values) {
        int maxValue = values.get(0);
        int maxIndex = 0;
        for (int i = 0; i < values.size(); i++) {
            int nextValue = values.get(i);
            if (nextValue > maxValue) {
                maxValue = nextValue;
                maxIndex = i;
            }
        }
        return maxIndex;
    }	
	
}
