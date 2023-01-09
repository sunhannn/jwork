package com.study;
import java.util.*;
public class Practice02 {
/*
 *  조건문을 이용해서 내가 입력한 달에 해당되는 일 수가 나오도록 하세요.
 *   1월 , 3월 , 5월, 7월, 8월, 10월, 12월 : 31일
 *   2월 : (년도를 4로 나누어서 나머지가 0이면) 29일 / (0이 아니면) 28일
 *   4월, 6월, 9월, 11월 : 30일
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mon, day, year =0;
		
		System.out.println("올해는 몇년입니까? : ");
		year = sc.nextInt();
		System.out.println("지금 몇월입니까?  : ");
		mon = sc.nextInt();
		
		if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {
			day = 31;
		}else if (mon == 2) {
			if (year % 4 == 0) {
			day=29;	
			}else {
				day=28;
			}
		}else{
			day=30;
		}
		System.out.println("그럼 "+mon+"월 이라면 "+day+"일이겠군요!");
		
		
		
	}

}
