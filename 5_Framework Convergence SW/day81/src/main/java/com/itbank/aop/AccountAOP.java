package com.itbank.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.itbank.model.vo.AccountVO;
import com.itbank.service.HashPw;

@Component
@Aspect
public class AccountAOP {
	
	@Before("execution(int *.*.service.AccountService.*(com.itbank.model.vo.AccountVO))")
	public AccountVO dd(JoinPoint jp) {
		
		AccountVO acc = (AccountVO) jp.getArgs()[0];
		
		String hashPw = HashPw.getHash(acc.getUserpw());
		acc.setUserpw(hashPw);
		
		return acc;
		
	}
}
