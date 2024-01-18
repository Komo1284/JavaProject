import java.awt.*;
public class LayoutGrid {

	public static void main(String[] args) {
	
		Frame f = new Frame("GridLayout Test");
		f.setLayout(new GridLayout(3,4));
		
		for(int i=1; i<=12; i++) f.add(new Button("¹öÆ°"+i));
		
		f.setSize(400,200);
		f.setVisible(true);
		

	}

}
