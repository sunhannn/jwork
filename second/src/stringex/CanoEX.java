package stringex;

public class CanoEX {
//new String-
	public static void main(String[] args){
		char a[] = {'c','o','m','p','u','t','e','r'};
		String s1 =new String(a); //문자 배열로부터 문자열 객체 생성
		String s2 =new String(a,3,3); //문자 배열의 일부분을 문자열 객체로 생성 <a배열의 인덱스3에서 부터 3번을나열해라>
		String s3 =new String("배우기 쉬운 자바");//new연산자를 사용한 문자열 객체 생성
		String s4 ="canonical 문자열";
		//이러한 문자열을 지정해서 객체생성
		//이러한 초기화가 단축(shorthand)초기화(canonical문자열) 스트링은 불변형! 가변형문자자료형은 따로있어요!
		System.out.println("문자열 s1 : "+s1);
		System.out.println("문자열 s1의 길이 : "+s1.length());
		System.out.println("문자열 s2 : "+s2);
		System.out.println("문자열 s3 : "+s3);
		System.out.println("문자열 s4 : "+s4);
		
	}
	}
