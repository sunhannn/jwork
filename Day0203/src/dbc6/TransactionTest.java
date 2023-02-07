package dbc6;

import java.sql.*;

public class TransactionTest {
	Connection con;

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void connect() {

		try {

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "test", "1111");

			// 자동커밋여부 제어
			con.setAutoCommit(false);
			System.out.println("Connection Complete");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insert() {
		connect();
		Statement stmt = null;
		boolean isOrderSuccess = false;
		try {
			stmt = con.createStatement();
			String sql = "insert into pay values ('aaa', '001', '1000')";
			stmt.executeUpdate(sql);
			sql = "insert into orderList values ('001', 'p2014001')";
			stmt.executeUpdate(sql);
			isOrderSuccess = true;
		} catch (SQLException e) {
			System.out.println("추가 실패");
			e.printStackTrace();
		} finally {
			if (isOrderSuccess) {
				try {
					con.commit();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				try {
					con.rollback();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		TransactionTest tt = new TransactionTest();
		tt.insert();

	}

}
