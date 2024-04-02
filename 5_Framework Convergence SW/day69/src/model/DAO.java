package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import service.Paging;

public class DAO {
	private Context ct;
	private DataSource ds;
	
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
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

	public int totalBoard() {
		String sql = "select count(*) as count from board";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getInt("count");
			
		} catch (SQLException e) {
			System.out.println("totalBoard 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}
	
	public <T> Map<String, Object> query(String sql, int reqPage, Mapper<T> mp) {
		
		Map<String, Object> map = new HashMap<>();
		
		Paging pg = new Paging(reqPage, totalBoard());
		
		try {
			
			pstmt = getPrepared(sql);
			
			pstmt.setInt(1, pg.getOffset());
			pstmt.setInt(2, pg.getBoardCount());

			
			rs = pstmt.executeQuery();
			
			List<T> list = new ArrayList<T>();
			
			while (rs.next()) {
				list.add(mp.mapping(rs));
			}
			
			map.put("list", list);
			map.put("pg", pg);
		
			
			return map;
			
		} catch (SQLException e) {
			System.out.println("query 예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return null;
	}
	
	public <T> T queryForObject(String sql, Mapper<T> mp, Object...args) {
		
		try {
			pstmt = getPrepared(sql);
			
			for(int i = 0; i < args.length; i++) {
				pstmt.setObject(i + 1, args[i]);
			}
			
			rs = pstmt.executeQuery();
			rs.next();
			
			return mp.mapping(rs);
			
		} catch(SQLException e) {
			System.out.println("queryForObject 예외 : " + e.getMessage()); 
		} finally {
			close();
		}
		
		
		return null;
	}

	public int update(String sql, Object... args) {
		
		try {
			
			pstmt = getPrepared(sql);
			
			for (int i = 0; i < args.length; i++) {
				pstmt.setObject(i + 1, args[i]);
			}
			
			return pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println("update예외 : " + e.getMessage());
		} finally {
			close();
		}
		
		return 0;
	}

}
