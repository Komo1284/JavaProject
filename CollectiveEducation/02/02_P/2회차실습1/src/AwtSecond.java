import java.awt.*;

public class AwtSecond extends Frame {
	
	AwtSecond() {
		super("�ι�° AWT ���α׷�");
		setLayout(new FlowLayout());

		Button b1 = new Button("Ȯ��");
		Button b2 = new Button("���");
		
		add(b1);
		add(b2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AwtSecond as = new AwtSecond();
		as.setSize(300,200);
		as.setVisible(true);

	}

}
