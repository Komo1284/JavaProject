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
	
	public List<AccountVO> getAccounts(){
		return dao.selectAll();
	}

	public AccountVO getAccount(AccountVO input) {
		
		return dao.selectOne(input);
	}
	
}
