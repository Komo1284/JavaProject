package com.itbank.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class LogAOP {
	
	private long start, end;
	
	@Before("execution(* com.itbank.service.*.*(..))")
	public void begin() {
		start = System.currentTimeMillis();
	}
	
	@After("execution(* com.itbank.service.*.*(..))")
	public void end() {
		end = System.currentTimeMillis();
		double result = (end - start) / 1000.0;
		
		log.debug("소요시간 : " + result + "초");
	}
}
