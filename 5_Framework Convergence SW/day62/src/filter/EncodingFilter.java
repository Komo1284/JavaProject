package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class EncodingFilter implements Filter {

	
	// doFilter : 지정 주소로 요청될 때마다 실행되는 메서드
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// 필요한 로직을 수행한다
		HttpServletRequest req = (HttpServletRequest)request;
		
		req.setCharacterEncoding("utf-8");
		req.setAttribute("cpath", req.getContextPath());
		req.setAttribute("encoding", req.getCharacterEncoding());
		
		// 그 후 원래 요청하려던 페이지로 이어준다
		chain.doFilter(request, response);
	}

	// init : 서버 실행시 최초 한번만 실행되는 메서드
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	
	// destroy : 서버 종료시 최초 한번만 실행되는 메서드
	@Override
	public void destroy() {}
}
