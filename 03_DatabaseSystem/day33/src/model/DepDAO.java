package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.DepVO;



public class DepDAO extends DAO {
	private DepVO mapper(ResultSet rs) throws SQLException {
		DepVO row = new DepVO();
		
		row.setIdx(rs.getInt("idx"));
		row.setDep_create(rs.getDate("dep_create"));
		row.setDep_email(rs.getString("dep_email"));
		row.setDep_name(rs.getString("dep_name"));
		row.setDep_phone(rs.getString("dep_phone"));
		
		return row;
	}
	
	public List<DepVO> selectAll() {
		String sql = "select * from dep order by idx";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			List<DepVO> list = new ArrayList<>();
			
			while (rs.next()) {
				DepVO row = mapper(rs);
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
