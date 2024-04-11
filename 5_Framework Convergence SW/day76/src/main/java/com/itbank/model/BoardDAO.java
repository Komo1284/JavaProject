package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itbank.model.vo.BoardVO;

public interface BoardDAO {

	@Select("select banner from v$version")
	String test();

	@Select("select * from board_view order by idx desc "
			+ "offset 0 rows "
			+ "fetch first 10 rows only")
	List<BoardVO> selectAll();
	
	@Insert("insert into board(title, user_idx, contents) "
			+ "values(#{title}, #{user_idx}, #{contents})")
	int insert(BoardVO input);
	// 여러개의 데이터(값)을 받을땐 VO 혹은 Map으로 받아야 한다
}
