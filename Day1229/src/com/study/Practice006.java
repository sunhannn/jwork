package com.study;

public class Practice006 {
// 출력 결과 : 2단
	public static void main(String[] args) {
		int i, y,t = 0;
		System.out.println("출력결과");
		System.out.println("=============================");
		for (i = 2; i <= 9; i++) {
			System.out.println(i+"단");			 
			for (y = 1 ; y <= 9 ; y++) {
				t = i * y;
				System.out.println(i + " X " + y + " = "+ t);
				if(i == 9 && y == 9) break;
				if(y == 9) System.out.println();			
			}
		}
	}
}
