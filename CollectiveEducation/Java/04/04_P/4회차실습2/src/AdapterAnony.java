import java.awt.*;
import java.awt.event.*;

public class AdapterAnony extends Frame {

	AdapterAnony() {
		super("Adapter");
		add(new Button("OK"));
		
		addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) { 
				System.out.println("Window Closing!!");
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		AdapterAnony app = new AdapterAnony();
		app.setSize(300,300);
		app.setVisible(true);
	}

}
