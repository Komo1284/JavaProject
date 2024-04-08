package com.itbank.model;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.itbank.model.vo.BoardVO;
import com.itbank.service.Paging;

@Repository
public class BoardDAO {
	
	@Autowired
	private JdbcTemplate jt;
	
	private RowMapper<BoardVO> rm = (ResultSet rs, int rowNum) -> {
		
		BoardVO row = new BoardVO();
		
		row.setIdx(rs.getInt("idx"));
		row.setContents(rs.getString("contents"));
		row.setNick(rs.getString("nick"));
		row.setTitle(rs.getString("title"));
		row.setV_count(rs.getInt("v_count"));
		row.setW_date(rs.getDate("w_date"));
		
		return row;
	};

	public String test() {
		String sql = "select banner from v$version";
		
		return jt.queryForObject(sql, String.class);
	}

	public int totalBoard() {
		String sql = "select count(*) as count from board";
		
		return jt.queryForObject(sql, Integer.class);
	}
	
	public List<BoardVO> selectAll(int reqPage) {
		String sql = "select * from board_view " + 
				"order by idx desc " + 
				"offset ? rows " + 
				"fetch first ? rows only";
		
		Paging pg = new Paging(reqPage, totalBoard());
		return jt.query(sql, rm, pg.getOffset(),pg.getBoardCount());
	}

	public int insert(BoardVO input) {
		String sql = "insert into "
				+ "board(title, contents, user_idx) "
				+ "values(?, ?, ?)";
		
		String title = input.getTitle();
		String contents = input.getContents();
		int user_idx = input.getUser_idx();

		return jt.update(sql, title, contents, user_idx);
	}

	public int update(BoardVO input) {
		String sql = "update board set "
				+ "title = ?, contents = ? "
				+ "where idx = ?";
		
		String title = input.getTitle();
		String contents = input.getContents();
		int idx = input.getIdx();
		
		return jt.update(sql, title, contents, idx);
	}

	public int delete(int idx) {
		String sql = "delete from board where idx = ?";
		
		return jt.update(sql, idx);
	}

	public BoardVO selectOne(int idx) {
		String sql = "select * from board_view where idx = ?";
		
		return jt.queryForObject(sql, rm, idx);
	}

	public void viewUp(int idx) {
		String sql = "update board "
				+ "set v_count = v_count + 1 "
				+ "where idx = ?";
		
		jt.update(sql, idx);
	}
	
	
	
}
