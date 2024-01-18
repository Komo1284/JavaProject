// 이미지 출처 : 비즈니스 012 by 한국저작권위원회, 공유마당, CC BY
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

public class SwingComboBox extends JFrame implements ItemListener {

	JComboBox<String> combo1, combo2;
	JComboBox<ImageIcon> combo3;

	JTextArea output = new JTextArea();
	
	public SwingComboBox() {
		super("Swing ComboBox");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		combo1 = new JComboBox<String>();
		combo1.addItem("Banana");
		combo1.addItem("Melon");
		combo1.addItem("Strawberry");
		combo1.addItem("Apple");
		combo1.addItemListener(this);

		String[] items = {"Seoul", "Busan", "Daejeon", "Asan" };
		combo2 = new JComboBox<String>(items);
		combo2.addItemListener(this);

		Vector<ImageIcon> data = new Vector<ImageIcon>();
		data.add(new ImageIcon("1.png"));
		data.add(new ImageIcon("2.png"));
		data.add(new ImageIcon("3.png"));
		data.add(new ImageIcon("4.png"));
		combo3 = new JComboBox<ImageIcon>(data);
		combo3.addItemListener(this);
		
		JPanel panel = new JPanel();
		panel.add(combo1);
		panel.add(combo2);
		panel.add(combo3);
	    
		frame.add(panel, BorderLayout.NORTH);

	    JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(300,200));
		frame.add(sp, BorderLayout.CENTER);

	}
	public void itemStateChanged(ItemEvent e) {
		if( e.getStateChange() == ItemEvent.SELECTED) {
			JComboBox src = (JComboBox)e.getSource();
			int index = src.getSelectedIndex();
			output.append(index+":"+src.getItemAt(index)+"\n");
		}
	}
	public static void main(String[] args) {
		SwingComboBox app = new SwingComboBox();
		app.pack();
		app.setVisible(true);

	}

}
