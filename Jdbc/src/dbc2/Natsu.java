package dbc2;

import java.sql.*;

public class Natsu {

	private Connection con = null;
	private PreparedStatement ps = null;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "test";
	String pwd = "1111";

	public Natsu(int deptno, String dname, String loc) {
		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pwd);
			String sql = "Update dept set deptno = ?, dname = ?, loc = ? where deptno = 50";
			ps = con.prepareStatement(sql);
			ps.setInt(1, deptno);
			ps.setString(2, dname);
			ps.setString(3, loc);
			ps.executeUpdate();

			ps.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e + "드라이버 로드 실패요");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e + " sql예외요");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("처리완료");
	}

	public static void main(String[] args) {
		new Natsu(50, "인사", "부산");

	}
}