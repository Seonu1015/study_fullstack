package hw_AreaCal;

public class Square extends Figure {

	private double side;

	public Square() {
		super("정사각형");
	}

	public Square(double side) {
		super("정사각형");
		this.side = side;
	}

	@Override
	double calArea() {
		area = side * side;
		return area;
	}

	public String toString(double side) {
		return "정사각형의 넓이 : " + (side * side);
	}

	public String toString(double width, double height) { // 왜 오류가 발생하는거지? 따로 쓰면 매개변수가 같아서 오류가 생기고
		if (this.getShape().equals("직사각형")) {				// void를 써서 shapeArea를 오버라이드 하면 해결되긴 하는데...
			return "직사각형의 넓이 : " + (width * height);	// 이 상태에서는 방법이 없나?
		} else if (this.getShape().equals("마름모")) {
			return "마름모의 넓이 : " + ((width * height) / 2);
		}
	}

	public String toString(double base1, double base2, double height) {
		return "사다리꼴의 넓이 : " + (((base1 + base2) * height) / 2);
	}

	public String toString(int diagonal1, int diagonal2) { // 인트로 바꾸면 가능하긴 한데...
		return "마름모의 넓이 : " + ((diagonal1 * diagonal2) / 2);
	}

}
