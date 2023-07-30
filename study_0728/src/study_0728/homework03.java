package study_0728;

import java.util.Scanner;

public class homework03 {
	public static void main(String[] args) {

		String[] role = { "노예", "시민", "귀족", "왕" };
		int[] score = { 0, 1, 2, 3 };

		Scanner scan = new Scanner(System.in);

		int score1 = 0; // 당신의 누적 점수
		int score2 = 0; // 상대방의 누적 점수

		for (int round = 1; round <= 5; round++) { // 게임 진행 횟수
			System.out.println("------- Round " + round + " -------");

			System.out.print("당신이 선택한 카드는 무엇입니까? (노예, 시민, 귀족, 왕): ");
			String role1 = scan.next();
			System.out.print("상대방이 선택한 카드는 무엇입니까? (노예, 시민, 귀족, 왕): ");
			String role2 = scan.next();

			// 각 카드의 인덱스 찾기
			int role1index = -1;
			int role2index = -1; // 초기화를 시켜줘야 하므로 수치 입력, 노예 카드의 인덱스가 0이므로 그보다 낮은 수 입력

			for (int i = 0; i < 4; i++) {
				if (role[i].equals(role1)) {
					role1index = i;
				}
				if (role[i].equals(role2)) {
					role2index = i;
				}
			}

			// 점수 판정
			if (role1index != -1 && role2index != -1) {
				if ((role1.equals("노예") && role2.equals("왕")) || (role1.equals("왕") && role2.equals("노예"))) {
					if (role1.equals("노예")) {
						score1 = 100; // 마지막 승리여부 판단을 위해 높은 점수를 부여 <- 다른 방법이 있을까?
						System.out.println("노예가 왕을 죽였습니다. 게임이 종료됩니다.");
					} else {
						score2 = 100;
						System.out.println("노예가 왕을 죽였습니다. 게임이 종료됩니다.");
					}
					break; // 노예가 왕을 죽이고 게임을 승리 <- break는 가장 가까운 반복문인 for문을 빠져나오게 한다
							// 즉, break가 실행되면 아래 else~ sys출력까지 진행이 이뤄지지 않음
				} else { // 라운드 승리자에게 점수 부여&누적
					if (score[role1index] > score[role2index]) {
						score1 += score[role1index];
						System.out.println("당신이 이겼습니다.");
					} else if (score[role1index] < score[role2index]) {
						score2 += score[role2index];
						System.out.println("상대방이 이겼습니다.");
					} else {
						System.out.println("무승부입니다.");
					}
				}
			}

			System.out.println("당신의 점수는 " + score1 + "점 입니다.");
			System.out.println("상대방의 점수는 " + score2 + "점 입니다.");
			System.out.println();
		}

		if (score1 > score2) {
			System.out.println("축하합니다! 당신이 최종 승리하였습니다!");
		} else if (score1 < score2) {
			System.out.println("상대방이 최종 승리하였습니다. 다음에 다시 도전해보세요!");
		} else {
			System.out.println("무승부입니다. 재미있는 게임이었습니다!");
		}
	}
}

//		왕 거지 게임
// {"노예" < "시민" < "귀족" < "왕"}
// 노예가 왕을 만나면 왕을 죽이고 게임을 승리

// 2명의 플레이어가 있다고 가정
// 왕이 이기면 3점 귀족이 이기면 2점 시민이 이기면 1점 <- 인덱스 번호랑 같은 점수로 계산
// 게임을 x번 진행해서 최종 누적점수가 높은 사람이 승리
// 노예가 왕을 만나면 노예를 낸 사람이 이기고 더이상 게임을 진행하지 않음