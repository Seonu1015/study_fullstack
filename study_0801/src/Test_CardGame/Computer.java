package Test_CardGame;

public class Computer {
	
	String[] roles = {"거지", "시민", "귀족", "왕"};
	
	Computer() {
		int randomIndex = (int) (Math.random() * 4);
		String roles = roles[randomIndex];
		
	}
}
