package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice")  /*어노테이션을 이용한 url매핑(귀찮고 복잡하게 xml파일을 건들 필요가 없다.)*/
public class PostI  extends HttpServlet {
		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setCharacterEncoding("UTF-8"); /* 출력 값 한글 출력 인코딩 */
			response.setContentType("text/html; charset=UTF-8");/* 출력 값 한글 출력 인코딩 */
			/* request.setCharacterEncoding("UTF-8"); *//* 입력값 한글 출력 인코딩 */
			PrintWriter out = response.getWriter();
			
			String title = request.getParameter("title");/* temp라는 String형 변수를 만들어 파라미터로 title저장 */
			String content = request.getParameter("content");/* temp라는 String형 변수를 만들어 파라미터로 content저장 */
			
			out.println(title);
			out.println(content);

			
		}
}
