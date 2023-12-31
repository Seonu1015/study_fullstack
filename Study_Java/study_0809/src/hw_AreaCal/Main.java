package hw_AreaCal;

//도형 넓이 계산 - 원, 사격형, 삼각형, 오각형...
//사각형 변의 길이를 몇개를 입력할지? 정수, 실수, 15cm, 89mm 로 입력하게 되면 어떻게 할지? 

public class Main {
	public static void main(String[] args) {

		Circle circle = new Circle();
		System.out.println(circle.toString(2));
		

		Square square = new Square();
		System.out.println(square.toString(4));
		System.out.println(square.toString(4, 7));
		System.out.println(square.toString(2, 3, 5));

		Triangle triangle1 = new Triangle(2, 3);
		triangle1.shapeArea();
		Triangle triangle2 = new Triangle();
		System.out.println(triangle2.toString(3, 4));

	}
}
