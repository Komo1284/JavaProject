import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.util.*;

public class SwingTextArea extends JFrame implements DocumentListener {

	JTextArea ta1, ta2;
	JScrollPane sp1, sp2;
	
	public SwingTextArea() {
		super("Swing TextArea");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		ta1 = new JTextArea("Swing TextArea\n");
		ta2 = new JTextArea();

		ta1.setLineWrap(false); 
		ta2.setLineWrap(true);

		sp1 = new JScrollPane(ta1);
		sp1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

		sp2 = new JScrollPane(ta2);
		sp2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		sp2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		ta1.append("Swing TextArea\n");
		ta1.insert("Java ",6);
		ta1.replaceRange("JAVA", 0, 5);
		try {
			ta1.getDocument().remove(10, 4);
			ta2.append(ta1.getDocument().getText(0, 4)+"\n");
		} catch(Exception e) {
			System.out.println("TextArea Error!");
		}
		ta1.setCaretPosition(ta1.getDocument().getLength());

		ta1.getDocument().addDocumentListener(this);
		
		frame.setLayout(new GridLayout(1,2));
		frame.add(sp1);
		frame.add(sp2);
		
	}
	public void insertUpdate(DocumentEvent e) {
		ta2.append("[INSERT]\n");
		ta2.append("[Lines: "+ ta1.getLineCount()+", ");
		ta2.append("EndPos: "+ta1.getDocument().getEndPosition()+", ");
		ta2.append("Len: "+ta1.getDocument().getLength()+"]\n");
		ta2.setCaretPosition(ta2.getDocument().getLength());
	}
	public void removeUpdate(DocumentEvent e) {
		ta2.append("[REMOVE]\n");
		ta2.append("[Lines: "+ ta1.getLineCount()+", ");
		ta2.append("EndPos: "+ta1.getDocument().getEndPosition()+", ");
		ta2.append("Len: "+ta1.getDocument().getLength()+"]\n");
		ta2.setCaretPosition(ta2.getDocument().getLength());
	}
	public void changedUpdate(DocumentEvent e) {
		// Not Used
	}
	public static void main(String[] args) {
		SwingTextArea app = new SwingTextArea();
		app.setSize(500,300);
		app.setVisible(true);

	}

}
