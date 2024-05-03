package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.vo.BoardVO;

public interface BoardDAO {

	@Select("select * from board_view order by idx desc "
				+ "offset 0 rows "
				+ "fetch first 10 rows only")
	List<BoardVO> getBoard();

	@Insert("insert into board(title, contents, user_idx) "
			+ "values(#{title}, #{contents}, #{user_idx})")
	int insert(BoardVO input);

	@Delete("delete from board where idx = #{idx}")
	int delete(int idx);

	@Update("update board set title = #{title} "
			+ "where idx = #{idx}")
	int update(BoardVO input);

}
