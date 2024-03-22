package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.AccountVO;

public class AccountDAO extends DAO {
	
	private AccountVO mapper(ResultSet rs) throws SQLException {
		
		AccountVO row = new AccountVO();
		
		row.setEmail(rs.getString("email"));
		row.setIdx(rs.getInt("idx"));
		row.setJoin_date(rs.getDate("join_date"));
		row.setNick(rs.getString("nick"));
		row.setUserid(rs.getString("userid"));
		row.setUserpw(rs.getString("userpw"));
		
		return row;
	}
	
	public List<AccountVO> selectAll() {
		String sql = "select * from account order by idx desc";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<AccountVO> list = new ArrayList<>();
			
			while (rs.next()) {
				AccountVO row = mapper(rs);
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.out.println("selectAll 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	public AccountVO selectOne(AccountVO acc) {
		String sql = "select * from Account "
				+ "where userid = ? and userpw = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, acc.getUserid());
			pstmt.setString(2, acc.getUserpw());
			
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

	public int insert(AccountVO acc) {
		String sql = "insert into "
						+ "account(userid, userpw, nick, email) "
						+ "values(?, ?, ?, ?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, acc.getUserid());
			pstmt.setString(2, acc.getUserpw());
			pstmt.setString(3, acc.getNick());
			pstmt.setString(4, acc.getEmail());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("insert 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int delete(int idx) {
		String sql = "delete from account where idx = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("delete 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}

	public int update(AccountVO acc) {
		String sql = "update account "
						+ "set "
							+ "userpw = ?, "
							+ "email = ? "
						+ "where idx = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, acc.getUserpw());
			pstmt.setString(2, acc.getEmail());
			pstmt.setInt(3, acc.getIdx());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}

	public String findId(String email) {
		String sql = "select userid from account where email = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			return rs.getString("userid");
			
		} catch (SQLException e) {
			System.out.println("findId 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	public AccountVO findPw(AccountVO acc) {
		String sql = "select * from account "
						+ "where userid = ? and email = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, acc.getUserid());
			pstmt.setString(2, acc.getEmail());
			
			rs = pstmt.executeQuery();
			rs.next();
			
			return mapper(rs);
			
		} catch (SQLException e) {
			System.out.println("findPw 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}
}
