package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ImageView")
public class Ex05ImageView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		int num = Integer.parseInt(request.getParameter("num"));

		String src = "";

		if (num == 1) {
			src = "img/cat01.jpg";
		} else if (num == 2) {
			src = "img/cat02.jpg";
		} else if (num == 3) {
			src = "img/cat03.jpg";
		}

		out.print("<html>");
		out.print("<head><title>����� �̹���</title></head>");
		out.print("<body>");
		out.print("<img src='"+src+"' alt='�ش� �̹����� �ҷ��� �� �����ϴ�.'>");
		out.print("</body>");
		out.print("</html>");
	}

}
