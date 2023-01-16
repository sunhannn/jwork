package generic_003_method1;

public class BoxingMethodExample {
	public static void main(String[] args) {
		
		Box<Integer> box1 = Util.boxing(100);
		//오른쪽을 먼저 처리한다 박싱옆에있는 자료형을 보고 제너럴 자료형을 다 변경해준다 
		
		//Box<Integer> box1 = Util.<Integer>boxing(100); 제네릭타입을 바로 명시해주는 타입
		System.out.println(box1.get());
		
		Box<String> box2 = Util.boxing("홍길동");
		System.out.println(box2.get());
		
	}

}
