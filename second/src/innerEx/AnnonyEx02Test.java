package innerEx;
abstract class AnnonyEx02Abstract{
	public abstract void doSomething();
}
public class AnnonyEx02Test {
	public static void md(AnnonyEx02Abstract n) {
		n.doSomething();
	}
	public static void main(String[] args) {
		AnnonyEx02Test a = new AnnonyEx02Test();
		int aa = 5;
		final int AA =7;
		
		md(new AnnonyEx02Abstract() {     //여기 소괄호 열려있음 익명클래스기 때문에!
			private int a = 15;
			String s ="AnnonymousClass";
			static final int AA =0;
			//static int st =0;
			
			public void doSomething() {
				//aa=a+aa; 변경이 안돼요 위에 스테틱있는 곳에서 이미 정의했기때문에 수정불가
				System.out.println("내부익명 클래스의 doSomething메소드");
				System.out.println("s : "+s);
				System.out.println("a : "+a);
				System.out.println("aa: "+aa);
				System.out.println("AA: "+AA); ///AA는 내 주변에 있는 값을 가져옴
		}
	});          //소괄호 주의하기
	}
}
