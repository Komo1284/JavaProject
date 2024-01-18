import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class LayoutTotal extends JFrame {

	public LayoutTotal() {
		super("Swing");
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		JPanel p1 = new JPanel();
		EtchedBorder eb = new EtchedBorder(BevelBorder.LOWERED);
		p1.setBorder(new TitledBorder(eb, "First"));
		
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
	    p1.add(Box.createVerticalGlue());
	    addButton("One",p1);
	    p1.add(Box.createRigidArea(new Dimension(0,10)));
	    addButton("Two",p1);
	    p1.add(Box.createRigidArea(new Dimension(0,10)));
	    addButton("Three",p1);
	    p1.add(Box.createVerticalGlue());
	    
		JPanel p2 = new JPanel();
		p2.setBorder(new TitledBorder(eb, "Second"));
		
	    p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
	    p2.add(Box.createVerticalGlue());
	    addButton("One",p2);
	    p2.add(Box.createRigidArea(new Dimension(0,10)));
	    addButton("Two",p2);
	    p2.add(Box.createRigidArea(new Dimension(0,10)));
	    addButton("Three",p2);
	    p2.add(Box.createVerticalGlue());

	    frame.setLayout(new BoxLayout(frame, BoxLayout.X_AXIS));
	    
	    frame.add(Box.createHorizontalGlue());
	    frame.add(p1);
	    frame.add(Box.createRigidArea(new Dimension(10,0)));
	    frame.add(p2);
	    frame.add(Box.createHorizontalGlue());
		
	}
	public void addButton(String text, JPanel panel) {
		JButton add = new JButton(text);
		add.setMaximumSize(new Dimension(80,30));
		panel.add(add);
	}
	public static void main(String[] args) {
		LayoutTotal app = new LayoutTotal();
		app.setSize(250, 200);
		app.setVisible(true);
	}

}
