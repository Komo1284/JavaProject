import java.awt.*;
public class AwtButton extends Frame {

	AwtButton() {
		super("Button 클래스");
		setLayout(new FlowLayout());

		Button b1 = new Button("확인");
		Button b2 = new Button("취소");
		
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
