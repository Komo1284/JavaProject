package com.itbank.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.itbank.model.vo.BoardVO;

@Component
@Aspect
public class BoardAOP {
	
	@Before("execution(* com.itbank.service.BoardService.*(int))")
	public void param(JoinPoint jp) {
		System.out.println("파라미터 테스트~");
		
		for (Object ob : jp.getArgs()) {
			System.out.println(ob);
		}
		
		System.out.println(jp);
		System.out.println(jp.getSignature());
		System.out.println(jp.getSignature().getName());
		
		String methodName = jp.getSignature().getName();
		
		System.out.println(methodName + " 호출됨!!!");
	}

	@Before("execution(* *.*.service.BoardService.*(com.itbank.model.vo.BoardVO))")
	public void voCheck(JoinPoint jp) {
		BoardVO vo = (BoardVO) jp.getArgs()[0];
		
		System.out.println("유저번호 : " + vo.getUser_idx());
		System.out.println("제목 : " + vo.getTitle());
		System.out.println("내용 : " + vo.getContents());
	}
}
