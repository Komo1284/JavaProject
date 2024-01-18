import javax.swing.*;
import java.awt.*;

public class SwingJFrame extends JFrame {

	public SwingJFrame() {
		super("Swing JFrame");
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		JButton ok = new JButton("OK");
		ok.setToolTipText("눌러보세요!");
		
		JPanel p = new JPanel();
		p.add(ok);
		
		frame.add(p);
		
	}
	public static void main(String[] args) {
		SwingJFrame app = new SwingJFrame();
		app.setSize(300, 300);
		app.setVisible(true);

	}

}
