package innerEx;

interface Ramda5{
	void showString(String str);
	
}
public class RamdaEx05 {
	public static void main(String[] args) {
		Ramda5 lamda5 = returnString();//변수로 반환받기
		lamda5.showString("Hello");
		
	}
public static Ramda5 returnString() {
//	return new Ramda5() {
//		public void showString(String s) {
//			System.out.println(s + "java");
//		}   이내용을 축약시켜놓은게 아래임. 익명클래스를 람다로 변환하기
//	};
	return s -> System.out.println(s +"Java");
}
}
