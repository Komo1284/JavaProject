package com.itbank.day72;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.AccountVO;

@Controller
public class ExController {
	
	@GetMapping("/ex01")
	public void ex01() {
		
	}
	
	@PostMapping("/ex01")
	public ModelAndView ex01(AccountVO input) {
		
		// 1. 개발자가 구현하려는 기능(= 로직)을 작성한다.
		AccountVO user = new AccountVO("itbank", "it", "아뱅");
		String msg = "로그인 실패";
		
		if(user.equals(input)) {
			msg = user.getNick() + "님 로그인을 환영합니다.";
		}
		
		// 2. view에서 출력할 정보를 Attribute에 담는다.
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", msg);
		mav.setViewName("ex01_result");
		
		return mav;
		
		// 위의 코드 분석
		// - 로직과 요청/응답 처리의 기능이 같이 있다
		// - 여러가지 기능이 한 곳에 작성되면 유지 보수에 부적합
		// - 즉, 코드를 분리 시킬 필요가 있다.
		// - Spring에서 Controller는 요청/응답 처리에만 집중하는 것을 권장한다.
	}
}
