package com.study;

public class Practice002 {

	public static void main(String[] args) {
		
		int y=2024, m=1, d = 0;
		for (m = m; m <=12; m++) {
		switch (m) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10: case 12:
			d=31; break;
		case 2 : 
			if (y % 4 == 0) {d = 29;}
			else {d = 28;}
			break;
		default : d= 30;
		}
		System.out.println(y + "년도의 "+m+"월");
		
		for (int i = 1; i <=d;i++) {
			System.out.print(i+"일");
		}
		System.out.println();
	}
	}
}
