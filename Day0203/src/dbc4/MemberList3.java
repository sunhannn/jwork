package dbc4;

import java.sql.*;

public class MemberList3 {

	public static void main(String[] args) {
		try {
			Connection conn = DBConnec1.getcoConnection();
			String sql = "select m_seq, m_userid, m_pwd, m_email, m_hp, m_registdate, "
					+ " m_point from tb_member order by  m_seq desc";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println("번호\t아이디\t비밀번호\t이메일\t\t핸드폰번호\t\t가입일자\t\t\t포인트");

			while (rs.next()) {
				System.out.print(rs.getInt(1));
				for (int i = 1; i <= 7; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println("1111");
			}
				rs.close();
				stmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				DBConnec1.close();
			} catch (SQLException e) {

			}
		}

	}

}
