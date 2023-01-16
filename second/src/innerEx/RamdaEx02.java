package innerEx;
interface Ramda2{
	public static final int a =5;
	public abstract void makeString(String s1, String s2);
	
}
 
public class RamdaEx02 {
	public static void main(String[] args) {
		String s1 ="Hello";
		String s2 ="java";
		int b =1;
		Ramda2 concat = (s,v) -> System.out.println(s+ ","+v+Ramda2.a);//축약식에서는 꼭 ramda에 들어있는 a라고 호칭해줘야 가져올수있고 a만 써서는 가져올수없다 <-람다식의 단점
		System.out.println(concat.hashCode());
//		Ramda2 concat = new Ramda2() {
//			
//			public void makeString(String s1, String s2) {
//				System.out.println(s1+","s2+a);자동상속처리
//			}
//		};  람다식 장점은! 많이 줄여서 쓸수있다
		concat.makeString(s1, s2);
	}
	

}
