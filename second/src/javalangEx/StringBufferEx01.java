package javalangEx;

public class StringBufferEx01 {

	public static void main(String[] args) {
//	delete()메소드
		StringBuffer str = new StringBuffer("Java Oracle");
		System.out.println("원본 문자열 : "+str);
		System.out.println("길이0: "+str.length());
		System.out.println("공간0: "+str.capacity() + "\n");
		
		//시작인덱스~ 인덱스-1번 까지
		System.out.println(str.delete(4,  8));//4번부터 7번까지 지우란ㄴ 소리임
		System.out.println(str);
		System.out.println("길이1: "+str.length());
		System.out.println("공간1: "+str.capacity() + "\n");
		
		//해당 인덱스 문자만제거
		System.out.println(str.deleteCharAt(1));//위에서 잘라버려서 그대로 가져옴 그러고 인덱스1을 잘라버림 <원본 가변성!>
		System.out.println(str);
		System.out.println("길이2: "+str.length());
		System.out.println("공간2: "+str.capacity() + "\n");
		
		//해당 인덱스 문자만 가져오기
		System.out.println(str.charAt(1));//jvacle 에서 인덱스 1을 출력함<원본을 바꾸진 않음>
		System.out.println(str);
		System.out.println("길이3: "+str.length());
		System.out.println("공간3: "+str.capacity() + "\n");
		System.out.println("deleteCharAt() 메소드 호출 후 원본 문자열 : "+str);
	}

}
