import java.awt.*;

public class AwtFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame f = new Frame("ù��° AWT ���α׷�");
		f.setLayout(new FlowLayout());

		Button b1 = new Button("Ȯ��");
		Button b2 = new Button("���");
		
		f.add(b1);
		f.add(b2);

		f.setSize(300,200);
		f.setVisible(true);

	}

}
