package review;

public class review_hw_03 {
	public static void main(String[] args) {
		

	}
}

//왕 거지 게임
//{"노예" < "시민" < "귀족" < "왕"}
//노예가 왕을 만나면 왕을 죽이고 게임을 승리

//if (role1.equals("노예")) {
//	score1 = 100; // 마지막 승리여부 판단을 위해 높은 점수를 부여 <- 다른 방법이 있을까?
//	System.out.println("노예가 왕을 죽였습니다. 게임이 종료됩니다.");
//} else {
//	score2 = 100;
//	System.out.println("노예가 왕을 죽였습니다. 게임이 종료됩니다.");
//}
//break; // 노예가 왕을 죽이고 게임을 승리 <- break는 가장 가까운 반복문을 빠져나오게 한다
//		// 즉, break가 실행되면 아래 else~ sys 누적점수출력까지 진행이 이뤄지지 않음

//이 부분에서 100점을 부여하는 방식 외에
//int hr = 0 <- 히든룰에 대한 점수를 주는 방식도 있다
//대신 마지막에 최종승패여부를 가리는 부분에
//새로운 hr에 대한 if문을 추가적으로 작성하여야 한다