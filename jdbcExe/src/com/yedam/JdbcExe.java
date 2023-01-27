package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExe {

	public static void main(String[] args) {
		// jdbc Oracle data CRUD작업.
		// 1. ojdbc.jar라이브러리.
		// 2. Connection 객체 db연결 -> 쿼리실행 or 실행결과 통로.

		Connection conn; // db연결 해주는 객체
		Statement stmt = null; // sql문 실행 객체
		ResultSet rs = null; // sql문 결과 받아오는 객체 => set컬렉션으로 값을 받아옴
		String sql = "insert into employees(employee_id, job_id, last_name, email, hire_date) values(300, 'IT_PROG', '홍', 'HONG', sysdate)";
		// sql = "delete from employees where employee_id = 300"; //삭제
		sql = "update employees set first_name = '길동' where employee_id = '300'"; // 수정

		// jdbc driver 정상적인지 확인
		try {
			Class.forName("oracle.jdbc.OracleDriver"); //Class.forName() => 외부 라이브러리 주소를 가져오는 메소드
		} catch (ClassNotFoundException e) {
			System.out.println("Oracle Driver Error");
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "hr";

		try {
			conn = DriverManager.getConnection(url, user, pass); // (요청 url, id, pass)
			System.out.println("연결 성공!!😊");

			stmt = conn.createStatement(); // 쿼리실행, 처리결과 데이터를 받아오는 객체.

			int r = stmt.executeUpdate(sql); // executeUpdate(insert, update, delete) 변한 데이터 개수????? 아마도...
			
			// executeQuery => select문만 해당 
			//order by employee_id => id값 순으로 정렬함
			rs = stmt.executeQuery("select * from employees order by employee_id"); 

			while (rs.next()) {
				System.out.println("사원번호 : " + rs.getInt("employee_id") + ", 이름 : " + rs.getString("first_name")
						+ ", email : " + rs.getString("email") + ", 급여 : " + rs.getInt("salary"));
			}
			
			System.out.println("end of records");

		} catch (SQLException e) {
			System.out.println("처리실패!!😒");
			e.printStackTrace();
		}

	}

}
