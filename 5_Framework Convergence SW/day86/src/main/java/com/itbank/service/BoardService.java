package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.itbank.model.BoardDAO;
import com.itbank.model.vo.AccountVO;
import com.itbank.model.vo.BoardVO;

@Service
public class BoardService {
	
	
	@Value("file:E:\\upload")
	private Resource rs;
	
	@Autowired
	private BoardDAO dao;

	public List<BoardVO> getBoards() {
		
		return dao.selectAll();
	}


	@Transactional(readOnly = true)
	public BoardVO getBoard(int idx) {
	
		return dao.selectOne(idx);
	}

	public int deleteBoard(int idx) {
		
		return dao.deleteBoard(idx);
	}

	public void updateBoard(BoardVO input) {
		dao.updateBoard(input);
		
	}


	public int write(BoardVO input, MultipartFile file, HttpSession session) throws IOException {
		// 파일 업로드를 수행
		String name = file.getOriginalFilename();
		File dir = rs.getFile();
		File dst = new File(dir, name);
		
		file.transferTo(dst);
		// DB에 정보를 저장
		// - 파일 이름과 세션의 게정 번호 추가
		AccountVO user = (AccountVO) session.getAttribute("user");
		
		
		input.setUpload(name);
		input.setUser_idx(user.getIdx());
		dao.insert(input);
		
		// 최신 글번호(idx)를 가져와 반환
		return dao.selectLast();
	}
	
	
	
}
