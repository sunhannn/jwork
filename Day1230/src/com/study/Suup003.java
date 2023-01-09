package com.study;

public class Suup003 {
/* 이스케이프 문자
 * - 이스케이프 문자란 : 특수한 기능을 수행하는 문자임.
 * - 소스 코드에 해당되는 문자들을 (" ", '', 탭 키 등등) 코드로 인식하지
 *    못하도록 일반 문자열처럼 처리하는 기능을 수행
 * 
 * 특수문자                                 표기방법                                     유니코드
 * Tab                                               \t                                              \u0009
 * Linefeed                                    \n                                              \u000A
 * Backslash                                   \\                                              \\u005C
 * Single Quote                            	\'												\u0027
 * Double Quote								\"												\u0022
 * 
 * 
 */
	public static void main(String[] args) {
		String s = "문자열 출력";
		int i = 10;
		System.out.printf("%s %d\n",s ,i);
		System.out.printf("%d\n", 10); 	// d는 정수
		System.out.printf("%o\n", 10); 	// o는 8진수로 바꾸어서 표현
		System.out.printf("%x\n", 10);	// 16진수로 바꾸어서 표현
		System.out.printf("%X\n", 10);	// 알파벳 대문자로 표현
		System.out.printf("%s\n", "문자열 출력");	 // s는 문자열을 표현
		System.out.printf("%f\n", 3.2582); 	// f는 실수를 표현
		System.out.printf("%10.2f\n", 3.2582);	// 10은 10칸을 의미 .까지 포함해서, .2f는 두자리까지 출력
		System.out.printf("%-10d과 %.4f\n", 10, 3.2582);
		// %b는 boolean을 의미한다.
	}

}
