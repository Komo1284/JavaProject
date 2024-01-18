import java.awt.*;
import java.awt.event.*;

public class AdapterInner extends Frame {

	AdapterInner() {
		super("Adapter");
		add(new Button("OK"));
		
		WindowHandler wh = new WindowHandler();
		addWindowListener(wh);
	}

	class WindowHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e) { 
			System.out.println("Window Closing!!");
			dispose();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		AdapterInner app = new AdapterInner();
		app.setSize(300,300);
		app.setVisible(true);
	}

}
