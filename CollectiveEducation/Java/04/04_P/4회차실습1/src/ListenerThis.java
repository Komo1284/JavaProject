import java.awt.*;
import java.awt.event.*;
public class ListenerThis extends Frame implements WindowListener {

	ListenerThis() {
		super("Listener");
		add(new Button("OK"));
		addWindowListener(this);
	}

	public void windowClosing(WindowEvent e) { 
		System.out.println("Window Closing!!");
		dispose();
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
	
	public static void main(String[] args) {
		ListenerThis app = new ListenerThis();
		app.setSize(300,300);
		app.setVisible(true);

	}
}
