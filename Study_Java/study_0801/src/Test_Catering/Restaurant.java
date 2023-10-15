package Test_Catering;

public class Restaurant extends Catering {

	String[] name;
	int[] rank;

	Restaurant() {
		setting();
	}

	Restaurant(String nation, String type) {
		super(nation, type);
		this.setting();
	}

//	Restaurant(String name, int rank) {
//		this.setting();
//		//System.out.println("n :" + this.name[0] + ", r : " + this.rank[0]);
//		this.name[0] = name;
//		this.rank[0] = 0;
//	}

	// this.name[0] = name; < - 배열의 첫 번째만 초기화된다
	// 하지만 this.name과 this.rank는 아래에서 배열의 크기를 2로 설정했기 때문에
	// 그 외의 자리는 초기화되지 않고 있다
	// 그래서 문제가 발생!!!
	// 해당 부분에서 배열 크기를 1로 설정한 후에 값을 할당하는 걸로 바꿈!!

	Restaurant(String name, int rank) {
		this.name = new String[] { name };
		this.rank = new int[] { rank };
	}

	Restaurant(String nation, String type, String name, int rank) {
		super(nation, type);
		this.setting();
		this.name[0] = name;
		this.rank[0] += rank;
	}

	Restaurant(String nation, String type, String[] name, int[] rank) {
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
