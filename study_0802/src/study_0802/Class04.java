package study_0802;

import java.util.Scanner;

public class Class04 {
	public static void main(String[] args) {


		String[] station = {"김포공항", "공항시장", "마곡나루", "양천향교", "가양", "증미", "당산", "국회의사당", "여의도"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("급행입니까? (y, n) : ");
		String express = sc.next(); 
		
		System.out.println("1.김포공항, 2.공항시장, 3.마곡나루, 4.양천향교, 5.가양, 6.증미, 7.당산, 8.국회의사당, 9.여의도");
		System.out.println("어느 역에서 타시겠습니까? (번호로 입력해주세요) : ");
		int start = sc.nextInt()-1;
		
				
		if(express.equals("y")) {
			if((start+1) % 2 == 0 ) {
				System.out.println("해당 역은 급행에서 타실 수 없습니다.");
				System.out.println("어느 역에서 타시겠습니까? (번호로 입력해주세요) : ");
				start = sc.nextInt()-1;
			}
		}	

		System.out.println("어느 역에서 내리시겠습니까? (번호로 입력해주세요) : ");
		int end = sc.nextInt()-1;
		
		if(express.equals("y")) {
			if((end+1) % 2 == 0 ) {
				System.out.println("해당 역은 급행에서 내리실 수 없습니다.");
				System.out.println("어느 역에서 내리시겠습니까? (번호로 입력해주세요) : ");
				end = sc.nextInt()-1;
			}
		}
		
		//급행은 홀수번째 역만 선택 가능
		//일반은 모든 역 선택 가능
		
		//지나온 역 출력
		System.out.println("타실 역은 " + station[start] + " 입니다.");
		System.out.println("내리실 역은 " + station[end] + " 입니다.");
		
		for(int i=start+1; i<end; i++) {
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