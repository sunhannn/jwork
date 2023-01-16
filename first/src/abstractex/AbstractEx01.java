package abstractex;
abstract class Animal{
	private String astr = "추상클래스";
	abstract void cry();  //몸체가없어요! 접근제어자 디폴트
	public String getAstr() { return astr;}
	
}

class Cat extends Animal {
	public void cry() {System.out.println("냐옹냐옹!");}
	
}

class Dog extends Animal{
	void cry() {System.out.println("멍멍!");}
}
public class AbstractEx01 {
	public static void main(String[] args) {
		//Animal a = new Animal();
		Cat c = new Cat();
		Dog d = new Dog();
		
		c.cry();
		d.cry();
		System.out.println(c.getAstr());
	}
}
