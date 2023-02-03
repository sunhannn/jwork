package com.study;

import java.sql.*;

public class TestEx {

	public static void main(String[] args) {
			
				try {
//	1. 오라클 드라이버 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");
//	2. 데이터베이스 연결객체 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "test";
			String pwd = "1111";
			Connection con = DriverManager.getConnection(url,user,pwd);
//	3. SQL명령문 만들기
			String sql = "update dept set dname = ?, loc = ?" + "where deptno = ?";
//	4. 명령문 객체 생성 및 sql문 넣기
			PreparedStatement ps = con .prepareStatement(sql);
//	5. sql명령의 bind변수에 대응 하는 값 설정하기
			ps.setString(1,"영업");
			ps.setString(2,"서울");
			ps.setInt(3,50);
			ps.execute();
			ps.close();
			con.close();
//	6. 실행하기
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
