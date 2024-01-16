import java.awt.*;
public class AwtLabel extends Frame {

	AwtLabel() {
		super("Label 클래스");
		setLayout(new GridLayout(2,1));
		
		Label la1 = new Label("첫번째 Label 입니다!");
		Label la2 = new Label("두번째 Label 입니다!", Label.CENTER);
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
