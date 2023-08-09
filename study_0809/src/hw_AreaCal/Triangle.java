package hw_AreaCal;

public class Triangle extends Figure {

	public String toString(double base, double height) {
		return "삼각형의 넓이 : " + ( base * height /2);
	}
	
	// 이등변 삼각형의 변의 길이만 알고 있다면? <- 피타고라스의 정리......?
	// 이걸 어케 구현함???

}
