import java.awt.*;
public class AwtScrollBar extends Frame {

	AwtScrollBar() {
		super("Scrollbar Å¬·¡½º");
		
		Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 50, 0, 0, 100);
		sb.setValue(80);
		System.out.println(sb.getValue());
		
		sb.setBackground(new Color(160,160,160));
		
		add(sb, BorderLayout.NORTH);
		
	}
	public static void main(String[] args) {
		AwtScrollBar ab = new AwtScrollBar();
		ab.setSize(300,100);
		ab.setVisible(true);

	}

}

