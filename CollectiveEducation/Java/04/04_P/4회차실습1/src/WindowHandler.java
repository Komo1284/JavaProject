import java.awt.*;
import java.awt.event.*;

class WindowHandler implements WindowListener {
	Frame app;
	public WindowHandler(Frame app) {
		this.app = app;
	}
	public void windowClosing(WindowEvent e) { 
		System.out.println("Window Closing!!");
		app.dispose();
		System.exit(0);
	}
	public void windowActivated(WindowEvent e) { 
		System.out.println("Window Activated!!");
	}
	public void windowClosed(WindowEvent e) { 
		System.out.println("Window closed!!");
	}
	public void windowDeactivated(WindowEvent e) { 
		System.out.println("Window DeActivated!!");
	}
	public void windowDeiconified(WindowEvent e) { 
		System.out.println("Window Deiconified!!");
	}
	public void windowIconified(WindowEvent e) { 
		System.out.println("Window Iconified!!");
	}
	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opened!!");
	}
}
