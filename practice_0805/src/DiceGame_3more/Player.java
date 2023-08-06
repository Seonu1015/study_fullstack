package DiceGame_3more;

import java.util.Scanner;

public class Player {

	String name;

	// 플레이어 이름은 입력할 거니까 기본생성자만 있어도 충분할 듯?
	// 기본생성자는 입력을 안해도 무방

	void inputPlayerInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("플레이어 이름을 입력하세요 : ");
		name = sc.nextLine();
	}

	void printPlayerInfo() {
		System.out.println("플레이어 이름 : " + name);
	}

	static int inputPlayerCount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 명이서 게임을 진행하시겠습니까? : ");
		int count = sc.nextInt();
		return count;
	}

	// static 없이 했더니 메인에서 빨간줄...
	// static 을 쓰는 이유?
	// static 이 없으면 생성되는 객체마다 고유한 값을 가지게 되고
	// static 이 있으면 모든 객체가 하나의 count 변수를 공유하게 된다

	static void printPlayersInfo(int playerCount) {
		Player[] players = new Player[playerCount];

		for (int i = 0; i < playerCount; i++) {
			System.out.print((i + 1) + "번째 ");
			players[i] = new Player();
			players[i].inputPlayerInfo();
		}

		System.out.println("----- 게임에 참가한 플레이어 " + players.length + "명 -----");
		for (int i = 0; i < playerCount; i++) {
			players[i].printPlayerInfo();
		}
	}

}
