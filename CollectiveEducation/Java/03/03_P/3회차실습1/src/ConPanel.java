import java.awt.*;

public class ConPanel {

	public static void main(String[] args) {
		Frame f = new Frame("Panel Test");
		
		Panel north = new Panel();
		north.add(new Button("Ȯ��"));
		north.add(new Button("���"));
		
		Panel center = new Panel();
		center.add(new TextField(10));
		center.add(new TextField(10));
		
		f.add(north, BorderLayout.NORTH );
		f.add(center, BorderLayout.CENTER);
		
		f.setSize(300,300);
		f.setVisible(true);
	}

}
