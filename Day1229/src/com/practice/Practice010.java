package com.practice;
import java.util.*;
public class Practice010 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc= new Scanner(System.in);
		int money = 0, mi = 0, t = 0;
		bank : 
		while (run)	{
			System.out.println("-------------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			balance = sc.nextInt();
			
			switch (balance) {
			case 1 : System.out.print("예금액> "); money = sc.nextInt(); t += money; continue;
			case 2 : System.out.print("출금액> "); mi = sc.nextInt(); t -= mi; continue;
			case 3 : System.out.print("잔고> "+ t); System.out.println( ); continue;
			case 4 : 	break bank;
			}
		
		}
		System.out.println("프로그램 종료");  
	}

}
