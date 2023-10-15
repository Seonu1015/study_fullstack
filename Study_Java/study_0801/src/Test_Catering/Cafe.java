package Test_Catering;

public class Cafe extends Catering {

	String[] name;
	int[] rank;

	Cafe() {
		setting();
	}

	Cafe(String nation, String type) {
		super(nation, type);
		this.setting();
	}

	Cafe(String name, int rank) {
		this.name = new String[] { name };
		this.rank = new int[] { rank };
	}

	Cafe(String nation, String type, String name, int rank) {
		super(nation, type);
		this.setting();
		this.name[0] = name;
		this.rank[0] += rank;
	}

	Cafe(String nation, String type, String[] name, int[] rank) {
		super(nation, type);
		this.setting();
		this.name = new String[2];
		this.rank = rank;
	}

	void setting() {
		name = new String[2];
		rank = new int[2];

		// System.out.println("n :" + this.name[0] + ", r : " + this.rank[0]);

		for (int i = 0; i < name.length; i++) {
			name[i] = "NAME";
			rank[i] = 0;
		}
		// System.out.println("n :" + this.name[0] + ", r : " + this.rank[0]);
	}

	void printRes() {
		super.printCater();
		for (int i = 0; i < name.length; i++) {
			System.out.println("이름 : " + name[i] + ", 평점 : " + rank[i]);
		}
	}

}
