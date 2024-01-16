import java.awt.*;
import java.awt.event.*;

public class AwtPopupMenu extends Frame implements MouseListener {

	PopupMenu pm;

	AwtPopupMenu() {
		super("ÆË¾÷(pup-up) ¸Þ´º");

		pm = new PopupMenu();

		MenuItem copy = new MenuItem("Copy");
		MenuItem paste = new MenuItem("Paste");
		MenuItem cut = new MenuItem("Cut");
		
		pm.add(copy);
		pm.add(paste);
		pm.add(cut);
		
		add(pm);
		
		addMouseListener(this);
		
	}
	public void mousePressed(MouseEvent e) {
		if( (e.getModifiersEx() & InputEvent.BUTTON3_DOWN_MASK) != 0 ) {
			pm.show(this, e.getX(), e.getY());
		}
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

	public static void main(String[] args) {
		AwtPopupMenu ab = new AwtPopupMenu();
		ab.setSize(350,250);
		ab.setVisible(true);

	}

}

