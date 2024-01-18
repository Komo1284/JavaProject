import java.awt.*;
import java.awt.event.*;
public class ListenerOuter extends Frame  {

	ListenerOuter() {
		super("Listener");
		add(new Button("OK"));
		
		WindowHandler wh = new WindowHandler(this);
		addWindowListener(wh);
	}
	
	public static void main(String[] args) {
		ListenerOuter app = new ListenerOuter();
		app.setSize(300,300);
		app.setVisible(true);
	}
}
