package com.study;

public class Suup08 {
	//정수 2개를 받아서 두 개의 합을 출력하고자 한다.
	
	static int add (int i1, int i2) {
		return i1 + i2;
	}
	
	static int minus (int i1, int i2) {
		return i1 -  i2;
	}
	
	static int gop (int i1, int i2) {
		return i1 * i2;
	}
	
	static int na1 (int i1, int i2) {
		return i1 / i2;
	}
	
	static int na2 (int i1, int i2) {
		return i1 % i2;
	}
	public static void main(String[] args) {
		
		int a = 10, b = 5;
		
		System.out.println(add(a, b));
		System.out.println(minus(a, b));
		System.out.println(gop(a, b));
		System.out.println(na1(a, b));
		System.out.println(na2(a, b));

	}

}
