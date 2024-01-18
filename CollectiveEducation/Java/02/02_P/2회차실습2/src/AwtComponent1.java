import java.awt.*;
public class AwtComponent1 extends Frame {

	AwtComponent1() {
		super("Component 클래스");
		setLayout(new FlowLayout());

		Button b1 = new Button("확인");
		Button b2 = new Button("취소");
		
		add(b1);
		add(b2);

		b1.setForeground(new Color(100,200,200));
		b1.setBackground(new Color(200,100,200));

		Color b1_f = b1.getForeground();
		Color b1_b = b1.getBackground();

		b2.setForeground(b1_b);
		b2.setBackground(b1_f);
		
	}
	public static void main(String[] args) {
	
		AwtComponent1 ac = new AwtComponent1();
		ac.setSize(350,100);
		ac.setVisible(true);

	}

}
