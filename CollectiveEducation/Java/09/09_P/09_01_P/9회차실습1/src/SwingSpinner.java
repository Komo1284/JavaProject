import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingSpinner extends JFrame implements ChangeListener {

	JSpinner sp1,sp2, sp3;
	JTextArea output = new JTextArea();
	
	public SwingSpinner() {
		super("JSpinner");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		String[] data = { "Apple", "Banana","Melon", "Strawberry" }; 
		SpinnerListModel slm = new SpinnerListModel(data);
		sp1 = new JSpinner(slm);
		sp1.setValue(data[1]);
		sp1.addChangeListener(this);
		
		SpinnerNumberModel snm = new SpinnerNumberModel(50,1,100,1);
		sp2 = new JSpinner(snm);
		sp2.addChangeListener(this);
		
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		calendar.add(Calendar.YEAR, -10);
		Date start = calendar.getTime();
		calendar.add(Calendar.YEAR, 20);
		Date end = calendar.getTime();
		SpinnerDateModel sdm = new SpinnerDateModel(today, start, end, Calendar.YEAR);
		sp3 = new JSpinner(sdm);
		sp3.addChangeListener(this);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,3));
		p.add(sp1);
		p.add(sp2);
		p.add(sp3);
		p.setPreferredSize(new Dimension(400,30));
		frame.add(p, BorderLayout.NORTH);
		frame.add(output, BorderLayout.CENTER);
		
	}
	public void stateChanged(ChangeEvent e) {
		String select1 = (String)sp1.getValue();
		Number select2 = (Number)sp2.getValue();
		Date select3 = (Date)sp3.getValue();
		output.setText(select1+"\n"+select2+"\n"+select3+"\n");
	}
	public static void main(String[] args) {
		SwingSpinner app = new SwingSpinner();
		app.setSize(450,150);
		app.setVisible(true);
	}

}
