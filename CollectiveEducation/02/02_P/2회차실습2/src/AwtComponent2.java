import java.awt.*;
public class AwtComponent2 extends Frame {

	AwtComponent2() {
		super("Component 클래스");
		setLayout(null);

		Button b1 = new Button("확인");
		Button b2 = new Button("취소");
		
		add(b1);
		add(b2);
		
		b1.setLocation(50, 50);
		b1.setSize(50, 50);

		Point b1_p = b1.getLocation();
		Dimension b1_d = b1.getSize();
		
		b2.setLocation(b1_p.x+50, b1_p.y+50);
		b2.setSize(b1_d.width+25, b1_d.height+25);
		
		
	}
	public static void main(String[] args) {
	
		AwtComponent2 ac = new AwtComponent2();
		ac.setSize(300,200);
		ac.setVisible(true);

	}

}
