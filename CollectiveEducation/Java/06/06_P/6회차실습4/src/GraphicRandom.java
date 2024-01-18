import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class GraphicRandom extends Frame {

	DrawCanvas dc;
	
	int x=-1, y=-1;
	int width, height;
	int red, green, blue;

	public GraphicRandom() {
		super("Graphic Random");
	
		dc = new DrawCanvas();
		add(dc,BorderLayout.CENTER);

		setSize(300,400);
		setVisible(true);

		width = dc.getSize().width;
		height = dc.getSize().height;
		
		ThreadRandom tr = new ThreadRandom();
		tr.start();
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	class ThreadRandom extends Thread {
		
		Random random = new Random(); 
		public void run() {
			for(int i = 0; i < 100; i++ ) {
				x = random.nextInt(width+1);
				y = random.nextInt(height+1);
				red = random.nextInt(256);
				green = random.nextInt(256);
				blue = random.nextInt(256);
				try {
					Thread.sleep(100);
				} catch(Exception e) {
					System.out.println("Thread Error!!");
				}
				dc.repaint();
			}
		}
	}
	class DrawCanvas extends Canvas {

		public void update(Graphics g) {
			paint(g);
		}
		public void paint(Graphics g) {
			if( x != -1 && y != -1 ) {
				g.setColor(new Color(red, green, blue));
				g.fillOval(x, y, 10, 10);
			}
			
		}
	}
	public static void main(String[] args) {
		GraphicRandom app = new GraphicRandom();
	}
}