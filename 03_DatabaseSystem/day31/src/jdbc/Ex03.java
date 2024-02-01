package jdbc;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// DTO : Data Transfer Object (= VO : Value Object)
// - 지정 테이블의 열정보를 저장하기 위한 객체

/*
	IDX       NOT NULL NUMBER       
	USERID    NOT NULL VARCHAR2(20) 
	USERPW    NOT NULL VARCHAR2(20) 
	NICK      NOT NULL VARCHAR2(60) 
	EMAIL              VARCHAR2(60) 
	JOIN_DATE          DATE    
*/
class AccountVO {
	private int idx;
	private String userid, userpw;
	private String nick, email;
	private Date join_date;
	
	@Override
		public String toString() {
			String msg = "%d %s %s %s %s %s";
			msg = String.format(msg,  idx, userid, userpw, nick, email, join_date);
			
			return msg;
		}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	
	
}


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
				
				row.setEmail(rs.getString("email"));
				row.setIdx(rs.getInt("idx"));
				row.setJoin_date(rs.getDate("join_date"));
				row.setNick(rs.getString("nick"));
				row.setUserid(rs.getString("userid"));
				row.setUserpw(rs.getString("userpw"));
				
				// 가져온 행을 리스트에 추가
				list.add(row);
			}
			
			return list;
			
		} catch(SQLException e) {
			System.err.println("SQL 예외: " + e.getMessage());
		}
		return null;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		
		List<AccountVO> list = dao.selectAll();
		for (AccountVO row : list) {
			System.out.println(row);
		}
	}
}
