package com.study;

public class Suup007 {

	public static void main(String[] args) {
		int [] a = {95, 73, 100}; int tot = 0;
		double avg; int i;
		
		for (i = 0; i < a.length; i++) tot += a[i];
		
		avg = (double) tot / a.length; // 마지막 인덱스 는 lenth-1
		avg = tot / a.length;
		
		System.out.println("총합 = " + tot);
		System.out.println("평균 = "+ avg);
		
		
	}

}
