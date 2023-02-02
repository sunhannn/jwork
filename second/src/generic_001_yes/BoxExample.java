package generic_001_yes;

public class BoxExample {
	public static void main(String[] args) {
		Box<String>box1=new Box<String>();
		box1.set("hello");
		String s1 = box1.get();
		System.out.println(box1.get());
		
		Box<Integer>box2=new Box<Integer>();
		box2.set(6);
		Integer i = box2.get();
		System.out.println(box2.get());
	}
}
