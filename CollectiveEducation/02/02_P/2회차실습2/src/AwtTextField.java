import java.awt.*;
public class AwtTextField extends Frame {

	AwtTextField() {
		super("TextField 클래스");
		setLayout(new FlowLayout());

		TextField t1 = new TextField();
		TextField t2 = new TextField(10);
		TextField t3 = new TextField("이름 입력하기!");
		TextField t4 = new TextField("abcdefg");
		t4.setEchoChar('*');
		t1.setText(t4.getText());
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
				
	}
	public static void main(String[] args) {
		AwtTextField ab = new AwtTextField();
		ab.setSize(400,100);
		ab.setVisible(true);

	}

}

