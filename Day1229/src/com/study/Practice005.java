package com.study;

public class Practice005 {
/*
 * 	분기처리예약어(제어어) : break : break를 감싸고 있는 최초의 제어문 (ex)반복문 switch case)의
 * 	}뒤로 빠져나간다.
 * 
 * 	continue : continue를 감싸고 있는 최초의 반복문의 머리로 돌아간다.
 * 
 */
	public static void main(String[] args) {
//		System.out.println("for문 2");
//		int total = 0;
//		
//		for (int n =1; n <= 10; n++) {
//			if (n==7) break;
//			
//			total += n;
//		}
//		System.out.println("합계는 "+ total);
//		
//		System.out.println("for 문 3");
//		
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 ==0) continue;
//		System.out.print(i + " ");
//		}
//		
		
		int total = 0;
		
		for (int i =0; i < 3; i++) {
			for (int n =1 ; n <= 5; n++) {
				if(n == 3) break;
					total += n; // total = total + n
			}
		}
		System.out.println("합계는 " + total);
	}

}
