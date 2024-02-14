package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;


public class DAO {
	protected String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	protected String user = "c##itbank";
	protected String password = "it";
	
	protected BasicDataSource bds;
	
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	public DAO() {
		bds = new BasicDataSource();
		
		bds.setUrl(url);
		bds.setUsername(user);
		bds.setPassword(password);
		
		close();	
	}
	
	protected void close() {
		try {
			if (rs != null)	rs.close();
			if (stmt != null) stmt.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		} catch (Exception e) {}
	}
	
	public String test() {
		String sql = "select banner from v$version";
		
		try {
			conn = bds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getString("banner");
		}catch(SQLException e) {
			System.err.println("test 예외");
		}finally {
			close();
		}
		
		return null;
	}
}
