package com.itbank.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.itbank.model.vo.AccountVO;

/*
	Interceptor : 요청을 가로채서 필요한 처리를 하기 위한 클래스
	
	작동 시점)
	1. preHandle			요청이 Controller에 넘어가기 전에 가로채서 코드 수행
	2. postHandle			컨트롤러의 메서드가 모두 수행된 후 가로채서 코드 수행
	3. afterCompletion		응답이 클라이언트에 전달된 후 코드를 가로채서 코드 수행
	
	※ 주로 preHandle로 데이터 적합성을 판별하고
	※ post, after는 디버깅용으로 사용된다
*/

public class LoginInterceptor extends HandlerInterceptorAdapter {

	// true가 반환되면 이어서 Controller 수행
	// false가 반환되면 Controller를 수행하지 않고 응답
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		AccountVO user = (AccountVO) session.getAttribute("user");
		String cpath = request.getContextPath();
		
		if(user == null) {
			response.sendRedirect(cpath + "/account/login");
			
			return false;
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}
	
	
}
