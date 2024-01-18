import javax.swing.*;
import java.awt.*;

public class LayoutBox extends JFrame {

	public LayoutBox() {
		super("Swing BoxLayout");
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		JPanel p1 = new JPanel();
	    p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
	    
	    p1.add( new JButton("One") );
	    p1.add(Box.createRigidArea(new Dimension(10,0)));
	    p1.add( new JButton("Two") );
	    p1.add(Box.createRigidArea(new Dimension(10,0)));
	    p1.add( new JButton("Three") );
	    p1.add(Box.createRigidArea(new Dimension(10,0)));
	    p1.add( new JButton("Four") );
	    p1.add(Box.createRigidArea(new Dimension(10,0)));
	    p1.add( new JButton("Five") );
	    
		JPanel p2 = new JPanel();
	    p2.setLayout(new BoxLayout(p2, BoxLayout.LINE_AXIS));
	    p2.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

	    p2.add( new JButton("One") );
	    p2.add(Box.createRigidArea(new Dimension(10,0)));
	    p2.add( new JButton("Two") );
	    p2.add(Box.createRigidArea(new Dimension(10,0)));
	    p2.add( new JButton("Three") );
	    p2.add(Box.createRigidArea(new Dimension(10,0)));
	    p2.add( new JButton("Four") );
	    p2.add(Box.createRigidArea(new Dimension(10,0)));
	    p2.add( new JButton("Five") );

		JPanel p3 = new JPanel();
	    p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
	    
	    p3.add(Box.createRigidArea(new Dimension(10,0)));
	    p3.add( new JButton("One") );
	    p3.add(Box.createRigidArea(new Dimension(10,0)));
	    p3.add( new JButton("Two") );
	    p3.add(Box.createRigidArea(new Dimension(10,0)));
	    p3.add( new JButton("Three") );
	    p3.add(Box.createRigidArea(new Dimension(10,0)));
	    p3.add( new JButton("Four") );
	    p3.add(Box.createHorizontalGlue());
	    p3.add( new JButton("Five") );
	    p3.add(Box.createRigidArea(new Dimension(10,0)));

	    frame.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));

	    frame.add(Box.createRigidArea(new Dimension(0,10)));
	    frame.add(p1);
	    frame.add(Box.createRigidArea(new Dimension(0,10)));
	    frame.add(p2);
	    frame.add(Box.createVerticalGlue());
	    frame.add(p3);
	    frame.add(Box.createRigidArea(new Dimension(0,10)));
		
	}
	public static void main(String[] args) {
		LayoutBox app = new LayoutBox();
		app.setSize(500, 300);
		app.setVisible(true);

	}

}
