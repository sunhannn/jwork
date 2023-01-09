package com.study;

public class Practice001 {
/*
 * 	반복문 for
 * 	for (초기식; 조건식; 증감식){
 * 	실행문; [제어어;]}
 * 	초기식 : 반복시켜줄 수 있는 변수 생성 및 초기값 지정
 */
	public static void main(String[] args) {
		
		// 반복문 (for문)
		System.out.println("for문 1");
		
		for (int n = 0; n < 10; n++) { // n은 가운데 조건식을 충족하지 않을 때까지 반복한다.
			System.out.println("Hello Java"+n); // 지역변수는 재선언이 불가능하다.
		}
		System.out.println("for문을 빠져 나옴.");
		
	}

}
