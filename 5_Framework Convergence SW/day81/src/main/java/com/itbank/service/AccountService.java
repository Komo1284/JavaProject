package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.AccountDAO;
import com.itbank.model.vo.AccountVO;

@Service
public class AccountService {

	@Autowired
	private AccountDAO dao;

	public List<AccountVO> getBoards() {
		
		return dao.selectAll();
	}

	public AccountVO login(AccountVO user) {
		
		String hashPw = HashPw.getHash(user.getUserpw());
		user.setUserpw(hashPw);
		
		return dao.selectOne(user);
	}

	public int addAccount(AccountVO input) {
		
//		String hashPw = HashPw.getHash(input.getUserpw());
//		input.setUserpw(hashPw);
		
		return dao.insert(input);
	}
	
	public String nPw(String userid, String email) {
		
		String newPw = NewPw.getPw();
		String hashPw = HashPw.getHash(newPw);
		AccountVO user = new AccountVO();
		
		user.setEmail(email);
		user.setUserid(userid);
		user = dao.newPw(user);
		
		user.setUserpw(hashPw);
		dao.newPwUp(user);
		return newPw;
	}

	public int update(AccountVO input) {
		
//		String hashPw = HashPw.getHash(input.getUserpw());
//		input.setUserpw(hashPw);
		
		return dao.update(input);
		
	}
	
}
