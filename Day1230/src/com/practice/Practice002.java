package com.practice;

public class Practice002 {
// 주어진 배열의 전체 항목의 합과 평균값을 구해보세요(중첩 for문 이용)
	public static void main(String[] args) {
		int [] [] array = {
				{95, 86},
				{83,92,96},
				{78,83,93,87,88}		
		};
		
		int sum = 0;
		double avg = 0.0;
		// 작성위치
		
		for (int i =0; i < array.length; i++) {
			for (int y = 0; y < array[i].length; y++) {
				sum += array[i][y];
				
			}
			
		}
		avg = (double)sum / 10;
		
		
		System.out.println("sum : "+ sum);
		System.out.println("avg : "+ avg);
		
	}

}
