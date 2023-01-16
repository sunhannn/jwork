package stringex;
//스트링자료형은 원본유지가됩니다
public class SubEx {
//substring-스트링에서 제공하는 메소드<인덱스0부터 존재한다(시작인덱스,종료인덱스)
	public static void main(String[] args) {

		String a = "Welcome to java";
		System.out.println(a.substring(0,4)); //0~ 4-1까지
		System.out.println(a.substring(4));//4~ 끝까지 시작점만 설정해준경우
		System.out.println(a.substring(1,8));//1~ 8-1까지
	}

}
