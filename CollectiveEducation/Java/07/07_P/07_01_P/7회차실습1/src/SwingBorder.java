import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class SwingBorder extends JFrame {

	public SwingBorder() {
		super("Swing Border");
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		JPanel p = new JPanel();
		GridLayout grid = new GridLayout(4,2);
		grid.setHgap(10);
		grid.setVgap(10);
		p.setLayout(grid);

		JPanel p11 = new JPanel();
		p11.setBorder(new BevelBorder(BevelBorder.LOWERED));
		p11.add(new JLabel("BevelBorder.LOWERED"));
		JPanel p12 = new JPanel();
		p12.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0,0,0), new Color(100,100,100)));
		p12.add(new JLabel("BevelBorder.RAISED"));
		
		JPanel p21 = new JPanel();
		p21.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		p21.add(new JLabel("SoftBevelBorder.LOWERED"));
		JPanel p22 = new JPanel();
		p22.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0,0,0), new Color(100,100,100)));
		p22.add(new JLabel("SoftBevelBorder.RAISED"));

		JPanel p31 = new JPanel();
		p31.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		p31.add(new JLabel("EtchedBorder.LOWERED"));
		JPanel p32 = new JPanel();
		p32.setBorder(new EtchedBorder(BevelBorder.RAISED, new Color(125,0,0), new Color(100,100,100)));
		p32.add(new JLabel("EtchedBorder.RAISED"));

		JPanel p41 = new JPanel();
		p41.setBorder(new LineBorder(new Color(0,0,255)));
		p41.add(new JLabel("LineBorder"));
		JPanel p42 = new JPanel();
		p42.setBorder(new LineBorder(new Color(0,0,255), 3, true));
		p42.add(new JLabel("LineBorder"));

		p.add(p11);
		p.add(p12);
		p.add(p21);
		p.add(p22);
		p.add(p31);
		p.add(p32);
		p.add(p41);
		p.add(p42);
		
		frame.add(p);

	}
	public static void main(String[] args) {
		SwingBorder app = new SwingBorder();
		app.setSize(500, 400);
		app.setVisible(true);
		
	}

}
