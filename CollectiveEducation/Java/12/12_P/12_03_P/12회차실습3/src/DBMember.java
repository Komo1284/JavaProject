/* 사전작업 필요 : 데이터베이스 생성 및 테이블 생성
 DB Client --> 
 create databases member;
 connect member;
 create table info (number int not null primary key, hname varchar(20) not null, telno varchar(15) not null, age int not null);
*/

import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DBMember extends JFrame implements ChangeListener {
	
	final static String DB_URL = "jdbc:mariadb://localhost:3306/member";
	final static String DB_DRIVER = "org.mariadb.jdbc.Driver";
	Connection db;

	public DBMember() {
		super("회원 관리 프로그램");
		Container frame = getContentPane();
		
		try {
			Class.forName(DB_DRIVER);
			db = DriverManager.getConnection(DB_URL, "root", "12345678");
		} catch(ClassNotFoundException ex1) {
			this.setTitle("드라이버 로딩 실패\n");
		} catch(SQLException ex1) {
			this.setTitle("DB 연결 실패\n");
		}

		DBInsert insert = new DBInsert(db);
		DBManage manage = new DBManage(db);
		
		JTabbedPane tpane = new JTabbedPane();
		tpane.addTab("회원 등록", insert);
		tpane.addTab("회원 관리", manage);
		tpane.addTab("회원 목록", new JPanel());
		tpane.addChangeListener(this);
		
		frame.add(tpane, BorderLayout.CENTER);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) { 
				try {
					db.close();
				} catch(SQLException ex1) {	}
				dispose();
				System.exit(0);
			}
		});
	}
	public void stateChanged(ChangeEvent e) {
		JTabbedPane src = (JTabbedPane)e.getSource();
		if(src.getSelectedIndex() == 2) { // 회원 목록
			JPanel p = (JPanel)src.getSelectedComponent();
			p.removeAll();
			p.setLayout(new BorderLayout());
			p.add(new DBList(db));
			p.validate();
		}
	}
	public static void main(String[] args) {
		DBMember app = new DBMember();
		app.setSize(400,300);
		app.setVisible(true);
		
	}

}
