import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class SwingTableModel extends JFrame implements TableModelListener {

	JTable table;
	JTextArea output = new JTextArea();
	
	public SwingTableModel() {
		super("JTable - Simple");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		MyTableModel mtm = new MyTableModel();
		table = new JTable(mtm);
		table.getModel().addTableModelListener(this);
		
		output.setPreferredSize(new Dimension(400,200));
		frame.setLayout(new BoxLayout(frame,BoxLayout.Y_AXIS));
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(new JScrollPane(table), BorderLayout.CENTER);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(new JScrollPane(output), BorderLayout.SOUTH);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
			
	}
	public void tableChanged(TableModelEvent e) {
		TableModel model = (TableModel)e.getSource();
		int row = e.getFirstRow();
		int col = e.getColumn();
		String value = (String)model.getValueAt(row, col);
		output.append("["+row+","+col+"] : "+value+"\n");
	}
	
	public class MyTableModel extends AbstractTableModel {
		String[] colName = { "Seq", "Title", "Author", "Year", "Price" };
		Object[][] data = { { 1, "English",    "Park", 2010, 12000 },
				            { 2, "Mathmatics", "Kim",  2020, 15000 },
				            { 3, "Society",    "Lee",  2015, 8000 },
				            { 4, "Science",    "Kang", 2021, 2000 },
				            { 5, "Engineering","Shon", 2019, 6000 } };
		public int getRowCount() {
			return data.length;
		}
		public int getColumnCount() {
			return colName.length;
		}
		public Object getValueAt(int row, int column) {
			return data[row][column];
		}
		public String getColumnName(int column) {
			return colName[column];
		}
		public boolean isCellEditable(int row, int col) {
			if( col == 0 ) return false;
			else return true;
		}
		public void setValueAt(Object value, int row, int col) {
			data[row][col] = value;
			fireTableCellUpdated(row, col);
		}
	}
	public static void main(String[] args) {
		SwingTableModel app = new SwingTableModel();
		app.setSize(400,250);
		app.setVisible(true);
	}

}
