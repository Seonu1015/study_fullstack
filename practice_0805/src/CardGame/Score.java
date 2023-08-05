package CardGame;

public class Score {

	int score1;
	int score2;
	int hr;

	Score() {
		score1 = 0;
		score2 = 0;
		hr = 0;
	}

	void calScore(String playerCard1, String playerCard2) {
		int power1 = getPower(playerCard1);
		int power2 = getPower(playerCard2);

		if (power1 == 1 && power2 == 4) {
			hr = 1;
		} else if (power1 == 4 && power2 == 1) {
			hr = 2;
		} else {
			hr = 0;
		}
		
		if(hr ==0) {
			if (power1 == power2) {
				System.out.println("무승부입니다!");
				return;
			} else if (power1 > power2) {
				System.out.println("플레이어1이 승리하였습니다!");
				score1++;
			} else if (power1 < power2) {
				System.out.println("플레이어2가 승리하였습니다!");
				score2++;
			}
		} else if (hr ==1) {
			System.out.println("거지가 왕을 죽이고 게임을 종료합니다. 플레이어1이 최종 우승하였습니다.");
		} else if(hr ==2) {
			System.out.println("거지가 왕을 죽이고 게임을 종료합니다. 플레이어2가 최종 우승하였습니다.");
		}
	}

	int getPower(String card) {
		if ("거지".equals(card)) {
			return 1;
		} else if ("시민".equals(card)) {
			return 2;
		} else if ("귀족".equals(card)) {
			return 3;
		} else if ("왕".equals(card)) {
			return 4;
		} else {
			return 0;
		}
	}
	
    int getScorePlayer1() {
        return score1;
    }

    int getScorePlayer2() {
        return score2;
    }
    
    boolean isGameFinished() {
        return hr == 1 || hr == 2;
    }
    
    void printWinner() {
        if (score1 > score2) {
            System.out.println("플레이어1이 승리하였습니다!");
        } else if (score1 < score2) {
            System.out.println("플레이어2가 승리하였습니다!");
        } else {
            System.out.println("무승부입니다!");
        }
    }
}
