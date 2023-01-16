package generic_003_method1;

public class Box<T> { //제네릭타입
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;}//제네릭 타입변수
}
//[접근제어자] class 클래스명<제네릭타입변수> { 
//	[접근제어자] 제네릭타입변수 멤버필드명;
//	[접근제어자]제네릭 타입변수 get() {return 멤버필드명;}
//	[접근제어자] 리턴타입 set(제네릭타입변수 매개변수명) {this.멤버필드명 = 매개변수명;}
//}