package com.itbank.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.itbank.interceptor.LoginInterceptor;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		String[] paths = new String[] {
				"/account/myPage",
				"/board/write"
		};
		
		registry.addInterceptor(new LoginInterceptor())
			.addPathPatterns(paths);
	}
}
