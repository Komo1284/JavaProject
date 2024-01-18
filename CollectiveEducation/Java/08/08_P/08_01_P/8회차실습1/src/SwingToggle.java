// 이미지 출처 : 비즈니스 012 by 한국저작권위원회, 공유마당, CC BY
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingToggle extends JFrame implements ActionListener, ChangeListener  {

	JToggleButton btn1, btn2, btn3;
	JButton btn4, btn5;
	
	public SwingToggle() {
		super("JToggleButton");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));

		btn1 = new JToggleButton("DeSelected", new ImageIcon("1.png"));
		btn1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn1.setHorizontalTextPosition(SwingConstants.CENTER);
		
		btn2 = new JToggleButton("DeSelected", new ImageIcon("1.png"));
		btn2.setSelectedIcon(new ImageIcon("2.png"));
		btn2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn2.setHorizontalTextPosition(SwingConstants.CENTER);

		btn3 = new JToggleButton("Enabled", new ImageIcon("1.png"));
		btn3.setDisabledIcon(new ImageIcon("2.png"));
		btn3.setDisabledSelectedIcon(new ImageIcon("3.png"));
		btn3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn3.setHorizontalTextPosition(SwingConstants.CENTER);
		
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn1);
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn2);
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn3);
		p1.add(Box.createRigidArea(new Dimension(10,0)));

		JPanel p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));

		btn4 = new JButton("Enable");
		btn5 = new JButton("Disable");
		
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(btn4);
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(btn5);
		p2.add(Box.createRigidArea(new Dimension(10,0)));

		frame.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(p1);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(p2);
		frame.add(Box.createRigidArea(new Dimension(0,10)));

		btn1.addChangeListener(this);
		btn2.addChangeListener(this);
		btn3.addChangeListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == btn4 ) { // Enable
			btn3.setEnabled(true);
		} else if( e.getSource() == btn5 ) { // Disable
			btn3.setEnabled(false);
		}
	}
	public void stateChanged(ChangeEvent e) {
		JToggleButton src = (JToggleButton)e.getSource();
		if( src == btn1 || src == btn2 ) {
			if( src.isSelected() ) src.setText("Selected");
			else src.setText("DeSelected");
		} else if( src == btn3 ) {
			if( src.isEnabled() ) src.setText("Enabled");
			else src.setText("Disabled");
		}
	}
	public static void main(String[] args) {
		SwingToggle app = new SwingToggle();
		app.pack();
		app.setVisible(true);

	}

}
