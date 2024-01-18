import java.awt.*;
import java.awt.event.*;

public class EventTotal extends Frame {
	Checkbox active, deactive; 
	TextArea output;
	
	public EventTotal() {
		super("Event Total");
		
		active = new Checkbox("ACTIVE");
		deactive = new Checkbox("DEAVTIVE");
		output = new TextArea();
		
		Panel p = new Panel();
		p.add(active);
		p.add(deactive);
		add(p, BorderLayout.NORTH);
		add(output, BorderLayout.CENTER);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) { 
				dispose();
				System.exit(0);
			}
			public void windowActivated(WindowEvent e) { 
				output.append("Window Activated!!\n");
				active.setState(true);
				deactive.setState(false);
			}
			public void windowDeactivated(WindowEvent e) { 
				output.append("Window DeActivated!!\n");
				active.setState(false);
				deactive.setState(true);
			}

		});
		
	}
	public static void main(String[] args) {
		EventTotal app = new EventTotal();
		app.setSize(300,300);
		app.setVisible(true);
	}

}
