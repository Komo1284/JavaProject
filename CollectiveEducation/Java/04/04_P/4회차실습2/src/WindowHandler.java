import java.awt.*;
import java.awt.event.*;

class WindowHandler extends WindowAdapter {
	Frame app;
	public WindowHandler(Frame app) {
		this.app = app;
	}
	public void windowClosing(WindowEvent e) { 
		System.out.println("Window Closing!!");
		app.dispose();
		System.exit(0);
	}
}
