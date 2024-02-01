package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DAO (Database Access Object)
// - DB 접근 코드를 재사용하기 위해서 고안된 객체

class DAO {
	// 1. 준비물
	protected String driver = "oracle.jdbc.driver.OracleDriver";
	protected String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	protected String user = "c##itbank";
	protected String password = "it";
	
	protected Connection conn;
	protected Statement stmt;
	protected ResultSet rs;
	
	Statement getStatement() {
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			
			return stmt;
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("드라이버 예외 : " + e.getMessage());
		}
		
		return null;
	}
	
	void close() {
		try {
			if (rs != null)		rs.close();
			if (stmt != null)	stmt.close();
			if (conn != null)	conn.close();
		} catch(Exception e) {}
	}
	
	// 2. 실행할 SQL 구문별로 메서드로 구현
	String test() {
		String sql = "select banner from v$version";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			rs.next();
			
			return rs.getString("banner");
		}catch(SQLException | NullPointerException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
		} finally {
			close();
		}
		return null;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		System.out.println(dao.test());
	}
}
