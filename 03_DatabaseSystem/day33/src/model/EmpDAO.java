package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.vo.EmpVO;

public class EmpDAO extends DAO {
	private EmpVO mapper(ResultSet rs) throws SQLException {
		EmpVO row = new EmpVO();
		
		row.setIdx(rs.getInt("idx"));
		row.setName(rs.getString("name"));
		row.setBirth(rs.getDate("birth"));
		row.setDep_idx(rs.getInt("dep_idx"));
		row.setEmail(rs.getString("email"));
		row.setGender(rs.getString("gender"));
		row.setH_date(rs.getDate("h_date"));
		row.setPhone(rs.getString("phone"));
		row.setPosition(rs.getString("position"));
		row.setSalary(rs.getInt("salary"));
		
		return row;
	}
	
	public List<EmpVO> selectAll() {
		String sql = "select * from emp order by dep_idx, idx desc";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmpVO> list = new ArrayList<>();
			
			while (rs.next()) {
				EmpVO row = mapper(rs);
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
