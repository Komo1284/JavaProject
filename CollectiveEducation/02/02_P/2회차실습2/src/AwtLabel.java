import java.awt.*;
public class AwtLabel extends Frame {

	AwtLabel() {
		super("Label Ŭ����");
		setLayout(new GridLayout(2,1));
		
		Label la1 = new Label("ù��° Label �Դϴ�!");
		Label la2 = new Label("�ι�° Label �Դϴ�!", Label.CENTER);
		String text1 = la1.getText();
		String text2 = la2.getText();
		la1.setText(text2);
		la2.setText(text1);
		la1.setAlignment(Label.RIGHT);
		la2.setAlignment(Label.LEFT);
		
		add(la1);
		add(la2);
	}
	public static void main(String[] args) {
		AwtLabel ab = new AwtLabel();
		ab.setSize(350,100);
		ab.setVisible(true);

	}

}
