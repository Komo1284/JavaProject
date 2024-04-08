package com.itbank.service;

import java.util.HashMap;
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

	public Map<String, Object> list(int reqPage) {
		
		Map<String, Object> map = new HashMap<>();
		map.put("list", dao.selectAll());
		map.put("pg", page);
		
		return map;
	}
	
	public int addBoard(BoardVO input) {
		return dao.insert(input);
	}

	public BoardVO selectOne(int idx) {
		return dao.selectOne(idx);
	}
	
	public int updateBoard(BoardVO bd) {
		return dao.update(bd);
	}

	public int deleteBoard(int idx) {
		return dao.delete(idx);
	}

	public BoardVO getBoard(int idx) {
		
		dao.viewUp(idx);
		return dao.selectOne(idx);
	}
}
