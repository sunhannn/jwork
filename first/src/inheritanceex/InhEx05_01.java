package inheritanceex;

class PB{
	int x;
	PB(){System.out.println("부모생성자");}
}
class CB extends PB {
	String x;
	CB() {
		System.out.println("자식생성자");
		}
	
	CB(int b){
		System.out.println("자식기타생성자: "+b);
	}
}
public class InhEx05_01 {
	public static void main(String[] args) {
		CB b2 = new CB();
	}
}
