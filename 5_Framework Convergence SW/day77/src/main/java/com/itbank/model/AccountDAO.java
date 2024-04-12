package com.itbank.model;

import java.util.List;

import com.itbank.model.vo.AccountVO;

public interface AccountDAO {

	List<AccountVO> selectAll();

	AccountVO selectOne(AccountVO user);

}
