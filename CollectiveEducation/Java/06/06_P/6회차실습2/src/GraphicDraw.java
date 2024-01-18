import java.awt.*;
import java.awt.event.*;
public class GraphicDraw extends Frame {

	DrawCanvas dc;
	int x=50, y=50;
	
	public GraphicDraw() {
		super("Graphic Canvas");
	
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

		Font bolditalic = new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD | Font.ITALIC, 13);

		public DrawCanvas() {
			
			addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
		public void update(Graphics g) {
			paint(g);
		}
		public void paint(Graphics g) {
			g.setColor(Color.BLUE);
			g.drawArc(0, 0, 100, 100, 90, 270);
			g.fillArc(100, 0, 100, 100, 90, 270);

			g.setColor(Color.RED);
			g.drawOval(200,0,100,100);
			g.fillOval(300,0,100,100);
			
			g.setColor(Color.ORANGE);
			g.drawRect(0, 100, 100, 100);
			g.fillRect(100, 100, 100, 100);

			g.setColor(Color.BLACK);
			g.drawRoundRect(200, 100, 100, 100, 50, 50);
			g.fillRoundRect(300, 100, 100, 100, 50, 50);
			
			g.setColor(Color.magenta);
			int[] x1 = { 0, 50, 100, 75, 100, 50, 0, 25 };
			int[] y1 = { 200, 225, 200, 250, 300, 275, 300, 250 };
			g.drawPolygon(x1, y1, 8);
			int[] x2 = { 100, 150, 200, 175, 200, 150, 100, 125 };
			int[] y2 = { 200, 225, 200, 250, 300, 275, 300, 250 };
			g.fillPolygon(x2, y2, 8);
			
			g.setColor(Color.BLACK);
			g.drawLine(200, 200, 300, 300);
			g.drawLine(300, 200, 200, 300);

			g.setColor(Color.DARK_GRAY);
			g.setFont(bolditalic);
			g.drawString("Draw & Fill", 310, 220);
			
		}
	}
	public static void main(String[] args) {
		GraphicDraw app = new GraphicDraw();
		app.setSize(420,350);
		app.setVisible(true);
	}
}