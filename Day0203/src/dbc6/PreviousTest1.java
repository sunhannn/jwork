package dbc6;

import java.sql.*;

public class PreviousTest1 {

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
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void select() {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String sql = "select * from member";
			rs = stmt.executeQuery(sql);

			System.out.println("앞으로 이동하면서 출력1");
			while (rs.next()) {
				for (int i = 1; i <= 6; i++) {
					System.out.print("\t" + rs.getString(i));
				}
				System.out.println();
			}
			System.out.println("앞으로 이동하면서 출력2");
			while (rs.next()) {
				for (int i = 1; i <= 6; i++) {
					System.out.print("\t" + rs.getString(i));
				}
				System.out.println();
			}

			rs.beforeFirst(); // ResultSet의 커서를 초기상태인 첫행의 전상태로(0일때) 이동시킨다.
			System.out.println("앞에서 뒤로 이동하면서 출력3");
			while (rs.next()) {
				for (int i = 1; i <= 6; i++) {
					System.out.print("\t" + rs.getString(i));
				}
				System.out.println();
			}
			System.out.println("뒤에서 앞으로 이동하면서 출력");
			while (rs.previous()) { // 이전의 위치로
				for (int i = 1; i <= 6; i++) {
					System.out.print("\t" + rs.getString(i));
				}
				System.out.println();
			}
			rs.last();
			System.out.println("총 줄 수 : " + rs.getRow());

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		PreviousTest1 pt = new PreviousTest1();
		pt.connect();
		pt.select();
	}

}
