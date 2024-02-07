package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	protected String driver = "oracle.jdbc.driver.OracleDriver";
	protected String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	protected String user = "c##itbank";
	protected String password = "it";
	
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	protected Statement getStatement() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
			return conn.createStatement();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("드라이버 예외 : " + e.getMessage());
		}
		
		return null;
	}
	
	protected PreparedStatement getPrepared(String sql) {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
			return conn.prepareStatement(sql);
			
		} catch(ClassNotFoundException | SQLException e) {
			System.err.println("드라이버 예외 : " + e.getMessage());
		}
		
		return null;
	}
	
	protected void close() {
		try {
			if (rs != null) 	rs.close();
			if (stmt != null) 	stmt.close();
			if (conn != null) 	conn.close();
			
		} catch(Exception e) {}
	}
	
	public String test() {
		String sql = "select banner from v$version";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getString("banner");
			
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		
		return null;
	}
}
