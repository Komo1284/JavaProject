import java.awt.*;
import java.awt.event.*;
public class AwtComponent extends Frame implements ActionListener {

	Button test = new Button("TEST");

	Button hidden = new Button("Hidden");
	Button moved = new Button("Moved");
	Button resized = new Button("Resized");
	Button shown = new Button("Shown");

	TextArea output = new TextArea();
	
	public AwtComponent() {
		super("ComponentEvent");

		Panel p1 = new Panel();
		p1.add(hidden);
		p1.add(moved);
		p1.add(resized);
		p1.add(shown);
		hidden.addActionListener(this);
		moved.addActionListener(this);
		resized.addActionListener(this);
		shown.addActionListener(this);
		
		add(p1,BorderLayout.NORTH);
		
		Panel p2 = new Panel();
		p2.setLayout(null);
		test.setBounds(10,10,30,30);
		p2.add(test);
		add(p2,BorderLayout.CENTER);

		add(output, BorderLayout.SOUTH);
		
		EventHandler eh = new EventHandler();
		test.addComponentListener(eh);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}
	class EventHandler extends ComponentAdapter {
		public void componentHidden(ComponentEvent e) {
			output.append("HIDDEN\n");
		}
		public void componentMoved(ComponentEvent e) {
			Button src = (Button)e.getSource();
			output.append(src.getX()+","+src.getY()+" : MOVED\n");
		}
		public void componentResized(ComponentEvent e) {
			Button src = (Button)e.getSource();
			output.append(src.getWidth()+","+src.getHeight()+" : RESIZED\n");
		}
		public void componentShown(ComponentEvent e) {
			output.append("SHOWN\n");
		}
	}
	public void actionPerformed(ActionEvent e ) {
		Object org = e.getSource();
		if(org == hidden) {
			test.setVisible(false);
		} else if( org == moved ) {
			test.setLocation(50, 10);
		} else if( org == resized ) {
			test.setSize(50,30);
		} else if( org == shown ) {
			test.setVisible(true);
		}
	}
	public static void main(String[] args) {
		AwtComponent app = new AwtComponent();
		app.setSize(300,300);
		app.setVisible(true);

	}

}
