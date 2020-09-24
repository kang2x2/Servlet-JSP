package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 어노테이션 방식으로 url매핑(xml파일 건드는거보다 훨씬 간편하다)
@WebServlet("/cal")
public class Cal extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			한글 출력을 위한 인코딩 작업
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			
//			출력을 위한 선언.
			PrintWriter out = response.getWriter();
			
//			변수선언 초기화
			int x = 0;
			int y = 0;
			int result = 0;
			
//			파라미터값으로 요청받은 x와 y를 담는다?
			String num1 = request.getParameter("x");
			String num2 = request.getParameter("y");
			
//			x와 y에 요청받았던 값을 저장하던 num1과 num2를 다시 받는다.
			x = Integer.parseInt(num1);
			y = Integer.parseInt(num2);
//			html상의 버튼들의 이름(value)을 알아내기 위함.
			String operator = request.getParameter("operator");
			
			if(operator.equals("더하기")) 
				result = x + y;
			else if(operator.equals("빼기")) 
				result = x - y;
			else if(operator.equals("곱하기")) 
				result = x * y;
			else if(operator.equals("나누기")) 
				result = x / y;
			
//			결과 출력.
			out.println(result);			
	}
}
