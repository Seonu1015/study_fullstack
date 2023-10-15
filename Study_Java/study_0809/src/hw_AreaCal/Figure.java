package hw_AreaCal;

public class Figure {

	private String shape;
	double area;

	Figure(String shape) {
		this.shape = shape;
	}

	String getShape() {
		return shape;
	}

	double calArea() {
		return area;
	}

	void shapeArea() {
		System.out.println(shape + "의 넓이 : " + area);
	}

}
