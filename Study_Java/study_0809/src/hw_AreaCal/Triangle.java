package hw_AreaCal;

public class Triangle extends Figure {

	private double base;
	private double height;

	public Triangle() {
		super("삼각형");
	}

	public Triangle(double base, double height) {
		super("삼각형");
		this.base = base;
		this.height = height;
	}

	@Override
	double calArea() {
		area = base * height / 2;
		return area;
	}

	double calArea(double base, double height) {
		return base * height / 2;
	}

	public String toString(double base, double height) {
		return "삼각형의 넓이 : " + (base * height / 2);
	}

	// 이등변 삼각형의 변의 길이만 알고 있다면? <- 피타고라스의 정리......?
	// 이걸 어케 구현함???

}
