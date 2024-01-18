import java.awt.*;
import java.awt.event.*;
public class AdapterOuter extends Frame  {

	AdapterOuter() {
		super("Adapter");
		add(new Button("OK"));
		
		WindowHandler wh = new WindowHandler(this);
		addWindowListener(wh);
	}
	
	public static void main(String[] args) {
		AdapterOuter app = new AdapterOuter();
		app.setSize(300,300);
		app.setVisible(true);
	}
}
