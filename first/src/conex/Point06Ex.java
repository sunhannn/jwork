package conex;

public class Point06Ex {
	public static void main(String[] args) {
		// Point06으로 객체 생성문을 작성하여 x,y의 멤버변수 값을 각각 5와 3으로 변경하기

		Point06 pt06 = new Point06();
		pt06.x = 5;
		pt06.y = 3;
		pt06.setX(5);
		pt06.setY(3);
		Point06 pt06_1 = new Point06(5, 3);
		// Point06으로 생성한 객체를 통해 showPoin()메소드를 호출하세요
		pt06.showPoint();
	}
}

class Point06 {
	int x;
	int y;

	public Point06() {
		System.out.println("매개 변수가 없는 디폴트 생성자");
	}

	public Point06(int x, int y) {
		System.out.println("매개변수가 있는 기타생성자");
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.x = y;
	}

	public void showPoint() {
		System.out.println(x + ", " + y);

	}

}