package study_0802;

import java.util.Scanner;

public class Class04_1 {
	public static void main(String[] args) {

		// 앞의 풀이를 string으로 수정해보자

		String[] station = { "김포공항", "공항시장", "마곡나루", "양천향교", "가양", "증미", "당산", "국회의사당", "여의도" };

		Scanner sc = new Scanner(System.in);

		System.out.println("급행입니까? (y, n) : ");
		String express = sc.next();
		
		if(!(express.equals("y") || express.equals("n"))) {
			System.out.println("잘못된 입력입니다. 급행 여부를 다시 입력해주세요. (y, n) : ");
			express = sc.next();
		}

		System.out.println("김포공항, 공항시장, 마곡나루, 양천향교, 가양, 증미, 당산, 국회의사당, 여의도");
		System.out.println("어느 역에서 타시겠습니까? : ");

		String start = sc.next();

		if (express.equals("y")) {
			for (int i = 0; i < station.length; i++) {
				if (start.equals(station[i])) {
					if (i % 2 == 1) {
						System.out.println("해당 역은 급행에서 타실 수 없습니다.");
						System.out.println("어느 역에서 타시겠습니까? : ");
						start = sc.next();
					}
				}
			}
		}

		System.out.println("어느 역에서 내리시겠습니까? : ");

		String end = sc.next();

		if (express.equals("y")) {
			for (int i = 0; i < station.length; i++) {
				if (end.equals(station[i])) {
					if (i % 2 == 1) {
						System.out.println("해당 역은 급행에서 내리실 수 없습니다.");
						System.out.println("어느 역에서 내리시겠습니까? : ");
						end = sc.next();
					}
				}
			}
		}

		// 지나온 역 출력
		System.out.println("타실 역은 " + start + " 입니다.");
		System.out.println("내리실 역은 " + end + " 입니다.");
		
		int stIndex = 0;
		int enIndex = 0;
		
		for(int i=0; i<station.length; i++) {
			if(start.equals(station[i])) {
				stIndex = i;
			}
			if(end.equals(station[i])) {
				enIndex = i;
			}
		}
		
		for(int i=stIndex+1; i<enIndex; i++) {
			System.out.print(station[i] + " ");
		}

		System.out.print("역을 지나칠 예정입니다.");
		System.out.println();

	}
}

//배열
//김포공항* - 공항시장 - 마곡나루* - 양천향교 - 가양* - 증미 - 당산* - 국회의사당 - 여의도*
//9호선 급행*

//어떤 열차를 탈래? 급행인지 아닌지
//어디역에서 내릴래? 위에 있는 역 중에서 입력(단, 급행열차는 일반역에서 멈추지 않음.)

//내가 탄 열차가 지나온 역들이 쭉 출력.

//힌트 - 급행역과 일반역이 번갈아가면서 존재한다.

