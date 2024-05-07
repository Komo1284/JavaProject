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
		return dao.seleteAll();
	}

	public AccountVO login(AccountVO input) {
		return dao.selectOne(input);
	}

	public void addAcc(AccountVO input) {
		dao.insert(input);
	}

}
