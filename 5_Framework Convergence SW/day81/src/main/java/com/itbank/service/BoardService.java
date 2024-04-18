package com.itbank.service;

import java.util.HashMap;
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

	public Map<String, Object> getBoards(Map<String, Object> param) {
		
		String sint = (String) param.get("page");
		sint = (sint == null) ? "1" : sint;
		
		int reqPage = Integer.parseInt(sint);
		String search = (String) param.get("search");
		
		Paging page;
		if(search != null) {
			page = new Paging(reqPage, dao.searchBoard());
		}
		else {
			page = new Paging(reqPage, dao.totalBoard());
		}
		
		
			
		param.put("offset", page.getOffset());
		param.put("boardCount", page.getBoardCount());
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("list", dao.selectAll(param));
		map.put("pg", page);
		
		return map;
	}

	public int addBoard(BoardVO input) {
		
		return dao.insert(input);
	}

	public int deleteBoard(int idx) {
		
		return dao.delete(idx);
	}

	public BoardVO getboard(int idx) {
		dao.viewUp(idx);
		return dao.selectOne(idx);
	}

	public int updateBoard(BoardVO input) {
		return dao.update(input);
		
	}
	
	
}
