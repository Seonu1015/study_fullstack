package practice_Catering;

public class Catering {

	String type;
	String name;

	
	Catering(String type, String name) {
		this.type = type;
		this.name = name;
	}

	void info() {
		System.out.println("가게명 : " + name + "(" + type + ")");
	}
}
