package hw_AreaCal;

public class Circle extends Figure {

	static final double pi = 3.14;

	public String toString(double radius) {
		return "원의 넓이 : " + (radius * radius * pi);
	}

}
