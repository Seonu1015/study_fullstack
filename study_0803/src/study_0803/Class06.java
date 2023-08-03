package study_0803;

import java.util.Scanner;

// 상속
public class Class06 {
	public static void main(String[] args) {
		
		Dog d1 = new Dog("강아지", "세바스찬", 3, "빨간 하네스");
		Cat c1 = new Cat("고양이", "프랑소와", 1, "원목캣타워");
		Bird b1 = new Bird("새", "알프레드", 2, "해바라기씨");
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("당신이 선택할 수 있는 반려동물의 종류는 다음과 같습니다.");
		d1.spk();
		c1.spk();
		b1.spk();
		
		System.out.println("어떤 반려동물을 선택하시겠습니까? {1. " + d1.name + ", 2. " + c1.name + ", 3. " + b1.name + " }");
		int typeAnimal = sc.nextInt();
		
		// 반려동물이 옆에 있습니까?
		// n 라면 개별 행동을 하고 있는 중
		// 강아지 - 땅파기 > 일정 수치 이상이면 덮어주는 작업
		// 고양이 - 털고르기 > 일정 수치 이상이면 집 청소
		// 새 - ???
		// y 라면 산책 간식 잠 중에서 선택
		
		System.out.println("반려동물이 주위에 보이나요? (y, n) : ");
		String near = sc.next();
		
		if(near.equals("y")) {
			System.out.println("{ 산책가자, 간식먹자, 잘래? } 중 반려동물과 하고싶은 행동을 선택하세요.");
			String command = sc.next();
						
			//배열을 사용해서 반복문으로 수정해보자 - 다차원 배열????
			
			if(command.equals("산책가자")) {
				if(typeAnimal == 1) {
					d1.wlk();				
				} else if(typeAnimal == 2) {
					c1.wlk();
				} else {
					b1.wlk();
				}
			} else if(command.equals("간식먹자")) {
				if(typeAnimal == 1) {
					d1.trt();				
				} else if(typeAnimal == 2) {
					c1.trt();
				} else {
					b1.trt();
				}
			} else {
				if(typeAnimal == 1) {
					d1.slp();				
				} else if(typeAnimal == 2) {
					c1.slp();
				} else {
					b1.slp();
				}
			}
		} else {
			System.out.println("지금 " );
		}
		
	}
}

//상속 -> 클래스 간의 관계 (상하관계만 표현할 수 있다)

//내가 가지고 있는 속성(인스턴스 변수), 행동(메소드)이 다른 클래스에도 이미 있다면?
//똑같이 생긴 설계도를 또 만들어야되네??
//다른 설계도를 베껴올 수 있었으면 좋겠다.

//부모 클래스 (이미 만들어져 있는 설계도)
//자식 클래스 (베껴서 새로 작성할 설계도)

