package com.study;

public class Suup004 {
/*
 *  배열 - 같은 자료형을 가진 여러 개의 요소를 묵어 놓은 집합체
 *  
 *  형식
 *  // 선언
 *  자료형[] 변수명; 또는 자료형 변수명 [];
 *  
 *  // 공간 생성 / 초기화
 *  변수명 = new 자료형 [] {값1, 값2, ...};
 *  
 *  // 선언 및 공간 생성(메모리 할당)
 *  자료형 [] 변수명 = new 자료형[방개수];
 *  
 *  /초기화
 *  변수명[인덱스번호(방번호)] = 값;
 *  
 *  // 단축형식 (선언 및 공간생성 / 초기화)
 *  자료형 [] 변수명 = {값1, 값2,...};
 * 
 */
	public static void main(String[] args) {
		
		int [] a; // int a[];
		a = new int [] {1,2,3,4,5,};
		System.out.println(a);
		for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
		System.out.println();
		
		//배열의 길이(방개수)
		System.out.println(a.length);
		// 참조변수 = 객체 = 메모리 주소
		
	}

}
