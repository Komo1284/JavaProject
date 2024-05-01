package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;

	public List<BoardVO> getBoard() {
		return dao.getBoard();
	}

}
 