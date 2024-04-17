package com.itbank.model;

import java.util.List;

import com.itbank.model.vo.AccountVO;

public interface AccountDAO {

	List<AccountVO> selectAll();

	AccountVO selectOne(AccountVO user);

	int insert(AccountVO input);

	AccountVO newPw(AccountVO user);

	void newPwUp(AccountVO user);

	int update(AccountVO input);

}
