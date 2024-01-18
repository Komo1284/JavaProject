import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class DBTotal extends JFrame implements ActionListener {
	
	final static String DB_URL = "jdbc:mariadb://localhost:3306/students";
	final static String DB_DRIVER = "org.mariadb.jdbc.Driver";
	Connection db;
	Statement sql;

	JTextField seq = new JTextField();
	JTextField name = new JTextField();
	JTextField tel = new JTextField();
	JTextField age = new JTextField();
	
	JButton insert = new JButton("INSERT");
	JButton select = new JButton("SELECT");
	JButton update = new JButton("UPDATE");
	JButton delete = new JButton("DELETE");
	JButton list = new JButton("List All");
	JButton clear = new JButton("CLEAR");
	JButton connect = new JButton("DB Connect");
	JButton disconnect = new JButton("DB Disconnect");

	JTextArea output = new JTextArea();
	
	public DBTotal() {
		super("JDBC-MariaDB TOTAL");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		insert.addActionListener(this);
		select.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);
		list.addActionListener(this);
		clear.addActionListener(this);
		connect.addActionListener(this);
		disconnect.addActionListener(this);
		
		JPanel p1 = new JPanel();
		p1.add(connect);
		p1.add(disconnect);
		p1.add(clear);
		p1.add(list);
		p1.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		frame.add(p1, BorderLayout.NORTH);

		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4,2));
		p2.add(new JLabel("��ȣ",JLabel.RIGHT));
		p2.add(seq);
		p2.add(new JLabel("�̸�",JLabel.RIGHT));
		p2.add(name);
		p2.add(new JLabel("��ȭ��ȣ",JLabel.RIGHT));
		p2.add(tel);
		p2.add(new JLabel("����",JLabel.RIGHT));
		p2.add(age);

		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(4,1));
		p3.add(insert);
		p3.add(select);
		p3.add(update);
		p3.add(delete);

		JPanel p4 = new JPanel();
		p4.setLayout(new BorderLayout());
		p4.add(p2,BorderLayout.CENTER);
		p4.add(p3,BorderLayout.EAST);
		p4.setBorder(new EtchedBorder(BevelBorder.LOWERED));

		frame.add(p4, BorderLayout.CENTER);
		
		JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(300,200));
		frame.add(sp, BorderLayout.SOUTH);

	}
	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		if(src == connect) {
			try {
				Class.forName(DB_DRIVER);
				db = DriverManager.getConnection(DB_URL, "root", "12345678");

				output.append("DB ���� ����\n");
				sql = db.createStatement();
			} catch(ClassNotFoundException ex1) {
				output.append("����̹� �ε� ����\n");
			} catch(SQLException ex1) {
				output.append("DB ���� ����\n");
			}
		} else if(src == disconnect) {
			try {
				sql.close();
				db.close();
				output.append("DB �ݱ� ����\n");
			} catch(SQLException ex1) {
				output.append("DB �ݱ� ����\n");
			}
		} else if(src == insert) {
			try {
				String insertSql = "INSERT INTO INFO VALUES("+
							 seq.getText()+",'"+
							 name.getText()+"','" +
							 tel.getText()+"'," +
							 age.getText()+")";
				sql.executeUpdate(insertSql);
				output.append(seq.getText()+"�� �߰� ����\n");
			} catch(SQLException ex1) {
				output.append("�߰� ����\n");
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
				output.append("�˻� ����\n");
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
				output.append(seq.getText()+"�� ���� ����\n");
			} catch(SQLException ex1) {
				output.append("���� ����\n");
			}
		} else if(src == delete) {
			String deleteSql = "DELETE FROM INFO WHERE NUMBER=?";
			try {
				PreparedStatement pSql = db.prepareStatement(deleteSql);
				pSql.setInt(1, Integer.parseInt(seq.getText()));
				pSql.executeUpdate();
				pSql.close();
				output.append(seq.getText()+"�� ���� ����\n");
			} catch(SQLException ex1) {
				output.append("���� ����\n");
			}
		} else if(src == list) {
			String msg = "";
			output.setText("");
			output.append("��ȣ\t�̸�\t��ȭ��ȣ\t  ����\n");
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
				output.append("�˻� ����\n");
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
		DBTotal app = new DBTotal();
		app.pack();
		app.setVisible(true);
		
	}

}
