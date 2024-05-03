package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itbank.model.AccountDAO;
import com.itbank.model.vo.AccountVO;

@Service
public class AccountService {

	@Autowired
	private AccountDAO dao;

	public List<AccountVO> getAccs() {
		return dao.selectAll();
	}

	public AccountVO login(AccountVO input) {
		return dao.selectOne(input);
	}

	@Transactional
	public void signUp(AccountVO input) {
		dao.insert(input);
	}

	public void update(AccountVO input) {
		dao.update(input);
	}

	public void delete(int idx) {
		dao.delete(idx);
	}
	
	
	
}
