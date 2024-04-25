package com.itbank.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class ServiceAOP {
	
	Logger log = LoggerFactory.getLogger(ServiceAOP.class);
	
	@Around("execution(* com.itbank.service.*.*(..))")
	public Object useTime(ProceedingJoinPoint jp) throws Throwable {
		
		long begin = System.currentTimeMillis(); 
		
		Object result = jp.proceed(jp.getArgs());
		
		long end = System.currentTimeMillis();
		
		double spendTime = (end - begin) / 1000.0;
		
		log.debug("소요 시간 = {}", spendTime);
		
		return result;
	}
}
