package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.vo.BoardVO;

@Mapper
public interface BoardDAO {

	@Select("select banner from v$version")
	String test();

	@Select("select * from board_view order by idx desc")
	List<BoardVO> selectAll();

	@Select("select * from board_view where idx = #{idx}")
	BoardVO selectOne(int idx);

	@Update("update board set "
			+ "title = #{title}, contents = #{contents} "
			+ "where idx = #{idx}")
	void update(BoardVO input);

	@Insert("insert into board (title, contents, user_idx) "
			+ "values (#{title}, #{contents}, #{user_idx})")
	void insert(BoardVO input);

	@Delete("delete from board where idx = #{idx}")
	void delete(int idx);
	
	
}
