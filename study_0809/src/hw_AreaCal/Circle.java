package hw_AreaCal;

public class Circle extends Figure {

	private double radius;
	static final double pi = 3.14;

	public Circle() {
		super("원");
	}

	public Circle(double radius) {
		super("원");
		this.radius = radius;
	}

	@Override
	double calArea() {
		area = radius * radius * pi;
		return area;
	}

	public String toString(double radius) {
		return "원의 넓이 : " + (radius * radius * pi);
	}

}
