package com.itbank.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.BoardVO;
import com.itbank.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService bs;
	
	@GetMapping("/write")
	public ModelAndView write() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/board/write");
		
		return mav;
	}
	
	@PostMapping("/write")
	public ModelAndView write(BoardVO input) {
		
		ModelAndView mav = new ModelAndView();
		
		int row = bs.addBoard(input);
		String msg = row == 0 ? "작성 실패" : "작성 완료";

		mav.addObject("row", row);
		mav.addObject("msg", msg);
		mav.setViewName("message");

		
		return mav;
	}
	
	// Spring은 url에 작성된 내용도 파라미터로 받아 처리 가능
	// - url 중간에 있는 값도 받아서 처리 가능
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable int idx) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoard(idx));
		mav.setViewName("board/view");
		
		return mav;
	}
	
	@GetMapping("/update/{idx}")
	public ModelAndView update(@PathVariable int idx) {
		
		ModelAndView mav = new ModelAndView();
		
		BoardVO bd = bs.selectOne(idx);
		
		
		mav.addObject("bd", bd);
		mav.setViewName("/board/update");
		
		return mav;
	}
	
	@PostMapping("/update/{idx}")
	public ModelAndView update(BoardVO bd) {
		
		ModelAndView mav = new ModelAndView();
		
		int row = bs.updateBoard(bd);
		String msg = row == 0 ? "수정 실패" : "수정 완료";

		mav.addObject("row", row);
		mav.addObject("msg", msg);
		mav.setViewName("message");
		
		return mav;
	}
	
	
	@GetMapping("/delete/{idx}")
	public ModelAndView delete(@PathVariable int idx) {
		
		ModelAndView mav = new ModelAndView();
		
		int row = bs.deleteBoard(idx);
		String msg = row == 0 ? "삭제 실패" : "삭제 완료";
		
		mav.addObject("row", row);
		mav.addObject("msg", msg);
		mav.setViewName("message");
		
		return mav;
	}
}
