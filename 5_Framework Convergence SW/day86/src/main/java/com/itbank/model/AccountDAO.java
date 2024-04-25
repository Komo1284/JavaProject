package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itbank.model.vo.AccountVO;

public interface AccountDAO {

	@Select("select * from account order by idx desc")
	List<AccountVO> selectAll();

	AccountVO selectOne(AccountVO input);

	@Insert("insert into account (userid, userpw, nick, email) "
			+ "values (#{userid}, #{userpw}, #{nick}, #{email})")
	int addAccount(AccountVO input);

}
