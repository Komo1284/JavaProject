package com.itbank.controller;




import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.BoardVO;
import com.itbank.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("/")
	public ModelAndView home() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("board/list");
		mav.addObject("list",bs.getBoards());
		
		return mav;
	}
	
	@GetMapping("/board/write")
	public void write() {}
	
	@PostMapping("/board/write")
	public ModelAndView write(BoardVO input, MultipartFile file, HttpSession session) throws IOException {
		
		ModelAndView mav = new ModelAndView();
		
		int idx = bs.write(input, file, session);
		
		mav.addObject("row", 1);
		mav.addObject("msg", "작성 완료");
		mav.addObject("path", "/board/view/" + idx);
		
		return mav;
	}
	
	@GetMapping("board/view/{idx}")
	public ModelAndView view(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoard(idx));
		mav.setViewName("board/view");
		
		return mav;
	}
	
	@GetMapping("board/update/{idx}")
	public ModelAndView update(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoard(idx));
		mav.setViewName("board/write");
		
		return mav;
	}
	
	@PostMapping("board/update/{idx}")
	public String update(BoardVO input, @PathVariable int idx) {
		
		input.setIdx(idx);
		bs.updateBoard(input);
		
		return "redirect:/";
	}
	
	@GetMapping("board/delete/{idx}")
	public String delete(@PathVariable int idx) {
		int row = bs.deleteBoard(idx);
		
		System.out.println(row != 0 ? "성공" : "실패");
		
		return "redirect:/";
	}
	
	
	
	
}
