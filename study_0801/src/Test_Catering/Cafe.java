package Test_Catering;

public class Cafe extends Catering {

	String[] name;
	int[] rank;
	
	int count = 0;

	Cafe() {
		setting();
	}
	
	Cafe(String nation, String type) {
		super(nation, type);
		this.setting();
	}
	
	Cafe(String name, int rank) {
		this.name[0] = name;
		this.rank[0] = 0;
	}
	
	Cafe(String nation, String type, String name, int rank) {
		super(nation, type);
		this.setting();
		this.name[0] = name;
		this.rank[0] += rank;
		count++;
	}
	
	Cafe(String nation, String type, String[] name, int[] rank) {
		super(nation, type);
		this.name = name;
		this.rank = rank;
		count++;
	}
	
	void setting() {

		name = new String[2];
		rank = new int[2];
		
		for (int i = 0; i < name.length; i++) {
			name[i] = "NAME";
			rank[i] = 0;
		}
	}
	
	void printRes() {
		super.printCater();
		for(int i=0; i < name.length; i++) {
			System.out.println("이름 : " + name[i] + ", 평점 : " + rank[i]);
		}
	}
	
}
