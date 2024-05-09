package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.model.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO dao;
	
	public List<BoardVO> getBoards() {
		return dao.selectAll();
	}

	public BoardVO getBoard(int idx) {
		return dao.selectOne(idx);
	}

	public void addBoard(BoardVO input) {
		dao.insert(input);
	}
	
	public void upBoard(BoardVO input) {
		dao.update(input);
	}

	public void delBoard(int idx) {
		dao.delete(idx);
	}


}
