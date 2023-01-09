package com.study;

public class Suup02 {
	
	// 메소드 선언문
	static int sum(int a, int b) {
		int c;
		c = a + b;
		return c;
	}
	
	// 메소드 선언문
	public static void main(String[] args) {
		int a = 10, b = 20;
		// 메소드 호출
		int c =sum (a, b);
		// sum 메소드 호출문 및 출력문
		System.out.println("a + b = "+ c);
	}

}
