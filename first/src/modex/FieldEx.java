package modex;

class Field{
	static int classVar = 10; //클래스 변수 선언
	int insteanceVar = 20;//인스턴스 변수 선언 = 멤버변수
	
	void method() {
		int something = 10; //지역변수
		System.out.println(something);
	}
}
public class FieldEx {
	public static void main(String[] args) {
		int var = 30; //지역변수 선언
		System.out.println(var + "\n"); //지역변수 참조
		
		Field myField1 = new Field();// 인스턴스 생성
		Field myField2 = new Field();// 인스턴스 생성
		
		System.out.println(Field.classVar); //클래스변수 참조
		System.out.println(myField1.classVar);
		System.out.println(myField2.classVar + "\n");
		
		myField1.classVar = 100; //클래스 변수의 값을 변경
		
		System.out.println(Field.classVar); //클래스변수 참조
		System.out.println(myField1.classVar);
		System.out.println(myField2.classVar + "\n");
		
		System.out.println(myField1.classVar); //인스턴스 변수 참조
		System.out.println(myField2.classVar + "\n");
		
		myField1.classVar = 200; //인스턴스 변수의 값을 변경
		
		System.out.println(myField1.classVar); //인스턴스 변수 참조
		System.out.println(myField2.classVar);
		myField1.method();
	}

}
