package study_0803;

import java.util.Scanner;

public class Class02_ex {

	public static void main(String[] args) {
		String[] station = {"김포공항", "공항시장", "마곡나루", "양천향교", "가양", "증미", "당산", "국회의사당", "여의도"};
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 열차를 탈래? 1.일반 2.급행 ");
		int str1 = sc.nextInt();
		System.out.print("어디 역에서 내릴래? ");
		int str2 = sc.nextInt();
		
		if(str1 == 1) {
			for(int i=0; i<station.length; i++) {
				System.out.print(station[i] + " ");
				if(str2-1 == i) {
					break;
				}
			}
			System.out.println();
		}
		else if(str1 == 2) {
			for(int i=0; i<str2-1; i++) {
				if(i%2 == 0) { //모든 숫자를 2로 나누었을 때, 나머지가 0, 1
					System.out.print(station[i] + " ");
				}
			}
			System.out.println();
		}

	}

}
