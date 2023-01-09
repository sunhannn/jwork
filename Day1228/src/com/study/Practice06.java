package com.study;
import java.util.*;
public class Practice06 {
/* 변수로 만들어야하는 조건
 * : 값이 많이(자주 ) 변경되는 경우
 *  : 다른 곳에서 사용을 다시 하는 경우
 *  
 * 입력한 달이 3월 ~ 8월가지이면 "1학기" 출력하세요
 * 입력한 달이 3월 ~ 8월까지가 아니면 " 2학기"를 출력하세요.
 * 
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mon;
		String hak;
		
		System.out.println("지금 달을 입력하세요 : ");
		mon = sc.nextInt();
		
		if (mon >= 3 && mon <= 8 ) {
			hak = "1학기";
		}else {
			hak = "2학기";
		}
		System.out.println("지금은 "+hak+"입니다!");
		
	}

}
