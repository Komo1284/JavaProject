// 이미지 출처 : 비즈니스 012 by 한국저작권위원회, 공유마당, CC BY
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingRadio extends JFrame implements ActionListener {

	JRadioButton btn1, btn2, btn3, btn4, btn5, btn6;
	
	public SwingRadio() {
		super("JRadioButton");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));

		btn1 = new JRadioButton("Apple");
		btn2 = new JRadioButton("Banana");
		btn3 = new JRadioButton("Melon");

		ButtonGroup gb1 = new ButtonGroup();
		gb1.add(btn1);
		gb1.add(btn2);
		gb1.add(btn3);
		
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn1);
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn2);
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn3);
		p1.add(Box.createRigidArea(new Dimension(10,0)));

		JPanel p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));

		btn4 = new JRadioButton("red", new ImageIcon("1.png"));
		btn5 = new JRadioButton("green", new ImageIcon("2.png"));
		btn6 = new JRadioButton("blue", new ImageIcon("3.png"));

		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(btn4);
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(btn5);
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(btn6);
		p2.add(Box.createRigidArea(new Dimension(10,0)));

		frame.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(p1);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(p2);
		frame.add(Box.createRigidArea(new Dimension(0,10)));

		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == btn4 ) {
			btn4.setText(btn4.getText().toUpperCase());
			btn5.setText(btn5.getText().toLowerCase());
			btn6.setText(btn4.getText().toLowerCase());
		} else if( e.getSource() == btn5 ) { 
			btn4.setText(btn4.getText().toLowerCase());
			btn5.setText(btn5.getText().toUpperCase());
			btn6.setText(btn4.getText().toLowerCase());
		} else if( e.getSource() == btn6 ) { 
			btn4.setText(btn4.getText().toLowerCase());
			btn5.setText(btn5.getText().toLowerCase());
			btn6.setText(btn4.getText().toUpperCase());
		}
	}
	public static void main(String[] args) {
		SwingRadio app = new SwingRadio();
		app.pack();
		app.setVisible(true);

	}

}
