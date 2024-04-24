package com.itbank.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itbank.model.BoardDAO;
import com.itbank.model.vo.BoardVO;

@Service
public class BoardService {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private BoardDAO dao;

	public List<BoardVO> getBoards() {
		
		return dao.selectAll();
	}

	@Transactional(readOnly = true)
	public void logTest() {
		logger.error("에러");
		logger.warn("경고");
		logger.info("정보");
		logger.debug("디버그");
		logger.trace("추적");
	}
	
	@Transactional(rollbackFor = Exception.class)
	public int insertTest() throws Exception {
		dao.insert("테스트1");
		dao.insert("테스트2");
		
		int n = 1;
		
		if(n==1) {
			throw new Exception("예외 발생");
		}
		dao.insert("테스트3");
		
		return 0;
	}

	@Transactional(readOnly = true)
	public int addBoard(BoardVO input) {
		
		return dao.addBoard(input);
	}

	@Transactional(readOnly = true)
	public BoardVO getBoard(int idx) {
	
		return dao.selectOne(idx);
	}

	@Transactional(readOnly = true)
	public int deleteBoard(int idx) {
		
		return dao.deleteBoard(idx);
	}

	@Transactional(readOnly = true)
	public void updateBoard(BoardVO input) {
		dao.updateBoard(input);
		
	}
	
	
	
}
