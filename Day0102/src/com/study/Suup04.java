package com.study;

public class Suup04 {
	/* 메소드 오버로딩 (overloading)
	 * - 동일한 이름의 메소드를 여러개 쌓아놓는다.
	 * ex ) public static void add (매개변수 ...){}
	 * 		public    ;;   ;;         ;;  (매개변수 ...){}
	 * 
	 * 		오버로딩의 조건 : 1. 이름이 같아야 한다. 2. 매개 변수의 개수가 달라야 한다.
	 * 									   3. 매개 변수의 개수가 같으면, 자료형이 달라야 한다.
	 * 									   4. 매개 변수의 개수가 2개 이상이면 매개변수의 위치가 달라야 한다.
	 * 	4. ex ) add (int a, String b) add (String x, int y)
	 * 
	 */
	// 메인메소드 선언
	public static void main(String[] args) {
		int result = add(3,5); // 메소드 호출문 및 반환값 받기
		System.out.println(result);	
		int [] result2 = {0};
		add(3, 5, result2); // 배열은 주소값을 저장한다.
		System.out.println(result2[0]);
		
	}
	// 메소드 선언
		static int add (int a, int b) {
			return a+ b;
		}
		static void add( int a, int b, int [] result) {
			result [0] = a + b;
		}
	
}
