import java.awt.*;
import java.awt.event.*;
public class GraphicFrame extends Frame {

	int x=50, y=50;
	
	public GraphicFrame() {
		super("Graphic Frame");
	
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				repaint();
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	public void update(Graphics g) {
		paint(g);
	}
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, 10, 10);
	}
	public static void main(String[] args) {
		GraphicFrame app = new GraphicFrame();
		app.setSize(300,400);
		app.setVisible(true);
	}
}