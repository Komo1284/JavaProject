package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.service.BoardService;
import com.itbank.vo.BoardVO;

/*
	C##user1.board 테이블을 활용한다
*/

@RestController
@RequestMapping("/board")
@CrossOrigin(origins = { "http://192.168.1.1:5500" })
public class BoardController {
	
	// GET /board 로 요청시 board_view 테이블의 정보를 json으로 모두 반환
	// 확인은, 웹브라우저 혹은 postman으로 진행
	
	@Autowired
	private BoardService bs;
	
	@GetMapping
	public List<BoardVO> getBoard() {
		
		return bs.getBoard();
	}
	
	@PostMapping
	public int addBoard(@RequestBody BoardVO input) {
		return bs.addBoard(input);
	}
	
	@DeleteMapping
	public int delBoard(int idx) {
		return bs.delBoard(idx);
	}
	
	@PatchMapping
	public int upBoard(@RequestBody BoardVO input) {
		return bs.upBoard(input);
	}
}
