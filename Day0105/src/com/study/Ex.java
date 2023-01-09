package com.study;

/* 랩퍼 클래스 (Wrapper class)
 * 기본자료형 => 클래스형
 *  byte       =>     Byte
 *  short      =>     Short
 *  char        =>    Character
 *   int         =>       Integer
 *   long      =>      Long
 *   float     =>      Float
 *   double  =>     Double
 *   
 *   목적 : 문자열 - > 기본자료형의 형변환
 *   단점 : 서로간의 자료형 형변환 안됨
 *   
 *   - 단 문자열 <->형변환
 *   숫자 - > 문자열
 *   int =>  Integer.toString(변수,객체) 
 *   String.valueOf(객체);
 * 
 * 	String     =>    Integer.parseInt(문자열);
 * 								Integer.valueOf(문자열);
 * 
 */
public class Ex {

	public static void main(String[] args) {
		String s1 = "고구마";
		String s2 = "고구마";
		String s3 = new String("고구마");
		System.out.println("s1 == s2"+(s1 == s2)); // 객체비교
		
		System.out.println("s1 == s3" + (s1 ==s3));
		System.out.println("s1 : " + System.identityHashCode(s1));
		System.out.println("s2 : " + System.identityHashCode(s2));
		System.out.println("s3 : " + System.identityHashCode(s3));
		System.out.println("\n===========================\n");
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("\n===========================\n");

		String s4 = new String("고구마");
		String s5 = "고구마";
		System.out.println("s4 : " + System.identityHashCode(s4));
		System.out.println("s5 : " + System.identityHashCode(s5));
		System.out.println("s4 : " + s4.hashCode());
		System.out.println("s5 : " + s5.hashCode());
		System.out.println("\n===========================\n");
		System.out.println("s1 : " + System.identityHashCode(s1));
		System.out.println("s1 : " + s1.hashCode());
		s1 = "가지";
		System.out.println("s1 : " + System.identityHashCode(s1));
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("\n===========================\n");

		int i1 = 1;
		int i2 = 1;
		System.out.println("i1 : " + System.identityHashCode(i1));
		System.out.println("i1 : " + System.identityHashCode(i2));
		i1 = 2;
		System.out.println("i1 : " + System.identityHashCode(i1));
//		System.out.println("i1 : "+i1.hashCode());
//		System.out.println("i2 : "+i2.hashCode());

	}

}
