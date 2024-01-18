import java.awt.*;
public class LayoutNull {

	public static void main(String[] args) {
		
		Frame f = new Frame("Null Layout Test");
		f.setLayout(null);
		
		Button ok = new Button("OK");
		ok.setBounds(75, 75, 150, 150);
		//ok.setLocation(75, 75);
		//ok.setSize(150, 150);
		
		f.add(ok);
		f.setSize(300,300);
		f.setVisible(true);

	}

}
