import java.awt.*;
public class LayoutFlow {

	public static void main(String[] args) {

		Frame f = new Frame("FlowLayout Test");
		
		f.setLayout(new FlowLayout());
		//f.setLayout(new FlowLayout(FlowLayout.LEFT));
		//f.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
		for(int i=0; i<10; i++) f.add(new Button("¹öÆ° "+i));
		
		f.setSize(300,200);
		f.setVisible(true);

	}

}
