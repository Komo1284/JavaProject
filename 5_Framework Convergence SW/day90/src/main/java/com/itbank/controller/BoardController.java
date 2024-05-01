package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.service.BoardService;
import com.itbank.vo.BoardVO;

/*
	C##user1.board 테이블을 활용한다
*/
@RestController
public class BoardController {
	
	// GET /board 로 요청시 board_view 테이블의 정보를 json으로 모두 반환
	// 확인은, 웹브라우저 혹은 postman으로 진행
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("/board")
	public List<BoardVO> getBoard() {
		
		return bs.getBoard();
	}
	
	@PostMapping("/board")
	public String addBoard() {
		return "추가 완료~"	;
	}
}
