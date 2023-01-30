package com.yedam.board;

public class BoardVO {

	// 필드
	private int boardNum;
	private String title;
	private String date;
	private String content;
	private String user;
	private int view;
	private int like;
	private int bad;

	// 메소드 getter setter
	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int board_num) {
		this.boardNum = board_num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
			this.view = view;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getBad() {
		return bad;
	}

	public void setBad(int bad) {
		this.bad = bad;
	}

	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", title=" + title + ", date=" + date + ", content=" + content
				+ ", user=" + user + ", view=" + view + ", like=" + like + ", bad=" + bad + "]";
	}
	

}
