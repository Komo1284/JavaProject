package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.vo.JoinVO;



public class JoinDAO extends DAO {
	private JoinVO mapper(ResultSet rs) throws SQLException {
		JoinVO row = new JoinVO();
		
		row.setIdx(rs.getInt("idx"));
		row.setDep_name(rs.getString("dep_name"));
		row.setDep_phone(rs.getString("dep_phone"));
		row.setDep_idx(rs.getInt("dep_idx"));
		row.setName(rs.getString("name"));
		row.setPosition(rs.getString("position"));
		
		return row;
	}
	
	public List<JoinVO> inner() {
		String sql = "select * from emp_to_dep";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			List<JoinVO> list = new ArrayList<>();
			
			while (rs.next()) {
				JoinVO row = mapper(rs);
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
	
	public List<JoinVO> rightOuter() {
		String sql = "select * from emp_right_dep";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			List<JoinVO> list = new ArrayList<>();
			
			while (rs.next()) {
				JoinVO row = mapper(rs);
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
}
