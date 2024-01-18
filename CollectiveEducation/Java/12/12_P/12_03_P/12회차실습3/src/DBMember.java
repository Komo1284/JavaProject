/* �����۾� �ʿ� : �����ͺ��̽� ���� �� ���̺� ����
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
		super("ȸ�� ���� ���α׷�");
		Container frame = getContentPane();
		
		try {
			Class.forName(DB_DRIVER);
			db = DriverManager.getConnection(DB_URL, "root", "12345678");
		} catch(ClassNotFoundException ex1) {
			this.setTitle("����̹� �ε� ����\n");
		} catch(SQLException ex1) {
			this.setTitle("DB ���� ����\n");
		}

		DBInsert insert = new DBInsert(db);
		DBManage manage = new DBManage(db);
		
		JTabbedPane tpane = new JTabbedPane();
		tpane.addTab("ȸ�� ���", insert);
		tpane.addTab("ȸ�� ����", manage);
		tpane.addTab("ȸ�� ���", new JPanel());
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
		if(src.getSelectedIndex() == 2) { // ȸ�� ���
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
