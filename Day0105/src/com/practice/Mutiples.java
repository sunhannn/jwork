package com.practice;

public class Mutiples {
	/*
	 * 10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
		1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
	 */
	public static void main(String[] args) {
		int i , sum = 0;
		
		for (i =  0; i < 1000; i++) {
			if (i % 3 == 0) {
				sum += i ; 
			}else if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		
	}

}
