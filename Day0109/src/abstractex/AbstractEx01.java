package abstractex;

public class AbstractEx01 {

	public static void main(String[] args) {
		// Animal a = new Animal(); 추상클래스는 객체x

		Cat c = new Cat();
		Dog d = new Dog();

		c.cry();
		d.cry();
		System.out.println(c.getAstr());

	}

}
