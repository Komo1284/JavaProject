import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class SwingLAF extends JFrame {

	public SwingLAF() {
		super("Swing Look&Feel");
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		JPanel p = new JPanel();
		p.add(new JButton("OK"));
		p.add(new JCheckBox("Checkbox"));
		p.add(new JRadioButton("RadioButton"));
		p.add(new JSlider(JSlider.HORIZONTAL, 0, 100, 50));
		
		frame.add(p);

		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			//UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
			validate();
			repaint();
		} catch( Exception  e ) {
			System.out.println("Exception Look&Feel");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SwingLAF app = new SwingLAF();
		app.setSize(300, 150);
		app.setVisible(true);
		
	}

}
