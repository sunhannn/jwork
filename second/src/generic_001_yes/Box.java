package generic_001_yes;

public class Box<T> {
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;} //제네릭타입을 쓰면 오브젝트에서 형변환을 안해도 돼서 많이 사용한다
}
