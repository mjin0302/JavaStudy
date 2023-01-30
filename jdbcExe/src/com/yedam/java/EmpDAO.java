package com.yedam.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDAO {
	// 필드
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "hr";
	String pass = "hr";

	Connection conn; // db연결 해주는 객체
	Statement stmt = null; // conn이 stmt 객체를 만들어줌
	PreparedStatement psmt = null;
	ResultSet rs = null; // set컬렉션
	String sql;

	// DB랑 연결하는 메소드
	public void connect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	// C(create), R(read), U(update), D(delete) 처리

	// 목록조회 메소드
	public List<Map<String, Object>> empList() {

		sql = "select * from emp_temp";
		connect();
		List<Map<String, Object>> list = new ArrayList<>();

		try {

			stmt = conn.createStatement(); // 쿼리를 실행하기 위한 객체
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("emp_id", rs.getInt("employee_id"));
				map.put("first_name", rs.getString("first_name"));
				map.put("last_name", rs.getString("last_name"));
				map.put("salary", rs.getInt("salary"));

				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	// List<Matp<String, Object>> 비교
	public List<EmpVO> empVoList() {
		connect(); // 연결 메소드 호출
		sql = "select * from emp_temp";
		List<EmpVO> list = new ArrayList<>();
		try {
			// conn을 이용해서 createStatement() sql문을 실행하기 위한 객체 생성 -> stmt에 저장
			stmt = conn.createStatement();
			//stmt를 이용해서 sql문을 실행한 결과를 -> rs에 저장
			rs = stmt.executeQuery(sql);

			while (rs.next()) {	//rs.next() -> 1행
				EmpVO emp = new EmpVO();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_Date"));

				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// 단건조회
	public EmpVO getEmp(int id) {
		sql = "select * from emp_temp where employee_id = " + id;
		connect();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				EmpVO emp = new EmpVO();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_Date"));

				return emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; // 조회된 데이터 값이 없을때 반환해주는 값

	}
	
	//입력 메소드
	public int addEmp(EmpVO emp) {
		connect();
		sql = "insert into emp_temp (employee_id, last_name, email, hire_date, job_id)"
				+ "values(?, ?, ?, ?, ?)";
		
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp.getEmployeeId());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());
			
			r = psmt.executeUpdate(); //처리된 건수
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

	// 수정
	public int updateEmp(int id, int sal) {
		connect();
		sql = "update emp_temp set salary = ? where employee_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sal);
			psmt.setInt(2, id);
			
			r = psmt.executeUpdate(); //처리된 건수
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

	// 삭제
	public int deleteEmp(int id) {
		connect();
		sql = "delete from emp_temp where employee_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			
			r = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
}
