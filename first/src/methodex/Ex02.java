package methodex;

public class Ex02 {
	
	// public static void main(String[] args) {} args = argument, parameter : 매개변수
	static int abs(int x ) { //메소드 선언
		int y;
		if(x < 0) y = -x;
		else y = x;
		return y; //값을 return 문으로 반환
	}	
	
	public static void main(String[] args) { //메인 메소드 선언
		int a = -5, result; //result 선언 , a = -5
		result = abs(a); // 메소드 호출문, result 는 abs(a)
		System.out.println(a + "의 절대값은 " + result); //메소드 호출 및 출력문
		System.out.println(10 + "의 절대값은 " + abs(10));
	}
}
