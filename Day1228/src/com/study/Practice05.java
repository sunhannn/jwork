package com.study;
import java.util.*;
public class Practice05 {

	public static void main(String[] args) {
		int value1 = 3;
		
		// 논리연산 논리곱(= AND = &&) 전위연산자 우선순위 무시
		System.out.println("논리연산 논리곱 &&");
		System.out.println(false && ++value1 > 6);
		System.out.println(value1);
		System.out.println(true && ++value1 > 6);
		System.out.println(value1);
		System.out.println("==============\n");
		
		//논리연산 논리합(=or = ||) 후위연산자 무시
		System.out.println("논리연산 논리합 ||");
		int value2 = 5;
		System.out.println(true || value2++ > 6);
		System.out.println(value2);
		System.out.println(false || value2++ > 6);
		System.out.println(value2);
		System.out.println("==============\n");
		
	}
}
