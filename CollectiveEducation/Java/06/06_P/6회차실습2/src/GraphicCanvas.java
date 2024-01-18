import java.awt.*;
import java.awt.event.*;
public class GraphicCanvas extends Frame {

	DrawCanvas dc;
	int x=50, y=50;
	
	public GraphicCanvas() {
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
		Font plain = new Font("¸¼Àº°íµñ", Font.BOLD, 20);
		Font bold = new Font("±Ã¼­", Font.BOLD, 20);
		Font italic = new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.ITALIC, 20);
		Font bolditalic = new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD | Font.ITALIC, 20);

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
			g.setColor(Color.red);

			//g.setFont(plain);
			//g.setFont(bold);
			//g.setFont(italic);
			g.setFont(bolditalic);

			g.drawString("¾È³çÇÏ¼¼¿ä!", x, y);
		}
	}
	public static void main(String[] args) {
		GraphicCanvas app = new GraphicCanvas();
		app.setSize(300,400);
		app.setVisible(true);
	}
}