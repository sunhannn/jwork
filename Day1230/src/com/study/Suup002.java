package com.study;

public class Suup002 {
/*
 *  무한루프
 *  for ( ; ; ){
 *  실행문;
 *  ...
 *  ...
 *  반드시 무한루프를 제어할 수 있는 제어식이나 제어어가 존재해야한다.
 *  }
 * 
 * while (true){
 * 실행문;
 * ...
 * ...
 * 반드시 무한루프를 제어할 수 있는 제어식이나 제어어가 존재해야한다.
 * }
 * 
 * do{
 * 실행문;
 * ...
 * ...
 * 
 * 반드시 무한루프를 제어할 수 잇는 제어식이나 제어어가 존재해야한다.
 * }while(true);
 * 
 */
	public static void main(String[] args) {
		/* int j = 5; 
		 * if (j < 5) {실행문 ;}
		 * else {실행문;}
		 *  j < 5 ? 참실행문 : 거짓실행문
		 */
		// 무한루프문 - 반드시  break문이 있어야한다.
		System.out.println("무한루프 for문");
		int i = 1;
		for ( ; ; ) {
			System.out.print((i != 1 ? "  " : "") + i); // "" : 빈문자열
			if (i++ > 10) break;
		}
		System.out.println("\n 종료후의 i의 값 : "+i);
		System.out.println("\n======================\n");
		
		System.out.println("무한루프 while 문");
		i = 1;
		while (true) {
			System.out.print((i != 1 ? "  " : "")+ i);
			if (++i > 10) break;
		}
		System.out.println("\n종료 후 i의 값 : "+ i);
		System.out.println("\n======================\n");
		
		System.out.println("무한루프 do ~ while문");
		i = 1;
		do {
			System.out.print((i != 1 ? " " : "") + i);
			if (++i > 10) break;
		}while (true);
		System.out.println("\n종료 후의 i 값" + i);
		
	}

}
