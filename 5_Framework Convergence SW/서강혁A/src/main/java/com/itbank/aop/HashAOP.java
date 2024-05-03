package com.itbank.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.itbank.components.SHA512;
import com.itbank.model.vo.AccountVO;

@Component
@Aspect
public class HashAOP {

	@Before("execution(* *.*.service.AccountService.*(com.itbank.model.vo.AccountVO))")
	public AccountVO dd(JoinPoint jp) {
		
		AccountVO acc = (AccountVO) jp.getArgs()[0];
		
		String hashPw = SHA512.getHash(acc.getUserpw());
		acc.setUserpw(hashPw);
		
		return acc;
		
	}
	
}
