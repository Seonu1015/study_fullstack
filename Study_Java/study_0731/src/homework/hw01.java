package homework;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {

		String[] role = { "노예", "시민", "귀족", "왕" };
		Scanner sc = new Scanner(System.in);
		int score1 = 0;
		int score2 = 0;
		int hr1 = 0;
		int hr2 = 0;
		int[] comCards = new int[4];

		for (int i = 0; i < 4; i++) {
			comCards[i] = 0;
		}

		// System.out.print("컴퓨터가 뽑을 카드 : ");
		for (int i = 0, j = 0; i < 4; i++) {
			int num = (int) (Math.random() * 4) + 1;
			int check = 0;
			for (int k = 0; k <= j; k++) {
				if (comCards[k] == num) {
					i--;
					check = 1;
					break;
				}
			}
			if (check == 1) {
				continue;
			}

			comCards[j] = num;
			j++;
			// System.out.print(num + " ");
		}

		System.out.println();

		for (int i = 0; i < 4; i++) {
			System.out.println("카드 : {1.거지, 2.시민, 3.귀족, 4.왕}");
			System.out.println("------------- Fight -------------");
			System.out.println("당신의 차례 : ");
			int player1 = sc.nextInt();

			int player2 = comCards[i];
			System.out.println("컴퓨터의 차례 : " + player2);

			if ((player1 == 1 && player2 == 4) || (player1 == 4 && player2 == 1)) {
				System.out.println("노예와 왕이 만났습니다!");
				if (player1 == 1) {
					score1 += 4;
					hr1 = 1;
				} else {
					score2 += 4;
					hr2 = 1;
				}
				break;
			} else if (player1 > player2) {
				score1++;
				System.out.println("당신이 이겼습니다! ^o^");
			} else if (player2 > player1) {
				score2++;
				System.out.println("컴퓨터가 이겼습니다. T^T");
			} else {
				System.out.println("무승부입니다. o_o;");
			}
		}

		System.out.println("--------- 최종 우승자는!!! ---------");
		if (hr1 == 1) {
			System.out.println("당신이 히든 룰로 승리하였습니다. ^o^");
		} else if (hr2 == 1) {
			System.out.println("컴퓨터가 히든 룰로 승리하였습니다. T^T");
		} else if (score1 > score2) {
			System.out.println("축하합니다! 당신이 승리하였습니다. ^o^");
		} else if (score1 < score2) {
			System.out.println("컴퓨터가 승리하였습니다. 다음에 다시 도전하세요. T^T");
		} else {
			System.out.println("무승부입니다. o_o;");
		}

	}

}
