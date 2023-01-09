package com.practice;

public class Practice001 {
// 주어진 배열의 항목에서 최대값을 구해보아라
	public static void main(String[] args) {
		
		int max = 0;
		int [] array = {1,5,3,8,2};
		//작성위치
		for (int i = 0 ; i < array.length; i++) {
			if (array[i] == 8) max = array[i]; 
			
		}
		
		
		
		System.out.println("max : "+ max);
		
		
		
		
	}
	
}
