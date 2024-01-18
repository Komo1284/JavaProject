import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class DBSelect extends JFrame implements ActionListener {
	
	final static String DB_URL = "jdbc:mariadb://localhost:3306/students";
	final static String DB_DRIVER = "org.mariadb.jdbc.Driver";
	Connection db;
	Statement sql;

	JButton select = new JButton("SELECT");
	JButton clear = new JButton("CLEAR");
	JButton connect = new JButton("DB Connect");
	JButton disconnect = new JButton("DB Disconnect");

	JTextArea output = new JTextArea();
	
	public DBSelect() {
		super("JDBC-MariaDB SELECT");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		select.addActionListener(this);
		clear.addActionListener(this);
		connect.addActionListener(this);
		disconnect.addActionListener(this);
		
		connect.setEnabled(true);
		disconnect.setEnabled(false);
		select.setEnabled(false);
		
		JPanel p1 = new JPanel();
		p1.add(connect);
		p1.add(disconnect);
		p1.add(select);
		p1.add(clear);
		p1.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		frame.add(p1, BorderLayout.NORTH);
		
		JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(300,300));
		frame.add(sp, BorderLayout.CENTER);

	}
	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		if(src == connect) {
			try {
				Class.forName(DB_DRIVER);
				db = DriverManager.getConnection(DB_URL, "root", "12345678");

				output.append("DB 연결 성공\n");
				sql = db.createStatement();
				
				connect.setEnabled(false);
				disconnect.setEnabled(true);
				select.setEnabled(true);
				
			} catch(ClassNotFoundException ex1) {
				output.append("드라이버 로딩 실패\n");
			} catch(SQLException ex1) {
				output.append("DB 연결 실패\n");
			}
		} else if(src == disconnect) {
			try {
				sql.close();
				db.close();
				output.append("DB 닫기 성공\n");

				connect.setEnabled(true);
				disconnect.setEnabled(false);
				select.setEnabled(false);
			} catch(SQLException ex1) {
				output.append("DB 닫기 실패\n");
			}
		} else if(src == select) {
			String msg = "";
			output.append("번호\t이름\t전화번호\t  나이\n");
			try {
				String selectSql = "SELECT * FROM INFO";
				ResultSet rs = sql.executeQuery(selectSql);
				while(rs.next()) {
					msg = rs.getInt("NUMBER")+"\t";
					msg += rs.getString("HNAME")+"\t";
					msg += rs.getString("TELNO")+"\t  ";
					msg += rs.getInt("AGE")+"\n";
					output.append(msg);
				}
			} catch(SQLException ex1) {
				output.append("검색 실패\n");
			}
		} else if(src == clear) {
			output.setText("");
		}
	}
	public static void main(String[] args) {
		DBSelect app = new DBSelect();
		app.pack();
		app.setVisible(true);
		
	}

}
