package com.itbank.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestDAO {
	
	@Select("select banner from v$version")
	String test();
}
