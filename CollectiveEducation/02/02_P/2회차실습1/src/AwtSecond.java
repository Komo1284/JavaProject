import java.awt.*;

public class AwtSecond extends Frame {
	
	AwtSecond() {
		super("두번째 AWT 프로그램");
		setLayout(new FlowLayout());

		Button b1 = new Button("확인");
		Button b2 = new Button("취소");
		
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
