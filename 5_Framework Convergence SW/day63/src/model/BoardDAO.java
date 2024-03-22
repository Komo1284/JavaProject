package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.BoardVO;

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
	
	public List<BoardVO> selectAll(){
		String sql = "select * from board order by idx desc";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			List<BoardVO> list = new ArrayList<>();
			
			while (rs.next()) {
				BoardVO row = mapper(rs);
				list.add(row);
			}
			
			return list;
			
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
	
}
