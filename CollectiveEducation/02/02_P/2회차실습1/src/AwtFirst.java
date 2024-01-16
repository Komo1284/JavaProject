import java.awt.*;

public class AwtFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame f = new Frame("첫번째 AWT 프로그램");
		f.setLayout(new FlowLayout());

		Button b1 = new Button("확인");
		Button b2 = new Button("취소");
		
		f.add(b1);
		f.add(b2);

		f.setSize(300,200);
		f.setVisible(true);

	}

}
