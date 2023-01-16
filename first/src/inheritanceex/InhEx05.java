package inheritanceex;


class B1{int x;}//5000
class B2 extends B1 {String x;}//"자바 상속 extends";

public class InhEx05 {
	public static void main(String[] args) {
		B2 b2 = new B2();
		b2.x = "자바 상속 extends";
		//B1 클래스에서 선언된 int x 는 가려짐
		//만일 b2.x +50을 실행한다면 에러발생
		
		System.out.println("b2.x : "+b2.x);
		B1 b1 = new B1();
		b1.x = 5000;
		System.out.println("b1.x : "+b2.x);
	}

}
