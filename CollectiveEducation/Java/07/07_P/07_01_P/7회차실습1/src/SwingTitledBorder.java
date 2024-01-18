import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class SwingTitledBorder extends JFrame {

	public SwingTitledBorder() {
		super("Swing TitledBorder");
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		JPanel p = new JPanel();
		GridLayout grid = new GridLayout(6,3);
		grid.setHgap(10);
		grid.setVgap(10);
		p.setLayout(grid);

		EtchedBorder line = new EtchedBorder(BevelBorder.LOWERED);
		
		JPanel p11 = new JPanel();
		p11.setBorder(new TitledBorder("Test"));
		JPanel p12 = new JPanel();
		p12.setBorder(new TitledBorder(line, "Test", TitledBorder.CENTER, TitledBorder.TOP));
		JPanel p13 = new JPanel();
		p13.setBorder(new TitledBorder(line, "Test", TitledBorder.RIGHT, TitledBorder.TOP));
		
		JPanel p21 = new JPanel();
		p21.setBorder(new TitledBorder(line, "Test", TitledBorder.LEFT, TitledBorder.BOTTOM));
		JPanel p22 = new JPanel();
		p22.setBorder(new TitledBorder(line, "Test", TitledBorder.CENTER, TitledBorder.BOTTOM));
		JPanel p23 = new JPanel();
		p23.setBorder(new TitledBorder(line, "Test", TitledBorder.RIGHT, TitledBorder.BOTTOM));

		JPanel p31 = new JPanel();
		p31.setBorder(new TitledBorder(line, "Test", TitledBorder.LEFT, TitledBorder.ABOVE_BOTTOM));
		JPanel p32 = new JPanel();
		p32.setBorder(new TitledBorder(line, "Test", TitledBorder.CENTER, TitledBorder.ABOVE_BOTTOM));
		JPanel p33 = new JPanel();
		p33.setBorder(new TitledBorder(line, "Test", TitledBorder.RIGHT, TitledBorder.ABOVE_BOTTOM));

		JPanel p41 = new JPanel();
		p41.setBorder(new TitledBorder(line, "Test", TitledBorder.LEFT, TitledBorder.BELOW_BOTTOM));
		JPanel p42 = new JPanel();
		p42.setBorder(new TitledBorder(line, "Test", TitledBorder.CENTER, TitledBorder.BELOW_BOTTOM));
		JPanel p43 = new JPanel();
		p43.setBorder(new TitledBorder(line, "Test", TitledBorder.RIGHT, TitledBorder.BELOW_BOTTOM));

		JPanel p51 = new JPanel();
		p51.setBorder(new TitledBorder(line, "Test", TitledBorder.LEFT, TitledBorder.ABOVE_TOP));
		JPanel p52 = new JPanel();
		p52.setBorder(new TitledBorder(line, "Test", TitledBorder.CENTER, TitledBorder.ABOVE_TOP));
		JPanel p53 = new JPanel();
		p53.setBorder(new TitledBorder(line, "Test", TitledBorder.RIGHT, TitledBorder.ABOVE_TOP));

		JPanel p61 = new JPanel();
		p61.setBorder(new TitledBorder(line, "Test", TitledBorder.LEFT, TitledBorder.BELOW_TOP));
		JPanel p62 = new JPanel();
		p62.setBorder(new TitledBorder(line, "Test", TitledBorder.CENTER, TitledBorder.BELOW_TOP));
		JPanel p63 = new JPanel();
		p63.setBorder(new TitledBorder(line, "Test", TitledBorder.RIGHT, TitledBorder.BELOW_TOP));

		p.add(p11);
		p.add(p12);
		p.add(p13);
		p.add(p21);
		p.add(p22);
		p.add(p23);
		p.add(p31);
		p.add(p32);
		p.add(p33);
		p.add(p41);
		p.add(p42);
		p.add(p43);
		p.add(p51);
		p.add(p52);
		p.add(p53);
		p.add(p61);
		p.add(p62);
		p.add(p63);
		
		frame.add(p);

	}
	public static void main(String[] args) {
		SwingTitledBorder app = new SwingTitledBorder();
		app.setSize(600, 400);
		app.setVisible(true);
		
	}

}
