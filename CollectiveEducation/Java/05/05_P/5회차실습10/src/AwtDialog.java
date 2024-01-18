import java.awt.*;
import java.awt.event.*;
public class AwtDialog extends Frame implements ActionListener {

	Button call = new Button("다이얼로그 열기");
	
	public AwtDialog() {
		super("Dialog 활용하기");

		setLayout(new FlowLayout());
		add(call);
		call.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}
	public void actionPerformed(ActionEvent e) {
		CustomDialog cd = new CustomDialog(this);
		cd.setSize(250,200);
		cd.setVisible(true);
	}
	public static void main(String[] args) {
		AwtDialog app = new AwtDialog();
		app.setSize(300,100);
		app.setVisible(true);
	}
	
	class CustomDialog extends Dialog implements ItemListener, ActionListener {
		
		Checkbox red, yellow, green;
		Button output = new Button();
		Button ok = new Button("OK");
		
		public CustomDialog(Frame f) {
			super(f, "Color Dialog", true); // modal dialog
			
			CheckboxGroup cg = new CheckboxGroup(); 
			red = new Checkbox("RED", cg, false);
			yellow = new Checkbox("YELLOW", cg, false);
			green = new Checkbox("GREEN", cg, false);
			Panel p = new Panel();
			p.add(red);
			p.add(yellow);
			p.add(green);
			
			add(p, BorderLayout.NORTH);
			add(output, BorderLayout.CENTER);
			add(ok, BorderLayout.SOUTH);
			
			red.addItemListener(this);
			yellow.addItemListener(this);
			green.addItemListener(this);
			ok.addActionListener(this);
			
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			});

		}
		public void actionPerformed(ActionEvent e) {
			  Button src = (Button)e.getSource();
			  if( src == ok ) dispose();
		}
		public void itemStateChanged(ItemEvent e ) {
			  if( e.getStateChange() == ItemEvent.SELECTED) {
				  Object src = e.getSource();
				  if(src == red) {
					  output.setBackground(Color.RED);
					  output.setLabel("RED");
				  }
				  else if(src == yellow) {
					  output.setBackground(Color.YELLOW);
					  output.setLabel("YELLOW");
				  }
				  else if(src == green) {
					  output.setBackground(Color.GREEN);
					  output.setLabel("GREEN");
				  }
			  }
		}
	}
}
