import java.awt.*;
import java.awt.event.*;
public class AwtMouse extends Frame {

	Panel test = new Panel();
	TextArea output = new TextArea();
	
	public AwtMouse() {
		super("MouseEvent");

		EventHandler eh = new EventHandler();
		test.addMouseListener(eh);
		test.addMouseMotionListener(eh);
		
		add(test, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}
	class EventHandler implements MouseListener, MouseMotionListener {
		public void mouseClicked(MouseEvent e) {
			int click = e.getButton();
			if( click == MouseEvent.BUTTON1 ) {
				output.append("왼쪽 버튼 클릭!\n");
			} else if( click == MouseEvent.BUTTON2 ) {
				output.append("가운데 버튼 클릭!\n");
			} else if( click == MouseEvent.BUTTON3 ) {
				output.append("오른쪽 버튼 클릭!\n");
			}
			if( e.isPopupTrigger() ) {
				output.append("팝업 메뉴 이벤트\n");
			}
			showPosition("CLICKED", e);
		}
		public void mouseEntered(MouseEvent e) {
			showPosition("ENTERED", e);
		}
		public void mouseExited(MouseEvent e) {
			showPosition("EXITED", e);
		}
		public void mousePressed(MouseEvent e) {
			showPosition("PRESSED", e);
		}
		public void mouseReleased(MouseEvent e) {
			showPosition("RELEASED", e);
		}
		public void mouseDragged(MouseEvent e) {
			showPosition("DRAGGED", e);
		}
		public void mouseMoved(MouseEvent e) {
			showPosition("MOVED", e);
		}
		public void showPosition(String msg, MouseEvent e) {
			output.append("["+msg+"] x="+e.getX()+",y="+e.getY());
			output.append(" ("+e.getXOnScreen()+","+e.getYOnScreen()+")\n");
		}
	}
	public static void main(String[] args) {
		AwtMouse app = new AwtMouse();
		app.setSize(300,300);
		app.setVisible(true);

	}

}
