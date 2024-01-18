import java.awt.*;
import java.awt.event.*;
public class GraphicImage extends Frame implements Runnable {

	String[] name = {"car0.jpg","car1.jpg","car2.jpg","car3.jpg","car4.jpg","car5.jpg","car6.jpg","car7.jpg","car8.jpg","car9.jpg"};
	Image[] image = new Image[name.length];
	int index = -1;
	
	public GraphicImage() {
		super("Graphic Image");
	
		for(int i=0; i< name.length; i++) 
			image[i] = Toolkit.getDefaultToolkit().getImage(name[i]);
		
		Thread t = new Thread(this);
		t.start();

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g) {
		if( index != -1 )  
			//g.drawImage(image[index], 0, 0, this);
			g.drawImage(image[index], 0, 0, getSize().width, getSize().height, this);
	}
	public void run() {
		while(true) {
			index++;
			if( index == image.length ) index = 0;
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println("Thread Error!!");
			}
			repaint();
		}
	}
	public static void main(String[] args) {
		GraphicImage app = new GraphicImage();
		app.setSize(600,500);
		app.setVisible(true);
	}
}