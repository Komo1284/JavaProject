// 이미지 출처 : 비즈니스 012 by 한국저작권위원회, 공유마당, CC BY
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class SwingToolBar extends JFrame implements ActionListener, ItemListener {

	JToolBar bar;
	JComboBox city;

	JTextArea output = new JTextArea();
	
	public SwingToolBar() {
		super("JToolBar");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		String[] data = { "Seoul", "Pusan", "Daegu", "Daejeon" }; 
		city = new JComboBox(data);
		city.addItemListener(this);
		
		JButton btn1 = new JButton(new ImageIcon("1.png"));
		JButton btn2 = new JButton(new ImageIcon("2.png"));
		JButton btn3 = new JButton(new ImageIcon("3.png"));
		JButton btn4 = new JButton(new ImageIcon("4.png"));
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn1.setActionCommand("Open");
		btn2.setActionCommand("Close");
		btn3.setActionCommand("Save");
		btn4.setActionCommand("Exit");
		
		bar = new JToolBar(JToolBar.HORIZONTAL);
		bar.add(btn1);
		bar.add(btn2);
		bar.add(btn3);
		bar.add(btn4);
		bar.add(new JSeparator());
		bar.add(city);
		
		//bar.setFloatable(false);

		frame.add(bar,BorderLayout.PAGE_START);
		//frame.add(bar,BorderLayout.PAGE_END);
		
	    JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(320,200));
		frame.add(sp, BorderLayout.CENTER);

	}
	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		output.append("Event : "+src.getActionCommand()+"\n");
	}
	public void itemStateChanged(ItemEvent e) {
		if( e.getStateChange() == ItemEvent.SELECTED) {
			JComboBox src = (JComboBox)e.getSource();
			output.append("Select : "+src.getSelectedItem()+"\n");
		}
	}
	public static void main(String[] args) {
		SwingToolBar app = new SwingToolBar();
		app.pack();
		app.setVisible(true);

	}

}
