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

import com.itbank.exception.LoginException;
import com.itbank.model.AccountDAO;
import com.itbank.model.vo.AccountVO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO dao;
	
	@Value("file:E:/profile")
	private Resource rs;
	
	@Transactional(readOnly = true)
	public List<AccountVO> getAccounts(){
		return dao.selectAll();
	}
	
	@Transactional(readOnly = true)
	public AccountVO getAccount(AccountVO input) throws LoginException {
		
		AccountVO user = dao.selectOne(input);
		
		// 일치하는 계정 정보가 없으면 null이 반환된다. 이때 예외를 발생시킨다.
		if(user == null) {
			throw new LoginException("로그인 실패. 일치하는 정보가 없습니다.");
		}
		
		int profile = user.getProfile();
		int idx = user.getIdx();
		String path = (profile == 1) ? idx + "/profile.jpg": "default.jpg";
		
		System.out.println(path);
		
		user.setImage(path);
		
		return user;
	}

	public int addAccount(AccountVO input) {
		int row = dao.addAccount(input);
		
		if (row != 0) {
			// 1. select로 현재 가입한 계정의 번호(idx)를 가져온다
			AccountVO user = dao.selectOne(input);
			int idx = user.getIdx();
			
			// 2. 해당 번호(idx)로 프로필 폴더 안에 번호로 폴더를 생성
			File file = new File("E:\\profile\\" + idx);
			file.mkdir();
			
			
		}
		
		return row;
	}

	public void profileUpdate(AccountVO input) throws IOException {
		File profile = rs.getFile();
		MultipartFile upload = input.getUpload();
		
		
		
		if(!"".equals(upload.getOriginalFilename())) {
			String name = input.getIdx() + "/profile.jpg";
			
			File dest = new File(profile, name);
			upload.transferTo(dest);
			
			input.setProfile(1);
		}
		
		dao.update(input);
		
		
	}

	public void deleteAcc(HttpSession session) throws IOException {
		
		AccountVO user = (AccountVO) session.getAttribute("user");
		int idx = user.getIdx();
		
		String name = "/" + idx;
		File profile = rs.getFile();
		File dest = new File(profile, name);

		
		for(File file : dest.listFiles()) {
			file.delete();
		}
		dest.delete();
		
		dao.delete(idx);
		
	}
	
}
