package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.itbank.vo.BoardVO;

public interface BoardDAO {

	@Select("select * from board_view order by idx desc")
	List<BoardVO> getBoard();

}
