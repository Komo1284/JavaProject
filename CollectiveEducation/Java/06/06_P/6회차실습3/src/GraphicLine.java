import java.awt.*;
import java.awt.event.*;
public class GraphicLine extends Frame {

	DrawCanvas dc;

	public GraphicLine() {
		super("Graphic Line");
	
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

			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					if(x2 != -1 && y2 != -1) {
						x1 = x2;
						y1 = y2;
					}
					x2 = e.getX();
					y2 = e.getY();
					repaint();
				}
			});
		}
		public void update(Graphics g) {
			paint(g);
		}
		public void paint(Graphics g) {
			g.drawLine(x1, y1, x2, y2);
		}
	}
	public static void main(String[] args) {
		GraphicLine app = new GraphicLine();
		app.setSize(300,400);
		app.setVisible(true);
	}
}