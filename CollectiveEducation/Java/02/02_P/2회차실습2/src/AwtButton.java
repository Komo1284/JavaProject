import java.awt.*;
public class AwtButton extends Frame {

	AwtButton() {
		super("Button Ŭ����");
		setLayout(new FlowLayout());

		Button b1 = new Button("Ȯ��");
		Button b2 = new Button("���");
		
		add(b1);
		add(b2);

		String b1_s = b1.getLabel();
		String b2_s = b2.getLabel();
		
		b1.setLabel(b1_s+":"+b2_s);
		b2.setLabel(b2_s+":"+b1_s);
	}
	public static void main(String[] args) {
		AwtButton ab = new AwtButton();
		ab.setSize(350,100);
		ab.setVisible(true);

	}

}
