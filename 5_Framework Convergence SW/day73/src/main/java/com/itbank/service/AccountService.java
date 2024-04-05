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
	
	public String test() {

		return dao.test();
	}

	public List<AccountVO> list() {
		
		return dao.selectAll();
	}
	
	public int addAcc(AccountVO input) {
		return dao.insert(input);
	}

	public int updateAcc(AccountVO input) {
		return dao.update(input);
	}

	public int deleteAcc(AccountVO input) {
		return dao.delete(input);
	}
	
	
	
	
	
	
}
