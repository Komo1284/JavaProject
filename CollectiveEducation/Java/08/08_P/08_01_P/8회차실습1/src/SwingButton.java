// 이미지 출처 : 비즈니스 012 by 한국저작권위원회, 공유마당, CC BY
import java.awt.*;
import javax.swing.*;

public class SwingButton extends JFrame {

	public SwingButton() {
		super("JButton");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));

		JButton btn1 = new JButton();
		btn1.setIcon(new ImageIcon("1.png"));
		btn1.setPressedIcon(new ImageIcon("2.png"));
		
		JButton btn2 = new JButton(new ImageIcon("2.png"));
		btn2.setRolloverIcon(new ImageIcon("3.png"));
		
		JButton btn3 = new JButton(new ImageIcon("3.png"));
		btn3.setDisabledIcon(new ImageIcon("4.png"));
		btn3.setEnabled(false);

		JButton btn4 = new JButton(new ImageIcon("1.png"));
		btn4.setPressedIcon(new ImageIcon("2.png"));
		btn4.setRolloverIcon(new ImageIcon("3.png"));
		btn4.setDisabledIcon(new ImageIcon("4.png"));

		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn1);
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn2);
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn3);
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(btn4);
		p1.add(Box.createHorizontalGlue());
		
		JPanel p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
		
		JButton btn5 = new JButton("TRAILING", new ImageIcon("1.png"));

		JButton btn6 = new JButton("LEFT", new ImageIcon("1.png"));
		btn6.setHorizontalTextPosition(SwingConstants.LEFT);
		
		JButton btn7 = new JButton("CENTER",new ImageIcon("2.png"));
		btn7.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btn8 = new JButton("RIGHT",new ImageIcon("3.png"));
		btn8.setHorizontalTextPosition(SwingConstants.RIGHT);

		JButton btn9 = new JButton("LEADING",new ImageIcon("4.png"));
		btn9.setHorizontalTextPosition(SwingConstants.LEADING);

		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(btn5);
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(btn6);
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(btn7);
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(btn8);
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(btn9);
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(Box.createHorizontalGlue());

		JPanel p3 = new JPanel();
		p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));

		JButton btn10 = new JButton("TOP",new ImageIcon("1.png"));
		btn10.setVerticalTextPosition(SwingConstants.TOP);
		
		JButton btn11 = new JButton("CENTER",new ImageIcon("2.png"));
		btn11.setVerticalTextPosition(SwingConstants.CENTER);

		JButton btn12 = new JButton("BOTTOM",new ImageIcon("3.png"));
		btn12.setVerticalTextPosition(SwingConstants.BOTTOM);

		p3.add(Box.createRigidArea(new Dimension(10,0)));
		p3.add(btn10);
		p3.add(Box.createRigidArea(new Dimension(10,0)));
		p3.add(btn11);
		p3.add(Box.createRigidArea(new Dimension(10,0)));
		p3.add(btn12);
		p3.add(Box.createHorizontalGlue());

		frame.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(p1);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(p2);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(p3);
		frame.add(Box.createRigidArea(new Dimension(0,10)));

	}
	public static void main(String[] args) {
		SwingButton app = new SwingButton();
		app.pack();
		app.setVisible(true);

	}

}
