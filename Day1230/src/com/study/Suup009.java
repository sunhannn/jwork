package com.study;

public class Suup009 {
/*
 *  이차원 배열 : 행과 열로 이루어진 배열 (바둑판)
 *  // 선언 및 행렬 공간할당
 *  자료형 [] [] 변수명 = new 자료형 [행개수] [열개수]
 *  
 *  // 초기화
 *  변수명[행인덱스번호][열인덱스번호] = 값;
 *  
 *  // 선언 및 행공간할당
 *  자료형 [][] 변수명 = new 자료형 [행개수][];
 *  
 *  // 열공간할당
 *  변수명[행인덱스번호] = new 자료형 [열인덱스번호];
 *  
 *  // 초기화
 *	변수명 [행인덱스번호][열인덱스번호] = 값;
 *
 *  // 단축형식 (선언 및 공간생성 / 초기화)
 *  변수명[행인덱스번호][열인덱스번호] = {{값1, 값2,...}, {값1, 값2, ...}};
 * 
 */
	public static void main(String[] args) {
		
		int [][] a = new int [2] [];
		
		a[0] = new int [2];
		a [1] = new int[3]; 
		
		for (int i = 0; i < a.length; i++ ) { // a.length는 행의 수
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = i+j;
				if (j == a[i].length-1) System.out.println(a[i][j]);
				else System.out.print(a[i][j] + "  ");
			}
		}
		
	}

}
