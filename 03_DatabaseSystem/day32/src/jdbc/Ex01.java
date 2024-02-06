package jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DAO;
import model.vo.AccountVO;

class AccountDAO extends DAO {
	List<AccountVO> selectAll(){
		String sql = "select * from account order by idx desc";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			// 모든 행을 담을 리스트
			List<AccountVO> list = new ArrayList<AccountVO>();
			
			while(rs.next()) {
				// 1개의 행을 담을 VO
				AccountVO row = new AccountVO();
				
				row.setIdx(rs.getInt("idx"));
				row.setJoin_date(rs.getDate("join_date"));
				row.setEmail(rs.getString("email"));
				row.setNick(rs.getString("nick"));
				row.setUserid(rs.getString("userid"));
				row.setUserpw(rs.getString("userpw"));
				
				// 가져온 행을 리스트에 추가
				list.add(row);
			}
			
			return list;
			
		} catch(SQLException e) {
			System.err.println("SQL 예외: " + e.getMessage());
		} finally {
			close();
		}
		return null;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		
		System.out.println(dao.test());
		// select banner from v$version
		
		
		for(AccountVO row : dao.selectAll()) {
			// select * from account order by idx desc
			System.out.println(row);
		}
	}
}
