import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.*;

public class DBList extends JPanel implements ActionListener {
	
	Connection db;
	JTable table;
	JButton save = new JButton("저장");
	Vector<ArrayList<String>> data = new Vector<ArrayList<String>>();
	
	public DBList(Connection db) {
		this.db = db;
		setLayout(new BorderLayout());
		
		save.addActionListener(this);
		JPanel p = new JPanel();
		p.add(save);
		add(p, BorderLayout.NORTH);
		
		MyTableModel mtm = new MyTableModel(this);
		table = new JTable(mtm);
		add(new JScrollPane(table), BorderLayout.CENTER);

	}
	public class MyTableModel extends AbstractTableModel {
		JPanel parent;
		String[] colName = { "번호", "이름", "전화번호", "나이" };

		public MyTableModel(JPanel parent) {
			this.parent = parent;
			ArrayList<String> record;
			try {
				String selectSql = "SELECT * FROM INFO";
				Statement sql = db.createStatement();
				ResultSet rs = sql.executeQuery(selectSql);
				while(rs.next()) {
					record = new ArrayList<String>();
					record.add(rs.getString("NUMBER"));
					record.add(rs.getString("HNAME"));
					record.add(rs.getString("TELNO"));
					record.add(rs.getString("AGE"));
					data.add(record);
				}
			} catch(SQLException ex1) {
				JOptionPane.showMessageDialog(parent, "검색 실패!", "실패", JOptionPane.ERROR_MESSAGE);
			}
		}
		public int getRowCount() {
			return data.size();
		}
		public int getColumnCount() {
			return colName.length;
		}
		public Object getValueAt(int row, int column) {
			ArrayList<String> read = (ArrayList<String>)data.get(row);
			return read.get(column); 
		}
		public String getColumnName(int column) {
			return colName[column];
		}
		public boolean isCellEditable(int row, int col) {
			if( col == 0 ) return false;
			else return true;
		}
		public void setValueAt(Object value, int row, int col) {
			ArrayList<String> read = (ArrayList<String>)data.get(row);
			read.set(col, value.toString());
			fireTableCellUpdated(row, col);
		}
	}
	public void actionPerformed(ActionEvent e) {
		for( ArrayList<String> value : data) {
			try {
				String updateSql = "UPDATE INFO SET HNAME=?,TELNO=?,AGE=? WHERE NUMBER=?";
				PreparedStatement pSql = db.prepareStatement(updateSql);
				pSql.setString(1, value.get(1));
				pSql.setString(2, value.get(2));
				pSql.setString(3, value.get(3));
				pSql.setString(4, value.get(0));
				pSql.executeUpdate();
				pSql.close();
			} catch(SQLException ex1) {
				JOptionPane.showMessageDialog(this, "저장 실패!", "실패", JOptionPane.ERROR_MESSAGE);
			}
		}
		JOptionPane.showMessageDialog(this, "모두 저장 하였습니다!", "성공", JOptionPane.INFORMATION_MESSAGE);
	}
}
