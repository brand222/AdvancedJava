package MethodReferecesExample;

public class Main {

	public static void main(String[] args) {
		Square s = new Square(4);
		
//		Shapes shapes = (Square square) -> {
//			return square.calculateArea();
//		};
		//this particular code is exactly the same as the top area
		Shapes shapes2 = Square::calculateArea;
		
		System.out.println("area: " + shapes2.getArea(s));
	}
}
