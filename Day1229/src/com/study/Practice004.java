package com.study;

public class Practice004 {
	/*
	 * do ~ while문 형식	// 무조건 do안의 실행문은 맨처음 1번은 조건에 상관없이 실행된다.
	 * do {
	 * 실행문;
	 * 
	 * 제어할 수 있는 제어식이나 제어어가 반드시 존재해야함;
	 * }while(조건식);
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("do while문 1");
		int total = 0, i = 1;;
		
		do {
			total += i;
			i++;
		}while (i <= 10);
		System.out.println(total);
		System.out.println();
		
		
		
	}

}
