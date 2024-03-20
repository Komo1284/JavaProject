package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.AccountVO;

public class AccountDAO extends DAO {
	private AccountVO mapper(ResultSet rs) throws SQLException {
		AccountVO row = new AccountVO();
		
		row.setIdx(rs.getInt("idx"));
		row.setUserid(rs.getString("userid"));
		row.setUserpw(rs.getString("userpw"));
		row.setNick(rs.getString("nick"));
		row.setEmail(rs.getString("email"));
		row.setJoin_date(rs.getDate("join_date"));
		
		return row;
	}
	public List<AccountVO> selectAll(){
		String sql = "select * from account order by idx desc";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			List<AccountVO> list = new ArrayList<>();
			
			while (rs.next()) {
				AccountVO row = mapper(rs);
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
	
	public AccountVO selectOne(int idx) {
		String sql = "select * from account " + 
						"where idx = ?";
		
		try {
			pstmt = getPrepared(sql);
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			AccountVO row = mapper(rs);
			
			return row;
			
		} catch(SQLException e) {
			System.err.println("selectOne 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}
	
	public int insert(AccountVO input) {
		String sql = "insert into " + 
						"account(userid, userpw, nick, email) " + 
						"values(?, ?, ?, ?)";
		
		try {
			pstmt = getPrepared(sql);
			
			pstmt.setString(1, input.getUserid());
			pstmt.setString(2, input.getUserpw());
			pstmt.setString(3, input.getNick());
			pstmt.setString(4, input.getEmail());
			
			
			int row = pstmt.executeUpdate();
			// executeQuery : select
			// executeUpdate : insert, update, delete
			
			return row;
		
		} catch(SQLException e) {
			System.err.println("Insert 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}

	public int delete(int idx) {
		String sql = "delete from account where idx = ?";
		
		try {
			pstmt = getPrepared(sql);
			pstmt.setInt(1, idx);
			
			return pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.err.println("Delete 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}

	public int update(AccountVO input, int idx) {
		String sql = "update account " + 
							"set userid = ?, " + 
							"userpw = ?, " + 
							"nick = ?, " + 
							"email = ? " +  
						"where idx = ?";
		
		try {
			pstmt = getPrepared(sql);
			
			pstmt.setString(1, input.getUserid());
			pstmt.setString(2, input.getUserpw());
			pstmt.setString(3, input.getNick());
			pstmt.setString(4, input.getEmail());
			pstmt.setInt(5, idx);
			
			return pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println("update 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public AccountVO login(String id, String pw) {
		
		String sql = "select * from account " + 
	            "where userid = ? and userpw = ?";


		try {
			pstmt = getPrepared(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			AccountVO row = mapper(rs);
			
			return row;
			
		} catch(SQLException e) {
			System.out.println("login 예외 : " + e.getMessage());
			
		} finally {
			close();
		}

		return null;
	}
	
	public String findId(String email) {
		String sql = "select userid from account where email = ?";
		
		try {
			pstmt = getPrepared(sql);
			pstmt.setString(1, email);
			
			rs = pstmt.executeQuery();
			rs.next();

			
			return rs.getString("userid");
			
		} catch(SQLException e) {
			System.err.println("findId 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		
		return null;
	}
	
	public String findPw(String userid, String email) {
		String sql = "select userpw from account "
				+ "where email = ? and userid = ?";
		
		try {
			pstmt = getPrepared(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, userid);
			
			rs = pstmt.executeQuery();
			rs.next();

			
			return rs.getString("userpw");
			
		} catch(SQLException e) {
			System.err.println("findPw 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		
		return null;
	}
	
	public int changePw(AccountVO acc, String newPw) {
		
		String sql = "update account " + 
				"set userpw = ?, " + 
				"where idx = ?";

		try {
		pstmt = getPrepared(sql);
		
		pstmt.setString(1, newPw);
		pstmt.setInt(2, acc.getIdx());
		
		return pstmt.executeUpdate();
		
		} catch(SQLException e) {
		System.out.println("update 예외 : " + e.getMessage());
		
		} finally {
		close();
		}
		
		return 0;
	}
	
}
