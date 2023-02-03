package dbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Aki {
	private Connection con = null;
	private PreparedStatement ps = null;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "test";
	String pwd = "1111";

	public Aki(int deptno) {
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			String sql = "delete from dept where deptno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, deptno);
			ps.execute();
			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		}

		System.out.println("실행완료");

	}

	public static void main(String[] args) {
		new Aki(50);
		
		
		
	}

}
