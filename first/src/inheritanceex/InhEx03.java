package inheritanceex;

class Parent { } //public Parent() {}
class Child  extends Parent { }
class Brother extends Parent { }


public class InhEx03 {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println("1번 "+ (p instanceof Object));  
		//(p instanceof Object));<-객체 instanceof 자료형 : 클래스급 이상의 자료형을 판별해주는 연산자
		System.out.println("2번 "+ (p instanceof Parent));
		System.out.println("3번 "+ (p instanceof Child));
		System.out.println();
		
		Parent c = new Child();
		System.out.println("4번 "+ (c instanceof Object));
		System.out.println("5번 "+ (c instanceof Parent));
		System.out.println("6번 "+ (c instanceof Child));
	}

}
