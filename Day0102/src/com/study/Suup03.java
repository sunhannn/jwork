package com.study;

public class Suup03 {
	//메소드 선언
	static int abs (int x) {
		int y;
		if (x < 0) y = -x;
		else y = x;
		return y;	//값을 return 문으로 반환
		
	}
	
	//argument : 매개변수 or parameter
	//메인 메소드 선언
	public static void main(String[] args) {
		
		int a = -5, result;
		result = abs(a);	// 메소드 호출
		System.out.println(a + "의 절대닶은 "+result);
		//메소드 호출 및 출력문
		System.out.println(10 + "의 절대값은 "+abs(10));
		
	}

}
