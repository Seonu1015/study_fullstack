package study_0809;

public class Math {

	public static int add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static double add(double... ds) { // double 여러개
		double sum = 0.0;

		for (double d : ds) { // 객체 리스트 덩어리를 할 때, ds를 하나씩 꺼내와서 d에 넣을거야.
			sum += d;
		}
		
		return sum;
	}

}

