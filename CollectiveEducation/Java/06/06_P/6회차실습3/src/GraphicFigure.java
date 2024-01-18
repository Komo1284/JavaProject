import java.awt.*;
import java.awt.event.*;
public class GraphicFigure extends Frame {

	DrawCanvas dc;

	public GraphicFigure() {
		super("Graphic Figure");
	
		dc = new DrawCanvas();
		add(dc,BorderLayout.CENTER);
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	class DrawCanvas extends Canvas {

		int x1=-1,y1=-1,x2=-1,y2=-1;
		
		public DrawCanvas() {

			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					x2 = e.getX();
					y2 = e.getY();
					repaint();
				}
			});
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					x1 = e.getX();
					y1 = e.getY();
					x2 = y2 = -1;
				}
				public void mouseReleased(MouseEvent e) {
					x2 = e.getX();
					y2 = e.getY();
					repaint();
				}
				
			});
		}
		//public void update(Graphics g) {
		//	paint(g);
		//}
		public void paint(Graphics g) {
			int x = Math.min(x1,  x2);
			int y = Math.min(y1,  y2);
			int width = Math.abs(x2 - x1);
			int height = Math.abs(y2 - y1);
				
			g.drawRect(x, y, width, height);
			//g.drawRoundRect(x, y, width, height, 50, 50);
			//g.drawOval(x, y, width, height);
			
			//g.setColor(Color.BLUE);
			//g.fillRect(x, y, width, height);
			//g.fillRoundRect(x, y, width, height, 50, 50);
			//g.fillOval(x, y, width, height);
		}
	}
	public static void main(String[] args) {
		GraphicFigure app = new GraphicFigure();
		app.setSize(300,400);
		app.setVisible(true);
	}
}