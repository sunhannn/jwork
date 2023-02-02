package stringex;

public class WrapEx {

	public static void main(String[] args) {
//.parse <-기본자료형으로바꿔준다
//.toString 은 integer급을 바꿀수있다		
		String s ="50";
		int i = Integer.parseInt(s);
		System.out.println(i);
		System.out.println(Integer.valueOf(s).getClass());// 밸류오프 -객체급 문자열을 인티저급으로 변환해주는
//		System.out.println(Integer.parseInt(s).getClass().getName()); //파스인트- 문자열을 숫자자료형으로 변환해줌
		
	}

}
