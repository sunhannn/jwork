package com.practice;

import java.util.*;

public class Practice002 {
	private static Practice001[] accountArray = new Practice001[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
			System.out.println("----------------------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {

			} else if (selectNo == 2) {

			} else if (selectNo == 3) {

			} else if (selectNo == 4) {

			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}

	// 계좌 생성
	private static void createAccount() {

	}
	//계좌 목록
	private static void accountList() {

	}
	// 예금
	private static void deposit() {
		
	}
	//출금
	private static void withdraw() {
		
	}
	//Account 배열에서 ano와 돌일한 Account 객체 찾기
	private static Practice001 findAccount(String ano) {
		
	}
	
}
