package model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.vo.PersonVO;

public class PersonDAO extends DAO {
	
	private PersonVO mapper(ResultSet rs) throws SQLException {
		PersonVO row = new PersonVO();
		
		Date birth = rs.getDate("birth");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time = sdf.format(birth);
		
		row.setBirth(time);
		row.setName(rs.getString("name"));
		row.setHeight(rs.getDouble("height"));
		
		return row;
	}
	
	public List<PersonVO> selectAll(){
		String sql = "select * from person";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			List<PersonVO> list = new ArrayList<>();
			
			while (rs.next()) {
				PersonVO row = mapper(rs);
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
	
	public PersonVO selectOne(String name) {
		String sql = "select * from person " + 
						"where name = ?";
		
		try {
			pstmt = getPrepared(sql);
			pstmt.setString(1, name);
			
			rs.next();
			
			PersonVO row = mapper(rs);
			
			return row;
			
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}
	
	public int insert(PersonVO input) {
		String sql = "insert into " + 
						"person(name, height, birth) " + 
						"values(?, ?, ?)";
		
		try {
			pstmt = getPrepared(sql);
			
			pstmt.setString(1, input.getName());
			pstmt.setDouble(2, input.getHeight());
			pstmt.setDate(3, input.getBirth());
			
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

	public int delete(String name) {
		String sql = "delete from person where name = ?";
		
		try {
			pstmt = getPrepared(sql);
			pstmt.setString(1, name);
			
			return pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}

	public int update(PersonVO input, String name) {
		String sql = "update person " + 
							"set name = ?, " + 
							"height = ?, " + 
							"birth = ?, " +  
						"where name = ?";
		
		try {
			pstmt = getPrepared(sql);
			
			pstmt.setString(1, input.getName());
			pstmt.setDouble(2, input.getHeight());
			pstmt.setDate(3, input.getBirth());
			pstmt.setString(4, name);
			
			return pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	
}
