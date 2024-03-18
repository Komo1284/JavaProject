package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DAO {
	protected Context ct;
	protected DataSource ds;
	
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	protected Statement getStatement() {
		try {
			conn = ds.getConnection();
			
			return conn.createStatement();
			
		} catch (SQLException e) {
			System.err.println("드라이버 예외 : " + e.getMessage());
		}
		
		return null;
	}
	
	protected PreparedStatement getPrepared(String sql) {
		try {
			conn = ds.getConnection();
			
			return conn.prepareStatement(sql);
			
		} catch(SQLException e) {
			System.err.println("드라이버 예외 : " + e.getMessage());
		}
		
		return null;
	}
	
	public DAO() {
		
		try {
			ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/oracle");
			
			System.out.println("DBCP 성공~");
			
		} catch (NamingException e) {
			System.out.println("생성자 예외 : " + e.getMessage());
		} finally {
			close();
		}
	}
	
	protected void close() {
		try {
			if(rs != null)			rs.close();
			if(pstmt != null)		pstmt.close();
			if(stmt != null)		stmt.close();
			if(conn != null)		conn.close();
			
		} catch (Exception e) {}
	}

	public String test() {
		String sql = "select banner from v$version";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getString("banner");
		} catch (SQLException e) {
			System.out.println("test 예외 :" + e.getMessage());
		}
		
		return null;
	}
}
