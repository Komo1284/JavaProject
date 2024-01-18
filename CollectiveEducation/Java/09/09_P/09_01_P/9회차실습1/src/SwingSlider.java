import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class SwingSlider extends JFrame implements ChangeListener {

	JSlider js1, js2, js3;
	JLabel status1, status2, status3;
	
	public SwingSlider() {
		super("JSlider");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		js1 = new JSlider();
		js1.setOrientation(JSlider.VERTICAL);
		js1.setMinimum(0);
		js1.setMaximum(100);
		js1.setValue(50);
		js1.setPreferredSize(new Dimension(50,300));
		js1.setMajorTickSpacing(20);
		js1.setMinorTickSpacing(5);
		js1.setPaintTicks(true);
		js1.setSnapToTicks(true);
		js1.addChangeListener(this);

		js2 = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		js2.setPreferredSize(new Dimension(50,300));
		js2.setMajorTickSpacing(20);
		js2.setPaintLabels(true);
		js2.setSnapToTicks(true);
		js2.addChangeListener(this);

		js3 = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		js3.setPreferredSize(new Dimension(50,300));
		js3.setMajorTickSpacing(20);
		js3.setMinorTickSpacing(5);
		js3.setPaintTicks(true);
		js3.setPaintLabels(true);
		js3.setSnapToTicks(true);
		js3.addChangeListener(this);

		status1 = new JLabel("[50]", JLabel.CENTER);
		status2 = new JLabel("[50]", JLabel.CENTER);
		status3 = new JLabel("[50]", JLabel.CENTER);

		JPanel p1 = new JPanel(new BorderLayout());
		p1.add(js1, BorderLayout.CENTER);
		p1.add(status1, BorderLayout.SOUTH);
		p1.setBorder(new EtchedBorder(BevelBorder.LOWERED));

		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(js2, BorderLayout.CENTER);
		p2.add(status2, BorderLayout.SOUTH);
		p2.setBorder(new EtchedBorder(BevelBorder.LOWERED));

		JPanel p3 = new JPanel(new BorderLayout());
		p3.add(js3, BorderLayout.CENTER);
		p3.add(status3, BorderLayout.SOUTH);
		p3.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		
		frame.setLayout(new BoxLayout(frame,BoxLayout.X_AXIS));
		frame.add(Box.createRigidArea(new Dimension(10,0)));
		frame.add(p1);
		frame.add(Box.createRigidArea(new Dimension(10,0)));
		frame.add(p2);
		frame.add(Box.createRigidArea(new Dimension(10,0)));
		frame.add(p3);
		frame.add(Box.createRigidArea(new Dimension(10,0)));
	}
	public void stateChanged(ChangeEvent e) {
		JSlider src = (JSlider)e.getSource();
		if( src == js1 ) status1.setText("[ "+src.getValue()+" ]");
		else if( src == js2 ) status2.setText("[ "+src.getValue()+" ]");
		else status3.setText("[ "+src.getValue()+" ]");
	}
	public static void main(String[] args) {
		SwingSlider app = new SwingSlider();
		app.pack();
		app.setVisible(true);
	}

}
