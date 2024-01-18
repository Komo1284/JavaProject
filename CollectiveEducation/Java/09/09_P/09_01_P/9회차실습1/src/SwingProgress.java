import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingProgress extends JFrame implements ActionListener, ChangeListener {

	JProgressBar pb;
	JButton start;
	JLabel status;
	
	public SwingProgress() {
		super("JProgressBar");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		pb = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
		pb.setStringPainted(true);
		pb.setPreferredSize(new Dimension(300,50));
		pb.addChangeListener(this);

		start = new JButton("Start");
		status = new JLabel("0 %");
		start.addActionListener(this);
		JPanel p = new JPanel();
		p.add(start);
		p.add(status);
		
		frame.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));
		frame.add(pb);
		frame.add(p);
		
	}
	public void stateChanged(ChangeEvent e) {
		JProgressBar src = (JProgressBar)e.getSource();
		status.setText(src.getValue()+" % ÁøÇàÁß!! ");
	}
	public void actionPerformed(ActionEvent e) {
		Progress pro = new Progress();
		pb.setValue(0);
		pro.start();
	}
	public class Progress extends Thread {
		public void run() {
			while(true) {
				try {
					Thread.sleep(100);
				} catch(Exception e) {
					System.out.println("Thread Error!");
				}
				int value = pb.getValue() + 2;
				if( value > pb.getMaximum() ) break;
				pb.setValue(value);
			}
		}
	}
	public static void main(String[] args) {
		SwingProgress app = new SwingProgress();
		app.pack();
		app.setVisible(true);
	}

}
