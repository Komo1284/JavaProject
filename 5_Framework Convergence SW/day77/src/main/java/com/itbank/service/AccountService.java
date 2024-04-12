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
		return dao.selectOne(user);
	}
	
}
