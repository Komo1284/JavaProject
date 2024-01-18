// 이미지 출처 : 비즈니스 012 by 한국저작권위원회, 공유마당, CC BY
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SwingCheckBox extends JFrame implements ItemListener {

	JCheckBox btn1, btn2, btn3, btn4, btn5, btn6;
	
	public SwingCheckBox() {
		super("JCheckBox");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));

		btn1 = new JCheckBox("Apple");
		btn2 = new JCheckBox("Banana");
		btn3 = new JCheckBox("Melon");

		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn1);
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn2);
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn3);
		p1.add(Box.createRigidArea(new Dimension(10,0)));

		JPanel p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));

		btn4 = new JCheckBox("red", new ImageIcon("1.png"));
		btn5 = new JCheckBox("green", new ImageIcon("2.png"));
		btn6 = new JCheckBox("blue", new ImageIcon("3.png"));

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

		btn4.addItemListener(this);
		btn5.addItemListener(this);
		btn6.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e) {
		JCheckBox src = (JCheckBox)e.getSource();

		if ( e.getStateChange() == ItemEvent.SELECTED ) {
			src.setText(src.getText().toUpperCase());
		} else if( e.getStateChange() == ItemEvent.DESELECTED ) {
			src.setText(src.getText().toLowerCase());
		}
	}
	public static void main(String[] args) {
		SwingCheckBox app = new SwingCheckBox();
		app.pack();
		app.setVisible(true);

	}

}
