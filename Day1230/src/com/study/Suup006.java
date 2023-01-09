package com.study;

public class Suup006 {
/*
 *  자동초기값을 받는 경우는 지역변수가 아닌 경우만 가능하다.
 * 
 */
	public static void main(String[] args) {
		int c = 0;
		System.out.print(c);
		int [] c1 = null;
		System.out.print(c1);
		int [] c2 = new int [5];	// 새로운 공간을 만드는 키워드
		System.out.print(c2);
		for (int i : c2) System.out.print(i + "  "); // for ( 배열객체의 요소의 자료형  변수이름 : 배열객체)
		int [] c3 =  {1,2,3,4,5};
		System.out.print(c3); // 인덱스가 존재하면 순서가 존재한다.
		for (int i : c3) System.out.print(i +"  ");
		
	
		
		
		
	}

}
