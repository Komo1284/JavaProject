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
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			List<AccountVO> list = new ArrayList<>();
			
			while (rs.next()) {
				AccountVO row = mapper(rs);
				list.add(row);
			}
			
			return list;
			
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	// 1. Statement 사용시
	// - 매번 전체 구문을 다시 만들어서 실행 -> 비효율
	// - 데이터를 DB에서 채워서 구문을 수행 -> SQL injection 취약점 발생
	public AccountVO selectOne(AccountVO input) {
		String sql = "select * from account " + 
						"where userid = '%s' and userpw = '%s'";
		
		sql = String.format(sql, input.getUserid(), input.getUserpw());
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			AccountVO row = mapper(rs);
			
			return row;
			
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	// 2. PreparedStatement 사용시
	// - 전체 구문을 미리 만들고 데이터를 채울 부분만 다시 만들어 실행
	// - DB에 전송되면 이미 구문이 완성된 상태로 전달
	public AccountVO selectOne2(AccountVO input) {
		String sql = "select * from account " + 
						"where userid = ? and userpw = ?";
						//              1              2 (= index)
		
		try {
			pstmt = getPrepared(sql);
			
			pstmt.setString(1, input.getUserid());
			pstmt.setString(2, input.getUserpw());
			
			rs = pstmt.executeQuery();
			rs.next();
			
			return mapper(rs);
			
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	//JDBC로 Insert, Update, Delete 작업은 모두 자동으로 Commit 된다
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
			System.err.println("SQL 예외 : " + e.getMessage());
			
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
		}catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
		}finally {
			close();
		}
		
		return 0;
	}

	public int update(AccountVO user) {
		String sql = "update account set userid = ?, userpw = ? nick = ?, email = ? "
						+ "where idx = ?";
					
		
		try {
			pstmt = getPrepared(sql);
			pstmt.setString(1, user.getUserid());
			pstmt.setString(2, user.getUserpw());
			pstmt.setString(3, user.getNick());
			pstmt.setString(4, user.getEmail());
			pstmt.setInt(5, user.getIdx());
			
			
			
			return pstmt.executeUpdate();
		}catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
		}finally {
			close();
		}
		
		return 0;
	}
}