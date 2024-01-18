import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class SwingTabbedPane extends JFrame implements ChangeListener {

	JTextArea output = new JTextArea();
	JLabel msg = new JLabel("Information", JLabel.CENTER);
	
	public SwingTabbedPane() {
		super("JTabbedPane");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		JPanel p1 = new JPanel();
		p1.add(new JLabel("First Panel", JLabel.CENTER));
		JPanel p2 = new JPanel();
		p2.add(new JLabel("Second Panel", JLabel.CENTER));
		JPanel p3 = new JPanel();
		p3.add(new JLabel("Third Panel", JLabel.CENTER));
		
		JTabbedPane tpane = new JTabbedPane();
		//JTabbedPane tpane = new JTabbedPane(JTabbedPane.TOP);
		//JTabbedPane tpane = new JTabbedPane(JTabbedPane.BOTTOM);
		//JTabbedPane tpane = new JTabbedPane(JTabbedPane.LEFT);
		//JTabbedPane tpane = new JTabbedPane(JTabbedPane.RIGHT);
		tpane.addTab("One", p1);
		tpane.addTab("Two", p2);
		tpane.addTab("Three", p3);
		tpane.addChangeListener(this);
		
		frame.add(tpane,BorderLayout.CENTER);
		frame.add(msg, BorderLayout.SOUTH);
	}
	public void stateChanged(ChangeEvent e) {
		JTabbedPane src = (JTabbedPane)e.getSource();
		int index = src.getSelectedIndex();
		String title = src.getTitleAt(index);
		msg.setText("SELECTED! "+ index + " : "+ title);
	}
	public static void main(String[] args) {
		SwingTabbedPane app = new SwingTabbedPane();
		app.setSize(300,300);
		app.setVisible(true);

	}

}
