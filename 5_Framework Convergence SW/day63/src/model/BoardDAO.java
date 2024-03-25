package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.vo.BoardVO;
import service.Paging;

public class BoardDAO extends DAO {
	
	private BoardVO mapper(ResultSet rs) throws SQLException {
		BoardVO row = new BoardVO();
		
		row.setIdx(rs.getInt("idx"));
		row.setTitle(rs.getString("title"));
		row.setContents(rs.getString("contents"));
		row.setNick(rs.getString("nick"));
		row.setView_count(rs.getInt("view_count"));
		row.setW_date(rs.getDate("w_date"));
		
		return row;
	}
	
	public int totalBoard() {
		String sql = "select count(*) as count from board";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getInt("count");
			
		} catch (SQLException e) {
			System.out.println("totalBoard 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
	
	public Map<String, Object> selectAll(int reqPage){
		// 페이징 객체와 리스트를 담기 위한 Map을 선언
		Map<String, Object> map = new HashMap<String, Object>();
		
		// 페이징 진행
		Paging pg = new Paging(reqPage, totalBoard());
		
		String sql = "select * from board " + 
						"order by idx desc " + 
						"offset ? rows " + 
						"fetch first ? rows only";
		
		try {
			pstmt = getPrepared(sql);
			
			pstmt.setInt(1, pg.getOffset());
			pstmt.setInt(2, pg.getBoardCount());
			
			rs = pstmt.executeQuery();
			
			List<BoardVO> list = new ArrayList<>();
			
			while (rs.next()) {
				BoardVO row = mapper(rs);
				list.add(row);
			}
			
			// 맵에 반환할 객체를 저장
			map.put("list" , list);
			map.put("pg", pg);
			
			return map;
			
		} catch(SQLException e) {
			System.err.println("SelectAll 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	public BoardVO selectOne(int idx) {
		String sql = "select * from Board "
				+ "where idx = ?";

		try {
			viewUp(idx);
			
			pstmt = getPrepared(sql);
			
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			rs.next();

			
			return mapper(rs);
			
		} catch (SQLException e) {
			System.out.println("selectOne 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}
	
	public void viewUp(int idx) {
		String sql = "update board set view_count = view_count + 1 "
				+ "where idx = ?";
		
		try {
			
			pstmt = getPrepared(sql);
			
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			rs.next();

			
		} catch (SQLException e) {
			System.out.println("viewUp 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
	}
	
	public int insert(BoardVO bd) {
		String sql = "insert into "
						+ "board(title, nick, contents) "
						+ "values(?, ?, ?)";
		
		try {
			pstmt = getPrepared(sql);
			
			pstmt.setString(1, bd.getTitle());
			pstmt.setString(2, bd.getNick());
			pstmt.setString(3, bd.getContents());

			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("insert 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}

	public List<BoardVO> selectmyBoard(String nick){
		String sql = "select * from board where nick = ?";
		
		try {
			pstmt = getPrepared(sql);
			
			pstmt.setString(1, nick);
			
			rs = pstmt.executeQuery();
			
			List<BoardVO> list = new ArrayList<>();
			
			while (rs.next()) {
				BoardVO row = mapper(rs);
				list.add(row);
			}
			
			return list;
			
		} catch(SQLException e) {
			System.err.println("selectmyBoard 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}
	
	public int delete(int idx) {
		String sql = "delete from board where idx = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("delete 예외 : " + e.getMessage());
		}
		
		return 0;
	}

	public int update(BoardVO input) {
		String sql = "update board "
				+ "set "
					+ "title = ?, "
					+ "contents = ? "
				+ "where idx = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, input.getTitle());
			pstmt.setString(2, input.getContents());
			pstmt.setInt(3, input.getIdx());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
}
