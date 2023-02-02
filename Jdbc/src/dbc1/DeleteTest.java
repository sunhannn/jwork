package dbc1;

import java.sql.*;

public class DeleteTest {
	private Connection con;
	private Statement st;

	public DeleteTest(int empno) {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			User user = new User();
			Connection con = DriverManager.getConnection(user.getUrl(), user.getUser(), user.getPwd());
			System.out.println("DB 연결 성공");

			String sql = "delete from emp where empno = " + empno;
			int result = st.executeUpdate(sql);
			System.out.println("처리된 레코드 개수 : " + result);
			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println(e + "=>드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println(e + "=> sql 예외");
		} catch (Exception e) {
			System.out.println(e + "=> 일반 예외");
		}

	}

	public static void main(String[] args) {
		new DeleteTest(2);
	}

}
