package dbc5;

import java.sql.*;

public class DBConn {
	private static Connection dbConn;
	// 한 번 연결된 객체를 계속 사용, 연결되지 않은 경우만 연결 시도

	public static Connection getConnection() {
		if (dbConn == null) { // dbConn이 null이면 Connection 객체 생성
			try {

				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "test";
				String pw = "1111";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				dbConn = DriverManager.getConnection(url, user, pw);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		return dbConn;
	}

	public static Connection getConnection(String url, String user, String pwd) {
		if (dbConn == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				dbConn = DriverManager.getConnection(url, user, pwd);
			} catch (Exception e) {

			}

		}
		return dbConn;

	}

	public static void close() {
		if (dbConn != null) {
			try {
				if (!dbConn.isClosed())
					dbConn.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}
