package com.study;

public class Suup07 {
	static void test () {System.out.println("매개변수 없음");}
	static void test (int a, int b) {
		System.out.println("매개변수 int "+ a + "와 int "+b);
	}
	static double test (double a) {
		System.out.println("매개변수 double "+a);
		return a * 2;
	}
	
	public static void main(String[] args) {
		double result;
		test();
		test(5, 10);
		result = test(100);
		System.out.println("test(100)의 결과 : "+result);
		result = test(4.2);
		System.out.println("test(4.2)의 결과 : "+result);
		
	}

}
