package com.study;
import java.util.*;
public class Practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mon, year;
		int day = 0;
		System.out.println("지금은 몇년 입니까? : ");
		year = sc.nextInt();
		
		System.out.println("지금은 몇월 입니까? : ");
		mon = sc.nextInt();
		if (mon > 12)
			mon = 12;
		
		switch (mon) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: day =31; break;
		case 2: 
			if (year % 4 == 0) {day = 29; break;} else { day = 28; break;}
			default : day = 30; break;
		}
		
		System.out.println("그럼 이번달 "+mon+"월은 "+day+"일까지 있겠군요!");

	}

}
