package stringex;

public class CharEX {
//특정위치에문자추출
	public static void main(String[] args) {
		String str = new String("해피");
		System.out.println(str);
		
		String str1 = str.concat("썬데이");//concat->문자열 연결(결합)
		System.out.println(str1);
		
		int len = (str1.length()+1)*2;
		System.out.println(str1 + "의 메모리 용량 : " +len+"Bytes");
		
		//특정 위치에있는 문자(Char),문자 자료형으로 추출 2인덱스 번호
		char ch = str1.charAt(2);
		System.out.println(str1 + "의 chaAt(2) : "+ch);
	}

}
