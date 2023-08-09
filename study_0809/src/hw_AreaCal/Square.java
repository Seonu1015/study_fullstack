package hw_AreaCal;

public class Square extends Figure {
	
	public String toString(double side) {
		return "정사각형의 넓이 : " + ( side * side);
	}
	
	public String toString(double width, double height) {
		return "직사각형의 넓이 : " + ( width * height);
	}
	
	public String toString(double base1, double base2, double height) {
		return "사다리꼴의 넓이 : " + ( ((base1 + base2) * height) / 2);
	}

	
//	double calArea(double diagonal1, double diagonal2) {
//		return area = diagonal1 * diagonal2 /2;
//	}

	
}
