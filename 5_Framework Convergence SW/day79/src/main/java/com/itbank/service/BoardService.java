package com.itbank.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.model.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO dao;

	public String test() {
		return dao.test();
	}

	public List<BoardVO> getBoards(Map<String, Object> param) {
		
		if (param.get("type") == null) {
			param.put("type", "title");
		}
		
		return dao.selectAll(param);
	}

	public int addBoard(BoardVO input) {
		
		return dao.insert(input);
	}

	public int deleteBoard(int idx) {
		
		return dao.delete(idx);
	}

	public BoardVO getboard(int idx) {
		
		return dao.selectOne(idx);
	}

	public int updateBoard(BoardVO input) {
		return dao.update(input);
		
	}
	
	
}
