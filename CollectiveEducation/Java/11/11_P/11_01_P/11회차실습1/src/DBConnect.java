import java.sql.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;

public class DBConnect extends JFrame implements ActionListener {
	
	final static String DB_DRIVER = "org.mariadb.jdbc.Driver";
	final static String DB_URL = "jdbc:mariadb://localhost:3306/students";
	Connection db;

	JButton connect = new JButton("DB Connect");
	JButton create = new JButton("Create Table");
	JButton disconnect = new JButton("DB Disconnect");
	JTextArea output = new JTextArea();
	
	public DBConnect() {
		super("JDBC-MariaDB Connect");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		connect.addActionListener(this);
		create.addActionListener(this);
		disconnect.addActionListener(this);
		
		connect.setEnabled(true);
		create.setEnabled(false);
		disconnect.setEnabled(false);
		
		JPanel p = new JPanel();
		p.add(connect);
		p.add(create);
		p.add(disconnect);
		frame.add(p, BorderLayout.NORTH);
		
		JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(300,200));
		frame.add(sp, BorderLayout.CENTER);

	}
	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		if(src == connect) {
			try {
				Class.forName(DB_DRIVER);
				db = DriverManager.getConnection(DB_URL, "root", "12345678");

				output.append("DB 연결 성공\n");
				connect.setEnabled(false);
				create.setEnabled(true);
				disconnect.setEnabled(true);
				
			} catch(ClassNotFoundException ex1) {
				output.append("드라이버 로딩 실패\n");
			} catch(SQLException ex1) {
				output.append("DB 연결 실패\n");
			}
		} else if(src == disconnect) {
			try {
				db.close();
				output.append("DB 닫기 성공\n");
				connect.setEnabled(true);
				create.setEnabled(false);
				disconnect.setEnabled(false);
			} catch(SQLException ex1) {
				output.append("DB 닫기 실패\n");
			}
		} else if(src == create) {
			try {
				String sql = "CREATE TABLE INFO " +
							 "(NUMBER INT NOT NULL PRIMARY KEY, " +
							 "HNAME VARCHAR(20) NOT NULL, " +
							 "TELNO VARCHAR(15) NOT NULL, " +
							 "AGE INT NOT NULL)";

				Statement statement = db.createStatement();
				statement.execute(sql);
				statement.close();
				output.append("INFO 테이블 생성 성공\n");
				create.setEnabled(false);
			} catch(SQLException ex1) {
				output.append("INFO 테이블 생성 실패\n");
			}
		}
	}
	public static void main(String[] args) {
		DBConnect app = new DBConnect();
		app.setSize(400,200);
		app.setVisible(true);
		
	}

}
