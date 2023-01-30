package com.yedam.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

	// 필드
	String url = "jdbc:oracle:thin:@3.34.253.0:1521:xe";
	String user = "dev";
	String pass = "dev";

	Connection conn; // db연결 해주는 객체
	Statement stmt = null; // conn이 stmt 객체를 만들어줌
	PreparedStatement psmt = null;
	ResultSet rs = null; // set컬렉션
	String sql;

	// DB연결 메소드
	public void connect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	// List<Matp<String, Object>> 비교
	public List<BoardVO> boardVoList() {
		connect(); // 연결 메소드 호출
		sql = "select * from board";
		List<BoardVO> list = new ArrayList<>();
		try {
			// conn을 이용해서 createStatement() sql문을 실행하기 위한 객체 생성 -> stmt에 저장
			stmt = conn.createStatement();
			// stmt를 이용해서 sql문을 실행한 결과를 -> rs에 저장
			rs = stmt.executeQuery(sql);

			while (rs.next()) { // rs.next() -> 1행
				BoardVO board = new BoardVO();
				board.setBoardNum(rs.getInt("board_num"));
				board.setUser(rs.getString("board_user"));
				board.setTitle(rs.getString("board_title"));
				board.setContent(rs.getString("board_content"));
				board.setView(rs.getInt("board_view"));

				list.add(board);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// 단건조회
	public BoardVO getBoard(int num) {
		sql = "select * from board where board_num = " + num;
		connect();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				BoardVO board = new BoardVO();
				board.setBoardNum(rs.getInt("board_num"));
				board.setDate(rs.getString("board_date"));
				board.setTitle(rs.getString("board_title"));
				board.setContent(rs.getString("board_content"));
				board.setUser(rs.getString("board_user"));
				board.setLike(rs.getInt("board_like"));
				board.setBad(rs.getInt("board_bad"));

				return board;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; // 조회된 데이터 값이 없을때 반환해주는 값

	}

	// 입력(등록) 메소드
	public int addBoard(BoardVO board) {
		connect();
		sql = "insert into board (board_title, board_content, board_user)" + "values(?, ?, ?)";

		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(2, board.getTitle());
			psmt.setString(3, board.getContent());
			psmt.setString(4, board.getUser());

			r = psmt.executeUpdate(); // 처리된 건수
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

	// 수정 메소드
	public int updateBoard(int num, String title, String content) {
		connect();
		sql = "update board set board_title = ?, board_content = ? where board_num = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, title);
			psmt.setNString(2, content);
			psmt.setInt(3, num);

			r = psmt.executeUpdate(); // 처리된 건수
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

	// 삭제
	public int deleteBoard(int num) {
		connect();
		sql = "delete from board where board_num = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);

			r = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return r;
	}
} // end of BoardDAO
