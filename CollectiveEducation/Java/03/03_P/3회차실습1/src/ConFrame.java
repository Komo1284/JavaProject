import java.awt.*;

public class ConFrame {
	
	public static void main(String[] args) {

		Frame f = new Frame("프레임 테스트");
		f.setSize(300,300);
		f.setLocation(500, 100);
		f.setResizable(false);
		f.setTitle("Frame Test");
		f.setVisible(true);
	}

}
