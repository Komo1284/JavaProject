import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

public class DBList extends JPanel {
	
	Connection db;
	JTable table;

	public DBList(Connection db) {
		this.db = db;
		setLayout(new BorderLayout());
		
		MyTableModel mtm = new MyTableModel(this);
		table = new JTable(mtm);
		add(new JScrollPane(table), BorderLayout.CENTER);

	}
	public class MyTableModel extends AbstractTableModel {
		JPanel parent;
		Vector<ArrayList<String>> data = new Vector<ArrayList<String>>();
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
			return false;
		}
	}

}
