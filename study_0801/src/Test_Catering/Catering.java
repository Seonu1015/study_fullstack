package Test_Catering;

public class Catering {

	String nation;
	String type;
	
	Catering() {
		nation = "NATION";
		type = "TYPE";
	}
	
	Catering(String nation, String type) {
		this.nation = nation;
		this.type = type;
	}
	
	void printCater() {
		System.out.println("국가 : " + nation + ", 분류 : " + type);
	}

}
