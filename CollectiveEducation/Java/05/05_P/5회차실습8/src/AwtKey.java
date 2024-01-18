import java.awt.*;
import java.awt.event.*;
public class AwtKey extends Frame {


	TextField input = new TextField();
	TextArea output = new TextArea();
	
	public AwtKey() {
		super("KeyEvent");

		add(input,BorderLayout.NORTH);
		add(output, BorderLayout.CENTER);
		
		EventHandler eh = new EventHandler();
		input.addKeyListener(eh);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}
	class EventHandler extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if( e.getKeyCode() == KeyEvent.VK_F1 ) {
				output.append("* F1 Key Pressed!! *\n");
			}
			output.append("[Pressed] "+e.getKeyChar()+"("+e.getKeyCode()+")");
			output.append(" : "+KeyEvent.getKeyText(e.getKeyCode())+"\n");
		}
		public void keyTyped(KeyEvent e) {
			output.append("[Typed] "+e.getKeyChar()+"("+e.getKeyCode()+")");
			output.append(" : "+KeyEvent.getKeyText(e.getKeyCode())+"\n");
		}
		public void keyReleased(KeyEvent e) {
			output.append("[Released] "+e.getKeyChar()+"("+e.getKeyCode()+")");
			output.append(" : "+KeyEvent.getKeyText(e.getKeyCode())+"\n");
		}
	}
	public static void main(String[] args) {
		AwtKey app = new AwtKey();
		app.setSize(300,300);
		app.setVisible(true);

	}

}
