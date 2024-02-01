package jdbc;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// DAO를 활용해서 Person 테이블을 모두 출력

class PersonVO {
	private double height;
	private String name;
	private Date birth;
	
	@Override
		public String toString() {
			String msg = "%s %.1f %s";
			msg = String.format(msg,  name, height, birth);
			
			return msg;
		}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	
	
	
}

class PersonDAO extends DAO {
	
	List<PersonVO> selectAll(){
		String sql = "select * from person";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			// 모든 행을 담을 리스트
			List<PersonVO> list = new ArrayList<PersonVO>();
			
			while(rs.next()) {
				// 1개의 행을 담을 VO
				PersonVO row = new PersonVO();
				
				row.setName(rs.getString("name"));
				row.setHeight(rs.getDouble("height"));
				row.setBirth(rs.getDate("birth"));
				
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

public class Quiz1 {
	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		
		List<PersonVO> list = dao.selectAll();
		for (PersonVO row : list) {
			System.out.println(row);
		}
	}
}
