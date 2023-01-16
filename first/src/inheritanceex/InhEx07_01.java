package inheritanceex;

/*class 맨앞에 기타제어자 final 이 붙는다면 '상속할수없는'이된다 */
	class P3{    //디폴트
	int a =1;
	private int b=5;//상속이 안된다
//	private void md() {System.out.println("P3");}//상속이 안된다
	public/*사이에 final을 붙이면 재정의도 안된다*/ void md() {System.out.println("P3");}
	public void md1() {md();}
}

class C3 extends P3{  //디폴트
	int c= 6;
	C3() {md1();}
	public void md() {System.out.println("C3");}
}
public class InhEx07_01 {
	public static void main(String[] args) {
		C3 c= new C3();
	}
}


