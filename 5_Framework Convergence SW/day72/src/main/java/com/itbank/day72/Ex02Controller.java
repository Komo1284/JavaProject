package com.itbank.day72;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.AccountVO;
import com.itbank.service.Ex02Service;

@Controller
public class Ex02Controller {

	@Autowired					// 같은 이름의 클래스를 spring container에 찾아서 주입한다.
	private Ex02Service es;		// - 이름, 의존성 주입(DI)라고 한다
	
	@GetMapping("/ex02")
	public void ex02() {}
	
	@PostMapping("/ex02")
	public ModelAndView ex02(AccountVO input) {
		
		System.out.println("es = " + es);
		// - 콘솔에서 해시코드가 같은 것을 확인한다.
		// - 해시코드가 뜬다 -> 인스턴스가 있다
		// - 해시코드가 같다 -> 동일한 인스턴스를 계속 사용한다
		// - 이러한 코드 패턴을 '싱글톤'이라고 한다
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", es.login(input));
		mav.setViewName("ex02_result");
		
		return mav;
	}
	
	
}
