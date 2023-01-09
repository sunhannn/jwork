package com.practice;

import java.io.*;

public class Lotto {
	// 전역 변수
	private int command = 0;

	private BufferedReader in;
	private LottoPro program = null;

	// CODE 값
	public final int RECOMMANDATION_NUMBER = 1;
	public final int PRINT_NUMBER = 2;
	public final int EXIT = 3;

	public Lotto() {
		// main 함수에서 Lotto의 인스턴스 호출하였으므로 생성자인 이곳이 제일먼저 실행

		// 생성자 변수 초기화

		in = new BufferedReader(new InputStreamReader(System.in));
		program = new LottoPro(true);
//		program = new LottoPro(false);
//		program = new LottoPro();

		start();
	}

	public void start() {
		// 이렇게 프로그램을 동작시킬 메서드를 하나 만들어서 관리하는 것이 편하다
		System.out.println("로또 프로그램이 시작됩니다.");
		for (int i = 1; i < 11; i++) {
			System.out.println(i * 10 + "%");
			if (i == 10)
				System.out.println("환영합니다!");
		}
		System.out.println();
		do {
			System.out.println("--------------MENU--------------");
			System.out.println("1. 추첨     2. 보기      3끝내기");
			System.out.println("-------------------------------------");
			System.out.println(">> ");
			try {
				this.command = Integer.parseInt(in.readLine());
			} catch (IOException e) {
				System.out.println("(System)IOException !! try again..!");
				continue;
			}
			switch (this.command) {
			case RECOMMANDATION_NUMBER:
				program.start_recommandation();
				break;
			case PRINT_NUMBER:
				program.printNumber();
				break;
			case EXIT:
				System.out.println("(System)GOOD BYE!");
				return;
			}
		} while (true);
	}

	public static void main(String[] args) {
		new Lotto();
	}

}
