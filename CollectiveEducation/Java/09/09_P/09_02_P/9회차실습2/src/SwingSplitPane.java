import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingSplitPane extends JFrame implements ListSelectionListener {

	JTextArea output = new JTextArea();
	JLabel msg = new JLabel("Information", JLabel.CENTER);
	
	
	public SwingSplitPane() {
		super("JSpiltPane");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		String[] data = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" }; 
		JList<String> list = new JList<String>(data);
		list.addListSelectionListener(this);

		JScrollPane sp1 = new JScrollPane(list);
	    JScrollPane sp2 = new JScrollPane(output);

		JSplitPane spane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sp1, sp2);
		spane.setOneTouchExpandable(true);
        spane.setDividerLocation(100);
        
		frame.add(spane,BorderLayout.CENTER);
		frame.add(msg, BorderLayout.SOUTH);
	}
	public void valueChanged(ListSelectionEvent e) {
		JList src = (JList)e.getSource();
		if( !src.getValueIsAdjusting() ) {
			int index = src.getSelectedIndex();
			output.append(index+":"+src.getSelectedValue()+"\n");
			msg.setText(src.getSelectedValue()+" CLICKED!!");
		}
		
	}
	public static void main(String[] args) {
		SwingSplitPane app = new SwingSplitPane();
		app.setSize(300,150);
		app.setVisible(true);

	}

}
