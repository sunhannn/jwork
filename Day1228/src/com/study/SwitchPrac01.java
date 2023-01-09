package com.study;
import java.util.*;
public class SwitchPrac01 {
/*
 * 	조건문 : switch ~ case 문
 * 	형식 : switch (조건값) { // 값으로 올 수 있는 자료형 : byte, short, int, char, String
 * 			  case 값 : 실행문 ; break;
 * 			  case 값 : 실행문 ; break;
 * 			(  default : 실행문; break;) 생략가능
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int score;
			String grade;
			System.out.print("점수를 입력해주세요 : ");
			score = sc.nextInt();
			
			switch (score / 10) {
			case 10 :  grade = "A+"; break;
			case 9 :	if (score % 10 >= 6) grade = "A+";
			else if (score % 10 == 5) grade ="A0";
			else grade = "b-";
			break;
			case 8 : 	if (score % 10 >= 6) grade = "B+";
			else if (score % 10 == 5) grade ="B0";
			else grade = "B-";
			break;
			case 7 : 	if (score % 10 >= 6) grade = "C+";
			else if (score % 10 == 5) grade ="C0";
			else grade = "C-";
			break;
			case 6 : 	if (score % 10 >= 6) grade = "D+";
			else if (score % 10 == 5) grade ="D0";
			else grade = "D-";
			break;
			default : grade = "F";
			}
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
		
	}

}
