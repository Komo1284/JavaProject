import java.awt.*;
import java.awt.event.*;
public class GraphicFigure extends Frame  {

	DrawCanvas dc;
	Choice figure, color;
	Checkbox fill;

	public GraphicFigure() {
		super("Graphic Figure");
	
		figure = new Choice();
		figure.add("사각형");
		figure.add("모서리가 둥근 사각형");
		figure.add("타원");
		
		color = new Choice();
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		
		fill = new Checkbox("채우기");
		
		Panel p = new Panel();
		p.add(figure);
		p.add(color);
		p.add(fill);
		
		add(p, BorderLayout.NORTH);
		
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
		public void paint(Graphics g) {
			int x = Math.min(x1,  x2);
			int y = Math.min(y1,  y2);
			int width = Math.abs(x2 - x1);
			int height = Math.abs(y2 - y1);

			Color select = Color.BLACK;
			if(color.getSelectedIndex()==0)
				select = Color.RED;
			else if(color.getSelectedIndex()==1)
				select = Color.GREEN;
			else if(color.getSelectedIndex()==2)
				select = Color.BLUE;
			
			g.setColor(select);
			
			switch(figure.getSelectedIndex()) {
			case 0: // Rect
				if( fill.getState() ) g.fillRect(x, y, width, height);
				else g.drawRect(x, y, width, height);
				break;
			case 1: // RoundRect
				if( fill.getState() ) g.fillRoundRect(x, y, width, height, 50, 50);
				else g.drawRoundRect(x, y, width, height, 50, 50);
				break;
			case 2: // Oval
				if( fill.getState() ) g.fillOval(x, y, width, height);
				else g.drawOval(x, y, width, height);
				break;
			}
		}
	}
	public static void main(String[] args) {
		GraphicFigure app = new GraphicFigure();
		app.setSize(300,400);
		app.setVisible(true);
	}
}