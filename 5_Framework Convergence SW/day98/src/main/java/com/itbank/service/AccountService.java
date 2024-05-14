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
	
	public List<AccountVO> getAccs() {
		return dao.selectAll();
	}

	public AccountVO getAcc(AccountVO input) {
		
		String hashPw = SHA512.getHash(input.getUserpw());
		input.setUserpw(hashPw);
		
		return dao.selectOne(input);
	}

	public void addAcc(AccountVO input) {
		
		String hashPw = SHA512.getHash(input.getUserpw());
		input.setUserpw(hashPw);
		
		dao.insert(input);
	}

}
