package methodex;

public class Ex05 {
////메소드 오버로드
//	static void printstr(String str) {System.out.println(str);}
//	static void printstr(char ch, int cnt) {
//		for (int i = 0; i < cnt; i++) System.out.print(ch);
//		System.out.println();
//	}
//public static void main(String[] args) {
//		printstr("슬프도록 아름다운");
//		printstr('A',7);
//	}
	
//			
//	}
	public static void main(String[] args) {
	int a =5; //변수: 변하는수, 마지막 값 한 개만 기억하는 공간
	System.out.println(a);
	final int B=9;
	System.out.println(B); 
	/*상수(constant): 처음 입력하면 절대 값을 변경할 수 없는것
	*final 자료형 상수이름 = 값;
	*final 키워드(예약어) : ~할 수 없는, 금지하는 이라는 의미임.
	*명명규칙은 병수의 이름을 짓는 것과 동일하나 단, 이름을 영어 대문자로 모두 기술해주는 것이 권장사항이다.
	*/
}
}