package dbc1;

import java.sql.*;

public class FirstJDBC {

	public static void main(String[] args) throws SQLException {
		try {
			// 1. 드라이버 로딩. 오라클 드라이버 정보를 메모리에 (static으로)올려 놓는다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Success!");

			// 2. Db와 커넥션(접속) 정보 설정 및 접속
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "test";
			String pwd = "1111";

			Connection con = DriverManager.getConnection(url, user, pwd);
			System.out.println("DB connected~~!");

			// 3. DB에 쿼리문을 전송하기 위한 Statement 객체 할당받기
			Statement st = con.createStatement();
			String sql = "SELECT * FROM dept";

			// 4. DB에 쿼리문 전송
			ResultSet rs = st.executeQuery(sql);
			// select문일 경우는 executeQuery(sql)을 이용
			// 이때 반환타입은 ResultSet

			// 5. ResultSet의 커서를 이동하면서 데이터를 얻어와 출력
			while (rs.next()) {
				int col1 = rs.getInt(1);//1 -> deptno
				String col2 = rs.getString(2); // 2 -> dname
				String col3 = rs.getString(3); // 3 -> loc
				System.out.println(col1 + "\t" + col2 + "\t" + col3);
			}
			// 6. DB와 연결된 자원 반납(닫기)
			// 보통 close()는 finally 블록에 작성
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();

		} catch (ClassNotFoundException e) {
			System.out.println(e + "=> 드라이버 로딩 오류");
		} catch (SQLException e) {
			System.out.println(e + "=> DB 로딩 오류");
		}

	}

}
