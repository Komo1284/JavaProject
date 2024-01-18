import java.awt.*;
import java.awt.event.*;
public class AwtContainer extends Frame implements ActionListener {

	Panel ptest = new Panel();
	Button btest = new Button("TEST");
	
	Button add = new Button("ADD");
	Button remove = new Button("REMOVE");

	TextArea output = new TextArea();
	
	public AwtContainer() {
		super("ContainerEvent");

		Panel p = new Panel();
		p.add(add);
		p.add(remove);
		add.addActionListener(this);
		remove.addActionListener(this);
		
		add(p,BorderLayout.NORTH);
		add(ptest,BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		
		EventHandler eh = new EventHandler();
		ptest.addContainerListener(eh);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}
	class EventHandler extends ContainerAdapter {
		public void componentAdded(ContainerEvent e) {
			output.append("ÄÄÆ÷³ÍÆ®°¡ Ãß°¡µÊ\n");
		}
		public void componentRemoved(ContainerEvent e) {
			output.append("ÄÄÆ÷³ÍÆ®°¡ »èÁ¦µÊ\n");
		}

	}
	public void actionPerformed(ActionEvent e ) {
		Object org = e.getSource();
		if(org == add) {
			ptest.add(btest);
			ptest.validate();
		} else if( org == remove ) {
			ptest.remove(btest);
			ptest.validate();
		} 
	}
	public static void main(String[] args) {
		AwtContainer app = new AwtContainer();
		app.setSize(300,300);
		app.setVisible(true);

	}

}
