package com.study;

public class Practice003 {
	/*
	 * 	while 문
	 * while (조건식){ //결과값이 true나 false로 반환 함
	 * 실행문;
	 * 
	 * 제어할 수 있는 실행문 또는 제어어가 존재해야 함
	 * 
	 */
	public static void main(String[] args) {
		
		int i = 1;
		
		while(i <= 5) {
			if (i == 1) System.out.println("while문 시작 시 : "+i);
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\nwhile문 종료 후 : "+i+"\n\n");
		
	}

}
