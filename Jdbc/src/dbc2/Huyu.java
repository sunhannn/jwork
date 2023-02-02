package dbc2;

import java.sql.*;

public class Huyu {

	private Connection con;
	private PreparedStatement ps;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "test";
	String pwd = "1111";

	public Huyu(int deptno, String dname, String loc) {
		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("DB 연결 성공");
			String sql = "insert into dept values(?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, deptno);
			ps.setString(2, dname);
			ps.setString(3, loc);
			int result = ps.executeUpdate();
			System.out.println("처리된 레코드 개수 : " + result);
			ps.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Huyu(50, "개발", "서울");
	}

}
