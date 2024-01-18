import java.awt.*;
import java.awt.event.*;
public class AwtAction extends Frame implements ActionListener {

	Button ok, cancel;
	TextField tf;
	List select;
	TextArea output;
	
	public AwtAction() {
		super("ActionEvent");

		ok = new Button("OK");
		cancel = new Button("CANCEL");
		tf = new TextField(10);
		select = new List(3);
		select.add("Apple");
		select.add("Banana");
		select.add("Melon");
		select.add("Cherry");
		select.add("Strawberry");
		output = new TextArea();
				
		Panel p1 = new Panel();
		p1.add(new Label("입력 : "));
		p1.add(tf);
		p1.add(ok);
		p1.add(cancel);
		
		add(p1, BorderLayout.NORTH);
		
		Panel p2 = new Panel();
		p2.add(select);
		add(p2, BorderLayout.CENTER);
		
		add(output, BorderLayout.SOUTH);
		
		ok.addActionListener(this);
		cancel.addActionListener(this);
		tf.addActionListener(this);
		select.addActionListener(this);

		ok.setActionCommand("오케이");
		cancel.setActionCommand("켄슬");

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}
	public void actionPerformed(ActionEvent e ) {
		Object org = e.getSource();
		if(org == ok || org == cancel) {
			Button src = (Button)org;
			output.append(src.getActionCommand()+"\n");
		} else if( org == tf ) {
			TextField src = (TextField)org;
			output.append(src.getText()+"\n");
		} else if( org == select ) {
			List src = (List)org;
			output.append(src.getSelectedItem()+"\n");
		}
	}
	public static void main(String[] args) {
		AwtAction app = new AwtAction();
		app.setSize(350,300);
		app.setVisible(true);

	}

}
