import javax.swing.*;
import java.awt.*;

public class LayoutOverlay extends JFrame {

	public LayoutOverlay() {
		super("Swing OverlayLayout");
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		JPanel panel = new JPanel();

	    panel.setLayout(new OverlayLayout(panel));

	    JButton button = new JButton("ONE");
	    button.setMaximumSize(new Dimension(100, 100));
	    button.setAlignmentX(0.0f);
	    button.setAlignmentY(0.0f);    
	    panel.add(button);
	    
	    button = new JButton("TWO");
	    button.setMaximumSize(new Dimension(100, 100));
	    button.setAlignmentX(0.5f);
	    button.setAlignmentY(0.5f);
	    panel.add(button);
	    
	    button = new JButton("THREE");
	    button.setMaximumSize(new Dimension(100, 100));
	    button.setAlignmentX(1.0f);
	    button.setAlignmentY(1.0f);
	    panel.add(button); 
	    
		frame.add(panel);
		
	}
	public static void main(String[] args) {
		LayoutOverlay app = new LayoutOverlay();
		app.setSize(300, 300);
		app.setVisible(true);

	}

}
