// 이미지 출처 : 비즈니스 012 by 한국저작권위원회, 공유마당, CC BY
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class SwingList extends JFrame implements ListSelectionListener {

	JList<String> list1, list2;
	JList<ImageIcon> list3;

	JTextArea output = new JTextArea();
	
	public SwingList() {
		super("Swing List");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		String[] items1 = {"Seoul", "Busan", "Daejeon", "Asan" };
		list1 = new JList<String>(items1);
		list1.addListSelectionListener(this);
		list1.setVisibleRowCount(3);
		
		list2 = new JList<String>();
		String[] items2 = {"Banana", "Melon", "Strawberry", "Apple" };
		list2.setListData(items2);
		list2.setVisibleRowCount(3);
		list2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list2.addListSelectionListener(this);
		
		Vector<ImageIcon> data = new Vector<ImageIcon>();
		data.add(new ImageIcon("1.png"));
		data.add(new ImageIcon("2.png"));
		data.add(new ImageIcon("3.png"));
		data.add(new ImageIcon("4.png"));
		list3 = new JList<ImageIcon>(data);
		list3.addListSelectionListener(this);
		list3.setVisibleRowCount(1);
		
		JPanel panel = new JPanel();
		panel.add(new JScrollPane(list1));
		panel.add(new JScrollPane(list2));
		panel.add(new JScrollPane(list3));
	    
		frame.add(panel, BorderLayout.NORTH);

	    JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(300,200));
		frame.add(sp, BorderLayout.CENTER);

	}
	public void valueChanged(ListSelectionEvent e) {
		JList src = (JList)e.getSource();

		if( !src.getValueIsAdjusting() ) {
			if( src.getSelectionMode() == ListSelectionModel.MULTIPLE_INTERVAL_SELECTION ) {
				int[] indexs = src.getSelectedIndices();
				java.util.List values = src.getSelectedValuesList();
				for( int i=0; i<indexs.length; i++ )
					output.append(indexs[i]+":"+values.get(i) +"\n");
			} else {
				int index = src.getSelectedIndex();
				output.append(index+":"+src.getSelectedValue()+"\n");
			}
		}
		
	}
	public static void main(String[] args) {
		SwingList app = new SwingList();
		app.pack();
		app.setVisible(true);

	}

}
