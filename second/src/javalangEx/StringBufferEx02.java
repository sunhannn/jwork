package javalangEx;

public class StringBufferEx02 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java 만세!");
		System.out.println("원본 문자열 : "+ str +"\n");
		
		System.out.println(str.insert(4, "Script")); // .insert추가하세요~ 추가해야할 인덱스번호, 추가문자열
		System.out.println();
		System.out.println("insert()메소드 호출 후 원본 문자열 : "+ str + "\n");
		
		System.out.println(str.reverse()); //문자열을 역순으로 재배치
		System.out.println(str);
		
	}

}
