import java.awt.*;
import java.awt.event.*;

public class AwtLast extends Frame implements MouseListener {

	PopupMenu pm;
	TextArea output;

	AwtLast() {
		super("적용하기");

		output = new TextArea();
		add(output);
		
		pm = new PopupMenu();

		MenuItem copy = new MenuItem("Copy");
		MenuItem paste = new MenuItem("Paste");
		MenuItem save = new MenuItem("Save");
		
		pm.add(copy);
		pm.add(paste);
		pm.add(save);
		
		output.add(pm);
		
		output.addMouseListener(this);
		
	}
	public void mousePressed(MouseEvent e) {
		if( (e.getModifiersEx() & InputEvent.BUTTON3_DOWN_MASK) != 0 ) {
			pm.show(output, e.getX(), e.getY());
			output.append("X="+e.getX()+", Y="+e.getY()+"\n");
		}
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

	public static void main(String[] args) {
		AwtLast ab = new AwtLast();
		ab.setSize(350,250);
		ab.setVisible(true);

	}

}

