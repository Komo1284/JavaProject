import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class DBUpdate extends JFrame implements ActionListener {
	
	final static String DB_URL = "jdbc:mariadb://localhost:3306/students";
	final static String DB_DRIVER = "org.mariadb.jdbc.Driver";
	Connection db;
	Statement sql;

	JTextField seq = new JTextField();
	JTextField name = new JTextField();
	JTextField tel = new JTextField();
	JTextField age = new JTextField();
	
	JButton select = new JButton("SELECT");
	JButton update = new JButton("UPDATE");
	JButton clear = new JButton("CLEAR");
	JButton connect = new JButton("DB Connect");
	JButton disconnect = new JButton("DB Disconnect");

	JTextArea output = new JTextArea();
	
	public DBUpdate() {
		super("JDBC-MariaDB UPDATE");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		select.addActionListener(this);
		update.addActionListener(this);
		clear.addActionListener(this);
		connect.addActionListener(this);
		disconnect.addActionListener(this);
		
		connect.setEnabled(true);
		disconnect.setEnabled(false);
		select.setEnabled(false);
		update.setEnabled(false);
		
		JPanel p1 = new JPanel();
		p1.add(connect);
		p1.add(disconnect);
		p1.add(select);
		p1.add(update);
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
				select.setEnabled(true);
				update.setEnabled(true);
				
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
				update.setEnabled(false);
			} catch(SQLException ex1) {
				output.append("DB 닫기 실패\n");
			}
		} else if(src == select) {
			String selectSql = "SELECT * FROM INFO WHERE NUMBER=?";
			try {
				PreparedStatement pSql = db.prepareStatement(selectSql);
				pSql.setString(1, seq.getText());
				ResultSet rs = pSql.executeQuery();
				rs.next();
				name.setText(rs.getString("HNAME"));
				tel.setText(rs.getString("TELNO"));
				age.setText(Integer.toString(rs.getInt("AGE")));
				pSql.close();
			} catch(SQLException ex1) {
				output.append("검색 실패\n");
			}
		} else if(src == update) {
			String updateSql = "UPDATE INFO SET HNAME=?,TELNO=?,AGE=? WHERE NUMBER=?";
			try {
				PreparedStatement pSql = db.prepareStatement(updateSql);
				pSql.setString(1, name.getText());
				pSql.setString(2, tel.getText());
				pSql.setInt(3, Integer.parseInt(age.getText()));
				pSql.setInt(4, Integer.parseInt(seq.getText()));
				pSql.executeUpdate();
				pSql.close();
				output.append(seq.getText()+"번 수정 성공\n");
			} catch(SQLException ex1) {
				output.append("수정 실패\n");
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
		DBUpdate app = new DBUpdate();
		app.pack();
		app.setVisible(true);
		
	}

}
