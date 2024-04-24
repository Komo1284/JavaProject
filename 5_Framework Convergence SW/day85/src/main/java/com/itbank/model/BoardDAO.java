package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.vo.BoardVO;

public interface BoardDAO {
	
	@Select("select * from board_view order by idx desc")
	List<BoardVO> selectAll();

	@Select("select banner from v$version")
	String test();
	
	@Insert("insert into board(nick) values(#{nick})")
	void insert(String nick);

	@Insert("insert into board(title, nick, contents) "
			+ "values (#{title}, #{nick}, #{contents})")
	int addBoard(BoardVO input);

	@Select("select * from board_view where idx = #{idx}")
	BoardVO selectOne(int idx);

	@Delete("delete from board where idx = #{idx}")
	int deleteBoard(int idx);

	@Update("update board set "
			+ "title = #{title}, contents = #{contents}, nick = #{nick} "
			+ "where idx = #{idx}")
	void updateBoard(BoardVO input);
	
}
