import java.awt.*;
import java.awt.event.*;
public class AwtAdjustment extends Frame implements AdjustmentListener {

	Scrollbar sb;
	TextArea output;
	
	public AwtAdjustment() {
		super("AdjustmentEvent");

		sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 1, 105);
		output = new TextArea();
				
		add(sb, BorderLayout.NORTH);
		add(output, BorderLayout.SOUTH);
		
		sb.addAdjustmentListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}
	public void adjustmentValueChanged(AdjustmentEvent e ) {
		int type = e.getAdjustmentType();
		String[] name = {"","UNIT_INCREMENT","UNIT_DECREMENT",
				   "BLOCK_DECREMENT", "BLOCK_INCREMENT", "TRACK" };
		output.append(name[type]+" : "+e.getValue()+"\n");
	}
	public static void main(String[] args) {
		AwtAdjustment app = new AwtAdjustment();
		//app.setSize(350,200);
		app.pack();
		app.setVisible(true);

	}

}
