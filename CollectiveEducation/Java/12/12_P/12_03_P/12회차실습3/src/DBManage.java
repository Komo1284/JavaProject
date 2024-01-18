import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class DBManage extends JPanel implements ActionListener {
	
	Connection db;

	JTextField seq = new JTextField();
	JTextField name = new JTextField();
	JTextField tel = new JTextField();
	JTextField age = new JTextField();
	
	JTextField search_seq = new JTextField(5);
	JTextField search_name = new JTextField(10);
	JButton select = new JButton("검색");
	JButton update = new JButton("수정");
	JButton delete = new JButton("삭제");
	
	public DBManage(Connection db) {
		this.db = db;
		setLayout(new BorderLayout());
		
		select.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);
		search_name.addActionListener(this);
		search_seq.addActionListener(this);
		seq.setEditable(false);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,2));
		p1.add(new JLabel("번호",JLabel.RIGHT));
		p1.add(seq);
		p1.add(new JLabel("이름",JLabel.RIGHT));
		p1.add(name);
		p1.add(new JLabel("전화번호",JLabel.RIGHT));
		p1.add(tel);
		p1.add(new JLabel("나이",JLabel.RIGHT));
		p1.add(age);
		p1.setBorder(new EtchedBorder(BevelBorder.LOWERED));

		add(p1, BorderLayout.CENTER);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2,BoxLayout.X_AXIS));
		p2.add(new JLabel("번호"));
		p2.add(search_seq);
		p2.add(new JLabel("이름"));
		p2.add(search_name);
		p2.add(select);
		p2.add(update);
		p2.add(delete);
		p2.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		add(p2, BorderLayout.NORTH);

	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src==select || src == search_name || src == search_seq ) {
			try {
				String selectSql = "SELECT * FROM INFO WHERE NUMBER=? OR HNAME=?";
				PreparedStatement pSql = db.prepareStatement(selectSql);
				pSql.setString(1, search_seq.getText());
				pSql.setString(2, search_name.getText());

				ResultSet rs = pSql.executeQuery();
				rs.next();
				seq.setText(Integer.toString(rs.getInt("NUMBER")));
				name.setText(rs.getString("HNAME"));
				tel.setText(rs.getString("TELNO"));
				age.setText(Integer.toString(rs.getInt("AGE")));
				pSql.close();
			} catch(SQLException ex1) {
				JOptionPane.showMessageDialog(this, "검색 실패!", "실패", JOptionPane.ERROR_MESSAGE);
				clearField();
			}
		} else if(src == update) {
			String updateSql = "UPDATE INFO SET HNAME=?,TELNO=?,AGE=? WHERE NUMBER=?";
			if(seq.getText().equals("")) return;
			try {
				PreparedStatement pSql = db.prepareStatement(updateSql);
				pSql.setString(1, name.getText());
				pSql.setString(2, tel.getText());
				pSql.setString(3, age.getText());
				pSql.setString(4, seq.getText());
				pSql.executeUpdate();
				pSql.close();
				JOptionPane.showMessageDialog(this, "수정 하였습니다!", "성공", JOptionPane.INFORMATION_MESSAGE);
			} catch(SQLException ex1) {
				JOptionPane.showMessageDialog(this, "수정 실패!", "실패", JOptionPane.ERROR_MESSAGE);
			}
		} else if(src == delete) {
			String deleteSql = "DELETE FROM INFO WHERE NUMBER=?";
			if(seq.getText().equals("")) return;
			try {
				PreparedStatement pSql = db.prepareStatement(deleteSql);
				pSql.setString(1, seq.getText());
				pSql.executeUpdate();
				pSql.close();
				JOptionPane.showMessageDialog(this, "삭제 하였습니다!", "성공", JOptionPane.INFORMATION_MESSAGE);
				clearField();
			} catch(SQLException ex1) {
				JOptionPane.showMessageDialog(this, "삭제 실패!", "실패", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public void clearField() {
		seq.setText("");
		name.setText("");
		tel.setText("");
		age.setText("");
	}
}
