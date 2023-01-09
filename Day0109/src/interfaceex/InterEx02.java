package interfaceex;

public class InterEx02 {

	public static void main(String[] args) {
		Rectangle ref = null;
		ref = new Rectangle();
		ref.area();
		ref.printArea();
		ref.draw();

	}

}

abstract class Shape {
	public double res = 0;

	public abstract double area();

	public void printArea() {
		System.out.println("면적은 " + res);
	}
}

class Rectangle extends Shape implements Drawable {
	public int w = 10, h = 10;

	@Override
	public double area() {
		res = w * h;
		return 0;
	}

	@Override
	public void draw() {
		System.out.println("사각형을 그리다.");
	}
}