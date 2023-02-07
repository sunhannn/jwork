package com.pro;

import java.sql.*;
import java.util.Scanner;

public class MacSVC extends JdbcUtil {
	Connection con;

	public MacVO getMacVO(Scanner sc) {
		System.out.println("=== 주문 등록 ===");
		System.out.print("주문자 : ");
		String cusName = sc.next();
		System.out.print(" 핸드폰 번호 : ");
		String cusPhone = sc.next();
		System.out.print(" 주소 : ");
		String cusAdd = sc.next();
		System.out.print("상품 이름 : ");
		String cusProName = sc.next();
		System.out.print("상품 개수 : ");
		int cusCount = sc.nextInt();
		System.out.print("상품 가격 : ");
		int cusPrice = sc.nextInt();

		MacVO macVO = new MacVO(0, cusName, cusPhone, cusAdd, cusProName, cusCount, cusPrice);
		return macVO;
	}

	public void newOrder(Scanner sc) {
		MacVO macVO = getMacVO(sc);
		con = getConnection();
		PreparedStatement pstmt = null;

		String sql = "INSERT INTO cus_info VALUES(SEQ_ORDER.nextval, ?, ?, ?, ?, ?, ?, 'X')";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, macVO.getCusName());
			pstmt.setString(2, macVO.getCusPhone());
			pstmt.setString(3, macVO.getCusAdd());
			pstmt.setString(4, macVO.getCusProName());
			pstmt.setInt(5, macVO.getCusCount());
			pstmt.setInt(6, macVO.getBurgerPrice());

			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("주문 완료");
			} else {
				System.out.println("주문 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}
	}

	public void canOrder2 (Scanner sc) {
		System.out.println("취소할 주문의 작성자를 입력하세요!");
		System.out.print(">> ");
		String name = sc.next();
	}
	
	
	public void cancelOrder(Scanner sc) {
		con = getConnection();
		PreparedStatement pstmt = null;
		 int updateCount = 0;
		MacVO macVO = getMacVO(sc);
		
		macVO.setCusName(name);

		String sql = "UPDATE cus_info SET CUS_CANSEL = 'O' " + " WHERE id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, macVO.getCusName());
		 updateCount = pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		if (updateCount > 0) {
			System.out.println("주문 취소 완료");
		}else {
			System.out.println("주문 취소 실패...");
		}

	}

}
