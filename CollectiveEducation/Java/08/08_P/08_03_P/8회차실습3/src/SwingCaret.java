import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingCaret extends JFrame implements CaretListener {

	JTextField input1 = new JTextField("Swing JTextField");
	JTextField input2 = new JTextField("Swing JTextField");
	JTextArea output = new JTextArea();
	
	public SwingCaret() {
		super("Swing Caret");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		input1.addCaretListener(this);
		
		try {
			output.append("Get : "+input1.getText(6, 5)+"\n");
		} catch( Exception e ) {
			System.out.println("getText() Error!!");
		}
		input1.select(0, 5);
		
		input2.setCaretPosition(input2.getText().length());

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,2));
		panel.add(input1);
		panel.add(input2);
		frame.add(panel, BorderLayout.NORTH);
		frame.add(output, BorderLayout.CENTER);
	}
	public void caretUpdate(CaretEvent e) {
		output.append("Position : "+input1.getCaretPosition()+"\n");
		output.append("Selected : "+input1.getSelectedText()+"\n");
		input2.setCaretPosition(input2.getText().length());
	}
	public static void main(String[] args) {
		SwingCaret app = new SwingCaret();
		app.setSize(300,350);
		app.setVisible(true);

	}

}
