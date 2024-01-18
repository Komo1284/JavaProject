import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class DBInsert extends JFrame implements ActionListener {
	
	final static String DB_URL = "jdbc:mariadb://localhost:3306/students";
	final static String DB_DRIVER = "org.mariadb.jdbc.Driver";
	Connection db;
	Statement sql;

	JTextField seq = new JTextField();
	JTextField name = new JTextField();
	JTextField tel = new JTextField();
	JTextField age = new JTextField();
	
	JButton insert = new JButton("INSERT");
	JButton clear = new JButton("CLEAR");
	JButton connect = new JButton("DB Connect");
	JButton disconnect = new JButton("DB Disconnect");

	JTextArea output = new JTextArea();
	
	public DBInsert() {
		super("JDBC-MariaDB INSERT");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		insert.addActionListener(this);
		clear.addActionListener(this);
		connect.addActionListener(this);
		disconnect.addActionListener(this);
		
		connect.setEnabled(true);
		disconnect.setEnabled(false);
		insert.setEnabled(false);
		
		JPanel p1 = new JPanel();
		p1.add(connect);
		p1.add(disconnect);
		p1.add(insert);
		p1.add(clear);
		p1.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		frame.add(p1, BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4,2));
		p2.add(new JLabel("번호",JLabel.RIGHT));
		p2.add(seq);
		p2.add(new JLabel("이름",JLabel.RIGHT));
		p2.add(name);
		p2.add(new JLabel("전화번호",JLabel.RIGHT));
		p2.add(tel);
		p2.add(new JLabel("나이",JLabel.RIGHT));
		p2.add(age);
		p2.setBorder(new EtchedBorder(BevelBorder.LOWERED));

		frame.add(p2, BorderLayout.CENTER);
		
		JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(300,80));
		frame.add(sp, BorderLayout.SOUTH);

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
				insert.setEnabled(true);
				
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
				insert.setEnabled(false);
			} catch(SQLException ex1) {
				output.append("DB 닫기 실패\n");
			}
		} else if(src == insert) {
			try {
				String insertSql = "INSERT INTO INFO VALUES("+
							 seq.getText()+",'"+
							 name.getText()+"','" +
							 tel.getText()+"'," +
							 age.getText()+")";
				sql.executeUpdate(insertSql);
				output.append(seq.getText()+"번 추가 성공\n");
			} catch(SQLException ex1) {
				output.append("추가 실패\n");
			}
		} else if(src == clear) {
			seq.setText("");
			name.setText("");
			tel.setText("");
			age.setText("");
			output.setText("");
		}
	}
	public static void main(String[] args) {
		DBInsert app = new DBInsert();
		app.pack();
		app.setVisible(true);
		
	}

}
