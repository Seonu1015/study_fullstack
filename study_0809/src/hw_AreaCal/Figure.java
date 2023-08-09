package hw_AreaCal;

import java.util.Scanner;

public class Figure {
	
	Scanner sc = new Scanner(System.in);

	static double length;
	

	
	Figure() {
		this.length = sc.nextDouble();
	}
	
	double getLength() {
		return length;
	}
	
	void setLength() {
		
	}
	
	void inputLengthI() {
		int length = sc.nextInt();
		this.length = (double) 
	}
	
	void inputLengthD() {
		double length = sc.nextDouble();
	}
	
	void inputLengthS() {
		String length = sc.next();
	}
	
	

}
