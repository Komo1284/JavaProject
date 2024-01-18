import java.awt.*;
public class ConDialog {

	public static void main(String[] args) {
		
		Frame f = new Frame("Dialog Test");
		//Dialog modal = new Dialog(f, "Modal", true);
		Dialog modaless = new Dialog(f, "Modaless", false);
		
		Panel p = new Panel();
		p.add(new Button("OK"));
		p.add(new Button("CANCEL"));
		
		//modal.add(p);
		modaless.add(p);
		
		f.setSize(100,100);
		f.setVisible(true);

		//modal.setSize(100,100);
		//modal.setVisible(true);
		modaless.setSize(100,100);
		modaless.setVisible(true);
		
	}

}
