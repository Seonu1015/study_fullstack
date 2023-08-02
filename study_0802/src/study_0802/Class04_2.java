package study_0802;

import java.util.Scanner;

public class Class04_2 {
	public static void main(String[] args) {
		
		String[] station = { "김포공항", "공항시장", "마곡나루", "양천향교", "가양", "증미", "당산", "국회의사당", "여의도" };

		Scanner sc = new Scanner(System.in);

		System.out.println("급행으로 바꾸시겠습니까? (y, n) : ");
		String express = sc.next();
		
		if(!(express.equals("y") || express.equals("n"))) {
			System.out.println("잘못된 입력입니다. 급행 여부를 다시 입력해주세요. (y, n) : ");
			express = sc.next();
		}
		
		//급행은 홀수번째 역만 지나간다
		//현재 타고 있는 역에서 다음 급행역까지 타고 가서 내려야 한다
		
		String stRide = null;
		int stRideIndex = 0;
		String exRide = null;
		
		if(express.equals("y")) {
			System.out.println("김포공항, 공항시장, 마곡나루, 양천향교, 가양, 증미, 당산, 국회의사당, 여의도");
			System.out.println("현재 타고 계신 역을 알려주세요. : ");
			stRide = sc.next();
			
			for(int i=0; i<station.length; i++) {
				if(stRide.equals(station[i])) {
					if(i % 2 == 0) {
						System.out.println("이번 역에서 내리셔서 급행열차로 갈아타시면 됩니다.");
					} else {
						stRideIndex = i+1;
						exRide = station[stRideIndex];
						System.out.println("다음 " + exRide + " 역에서 급행열차로 갈아타시면 됩니다.");
					}
				}
			}
		}
		
		System.out.println("타고 있는 일반열차 역 : " + stRide + ", 갈아탈 급행열차 역 : " + exRide);
		
	}
}

//일반역에서 탔는데 급행으로 바꾸고 싶다면???
//일반역부터 급행으로 갈아타서 지나친 역들을 출력해보자