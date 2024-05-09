package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.BoardVO;
import com.itbank.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService bs;
	
	@GetMapping
	public ModelAndView list() {
		
		ModelAndView mav = new ModelAndView("/board/list");
		
		mav.addObject("list", bs.getBoards());
		
		return mav;
	}
	
	@GetMapping("/view")
	public ModelAndView view(@RequestParam("idx") int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("bd", bs.getBoard(idx));
		
		return mav;
	}
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public String add(BoardVO input) {
		
		bs.addBoard(input);
		
		return "redirect:/board";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("idx") int idx) {
		
		bs.delBoard(idx);
		
		return "redirect:/board";
	}
	
	@GetMapping("/update")
	public ModelAndView update(@RequestParam("idx") int idx) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("bd", bs.getBoard(idx));
		
		return mav;
	}
	
	@PostMapping("/update")
	public String update(BoardVO input) {
		
		bs.upBoard(input);
		
		return "redirect:/board";
	}
	
	
}
