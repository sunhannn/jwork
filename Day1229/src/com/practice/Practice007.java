package com.practice;

public class Practice007 {

	public static void main(String[] args) {
		int t = 0;
		
		for (int i = 3; i <=100; i++) {
			for (int y = 1; y <=100;y++ ) {
				if (i == 3*y){
				t += i;
				}
			}	
		}
		System.out.println("3의 배수의 합 : "+t);
		
	}

}
