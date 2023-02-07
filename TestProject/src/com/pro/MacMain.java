package com.pro;

import java.util.*;

public class MacMain {

	public static void main(String[] args) {
		MacSVC macSVC = new MacSVC();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("===== Mcdonalds 주문 입출력 시스템 =====");
			System.out.println("1. 주문 등록");
			System.out.println("2. 주문 취소");
			System.out.println("3. 주문 수정");
			System.out.println("4. 주문 삭제");
			System.out.println("5. 주문 검색");
			System.out.println("6. 주문 목록 출력");
			System.out.println("7. 시스템 종료");
			System.out.print("메뉴를 선택하세요 >  ");

			int menu = Integer.parseInt(sc.next());

			switch (menu) {
			case 1:
				macSVC.newOrder(sc);
				break;
			case 2:
				macSVC.cancelOrder(sc);
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:
			case 7:
				return;
			default:
				System.out.println("명령 입력이 잘못되었습니다. 다시 입력해주세요.");
			}

		} while (true);

	}

}
