package inheritanceex;

class P {
 int a = 0;
 int b = 5;
 
 public void md() {
	 a= 5;
	// System.out.println(a + b);
	 
 }
}
class C extends P {
	String a = "오버라이딩";
	
	public void ma() {
		System.out.println(a + b);
		super.md();
		this.md1();
		
	}
	
	public void md1() {System.out.println("md()메소드 호출");}
	
}

public class InhEx02_02 {
	
	public static void main(String[] args) {
		C c = new C();
		//P c = new C();
		//업케스팅- 하위클래스(=섭클래스=자식클래스) 자료형이 상위클래스로 변환되는것
		c.md();
		
	}
	
}
