package com.yedam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myinfo") // url
public class FirstServlet extends HttpServlet { // http통신 요청-응답.

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		resp.setContentType("text/html; charset=utf8");
		resp.getWriter().print("<h3>servlet page</h3>"); // client 출력 스트링
		resp.getWriter().print("<a href='info/resume.html'>이력서</a>");
	}

}
