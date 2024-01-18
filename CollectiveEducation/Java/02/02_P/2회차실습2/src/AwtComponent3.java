import java.awt.*;
public class AwtComponent3 extends Frame {

	AwtComponent3() {
		super("Component 클래스");
		setLayout(new FlowLayout());

		Button b1 = new Button("확인");
		Button b2 = new Button("취소");
		
		add(b1);
		add(b2);

		b1.setEnabled(true);
		b2.setEnabled(true);
		b1.setVisible(true);
		b2.setVisible(true);
		
		if( b1.isEnabled() ) b1.setVisible(false);
		
		if( b2.isVisible() ) b2.setEnabled(false);
		
	}
	public static void main(String[] args) {
	
		AwtComponent3 ac = new AwtComponent3();
		ac.setSize(350,100);
		ac.setVisible(true);

	}

}
