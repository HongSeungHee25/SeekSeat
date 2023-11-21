package controller.community;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;

//커뮤니티 글 쓰기
public class WriteViewController implements Controller {
	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("page",request.getParameter("page"));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("write.jsp");
		dispatcher.forward(request, response);
	}
}