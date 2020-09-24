package com.newlecture.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//필터는 톰캣이 처음 실행될때 한번은 무조건 실행된다.
//그 후 요청이 있을 때 마다 필터는 실행된다. 
//모든 서블릿은 아래의 코드의 환경을 가짐.

//어노테이션 방법
@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		/* 다음 코드를 관할하는 코드 */ 
		chain.doFilter(request, response); /* 요청이 오면 흐름을 넘겨 다음 필터나 서블릿이 
																실행되게 하고 그 결과가 다시 돌아오면 */
		
	}

}
