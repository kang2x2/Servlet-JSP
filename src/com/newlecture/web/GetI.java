package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/kang2x2")  /*어노테이션을 이용한 url매핑(귀찮고 복잡하게 xml파일을 건들 필요가 없다.)*/
public class GetI  extends HttpServlet {
		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setCharacterEncoding("UTF-8"); /* 한글 출력 인코딩 */
			response.setContentType("text/html; charset=UTF-8");/* 한글 출력 인코딩 */
			PrintWriter out = response.getWriter();
			
			int cnt = 0; /* 정수형 변수 cnt에 0 입력 */
			String temp = request.getParameter("cnt"); /* temp라는 String형 변수를 만들어 파라미터로 cnt저장 */
			
			/* 만약 temp값이 null이거나 빈 문자열이 아니면 cnt의 값만큼 실행 */
			if(temp != null && !temp.equals("")) {
				cnt = Integer.parseInt(temp); /* 변환코드 */
			}
			
			for(int i = 0; i < cnt; ++i) {
				out.println("쿼리스트링을 이용한" + i + "번째 출력 <br>");				
			}
			
			out.println("Hello~~~  kang2x2의 servlet연습 <br>");
			
			for(int i = 0; i < 5; ++i) {
				out.println(i + "번째 출력 <br>");
			}
		}
}
