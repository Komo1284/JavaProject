import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class DBInsert extends JPanel implements ActionListener {
	
	Connection db;

	JTextField seq = new JTextField();
	JTextField name = new JTextField();
	JTextField tel = new JTextField();
	JTextField age = new JTextField();
	
	JButton insert = new JButton("INSERT");
	JButton clear = new JButton("CLEAR");
	
	public DBInsert(Connection db) {
		this.db = db;
		setLayout(new BorderLayout());
		
		insert.addActionListener(this);
		clear.addActionListener(this);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,2));
		p1.add(new JLabel("��ȣ",JLabel.RIGHT));
		p1.add(seq);
		p1.add(new JLabel("�̸�",JLabel.RIGHT));
		p1.add(name);
		p1.add(new JLabel("��ȭ��ȣ",JLabel.RIGHT));
		p1.add(tel);
		p1.add(new JLabel("����",JLabel.RIGHT));
		p1.add(age);
		p1.setBorder(new EtchedBorder(BevelBorder.LOWERED));

		add(p1, BorderLayout.CENTER);
		
		JPanel p2 = new JPanel();
		p2.add(insert);
		p2.add(clear);
		p2.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		add(p2, BorderLayout.NORTH);

	}
	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		if(src == insert) {
			try {
				String insertSql = "INSERT INTO INFO VALUES(?,?,?,?)";
				PreparedStatement pSql = db.prepareStatement(insertSql);
				pSql.setString(1, seq.getText());
				pSql.setString(2, name.getText());
				pSql.setString(3, tel.getText());
				pSql.setString(4, age.getText());
				pSql.executeUpdate();
				JOptionPane.showMessageDialog(this, "��� �Ͽ����ϴ�!", "����", JOptionPane.INFORMATION_MESSAGE);
			} catch(SQLException ex1) {
				JOptionPane.showMessageDialog(this, "��� ����!", "����", JOptionPane.ERROR_MESSAGE);
			}
		} else if(src == clear) {
			seq.setText("");
			name.setText("");
			tel.setText("");
			age.setText("");
		}
	}
}
