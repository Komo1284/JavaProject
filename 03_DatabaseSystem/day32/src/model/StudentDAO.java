package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.StudentVO;

public class StudentDAO extends DAO {
	private StudentVO mapper(ResultSet rs) throws SQLException {
		StudentVO row = new StudentVO();
		
		row.setIdx(rs.getInt("idx"));
		row.setName(rs.getString("name"));
		row.setKor(rs.getInt("kor"));
		row.setEng(rs.getInt("eng"));
		row.setMat(rs.getInt("mat"));
		
		return row;
	}
	
	public List<StudentVO> selectAll() {
		String sql = "select * from student order by idx asc";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			List<StudentVO> list = new ArrayList<>();
			
			while (rs.next()) {
				StudentVO row = mapper(rs);
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

	
	public StudentVO selectOne(StudentVO input) {
		String sql = "select * from student " + 
						"where idx = ?";
		
		try {
			pstmt = getPrepared(sql);
			
			pstmt.setInt(1, input.getIdx());
			
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
	public int insert(StudentVO input) {
		String sql = "insert into " + 
						"student(name, kor, eng, mat) " + 
						"values(?, ?, ?, ?)";
		
		try {
			pstmt = getPrepared(sql);
			
			pstmt.setString(1, input.getName());
			pstmt.setInt(2, input.getKor());
			pstmt.setInt(3, input.getEng());
			pstmt.setInt(4, input.getMat());
			
			int row = pstmt.executeUpdate();
			
			return row;
		
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}

	public int delete(int idx) {
		String sql = "delete from student where idx = ?";
		
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

	public int update(StudentVO stu) {
		String sql = "update student set name = ?, kor = ?, eng = ?, mat = ? "
						+ "where idx = ?";
					
		
		try {
			pstmt = getPrepared(sql);
			pstmt.setString(1, stu.getName());
			pstmt.setInt(2, stu.getKor());
			pstmt.setInt(3, stu.getEng());
			pstmt.setInt(4, stu.getMat());
			pstmt.setInt(5, stu.getIdx());
			
			return pstmt.executeUpdate();
		}catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
		}finally {
			close();
		}
		
		return 0;
	}
}

