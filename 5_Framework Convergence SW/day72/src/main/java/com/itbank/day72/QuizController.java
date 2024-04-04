package com.itbank.day72;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.AccountVO;
import com.itbank.service.QuizService;

@Controller
public class QuizController {

	@Autowired
	private QuizService qs;
	
	@GetMapping("quiz")
	public void quiz1() {
		
	}
	
	@PostMapping("quiz")
	public ModelAndView quiz1(AccountVO input) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg",qs.login(input));
		mav.setViewName("quiz_result");
		
		return mav;
	}
	
}
