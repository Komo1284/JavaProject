package com.itbank.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import com.itbank.model.vo.AccountVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();
		AccountVO user = (AccountVO) session.getAttribute("user");
		
		if (user == null) {
			response.sendRedirect("/account/login");
			return false;
		}
		
		return true;
	}
}
