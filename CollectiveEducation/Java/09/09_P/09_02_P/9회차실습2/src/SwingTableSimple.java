// 이미지 출처 : 비즈니스 012 by 한국저작권위원회, 공유마당, CC BY
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.TableModel;

public class SwingTableSimple extends JFrame implements TableModelListener {

	String[] colName = { "Seq", "Name", "Author", "Year", "Price" };
	Object[][] data = { { 1, "English",    "Park", 2010, 12000 },
			            { 2, "Mathmatics", "Kim",  2020, 15000 },
			            { 3, "Society",    "Lee",  2015, 8000 },
			            { 4, "Science",    "Kang", 2021, 2000 },
			            { 5, "Engineering","Shon", 2019, 6000 } };
	
	JTable table;
	JTextArea output = new JTextArea();
	
	public SwingTableSimple() {
		super("JTable - Simple");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		table = new JTable(data, colName);
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
		output.append("["+row+","+col+"] : "+value+":"+e.getLastRow()+"\n");
		
	}
	public static void main(String[] args) {
		SwingTableSimple app = new SwingTableSimple();
		app.setSize(400,250);
		app.setVisible(true);

	}

}
