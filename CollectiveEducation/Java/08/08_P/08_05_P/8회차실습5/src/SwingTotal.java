import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class SwingTotal extends JFrame implements ActionListener {

	JTextField id;
	JPasswordField pass;
	JRadioButton male, female;
	JComboBox<String> addr; 
	JButton sign, clear;

	JTextArea output = new JTextArea();
	
	public SwingTotal() {
		super("Swing Total");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		id = new JTextField();
		pass = new JPasswordField();
		pass.setEchoChar('*');
		male = new JRadioButton("Male", true);
		female = new JRadioButton("Female");
		ButtonGroup bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		String[] data = { "Seoul", "Pusan", "Asan", "Daejeon" };
		addr = new JComboBox<String>(data);
		sign = new JButton("Sign");
		sign.addActionListener(this);
		clear = new JButton("Clear");
		clear.addActionListener(this);
		
		JLabel l1 = new JLabel("ID  ");
		l1.setHorizontalAlignment(SwingConstants.RIGHT);
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,2));
		p1.add(l1);
		p1.add(id);

		JLabel l2 = new JLabel("Password  ");
		l2.setHorizontalAlignment(SwingConstants.RIGHT);
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,2));
		p2.add(l2);
		p2.add(pass);
		
		JPanel p31 = new JPanel();
		p31.setLayout(new GridLayout(1,2));
		p31.add(male);
		p31.add(female);
		
		JLabel l3 = new JLabel("Gender  ");
		l3.setHorizontalAlignment(SwingConstants.RIGHT);
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1,2));
		p3.add(l3);
		p3.add(p31);

		JLabel l4 = new JLabel("Address  ");
		l4.setHorizontalAlignment(SwingConstants.RIGHT);
		JPanel p4 = new JPanel();
		p4.setLayout(new GridLayout(1,2));
		p4.add(l4);
		p4.add(addr);

		JPanel p5 = new JPanel();
		p5.add(sign);
		p5.add(clear);

		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(p1);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(p2);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(p3);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(p4);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(p5);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		
		frame.add(p, BorderLayout.WEST);
		
	    JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		output.setPreferredSize(new Dimension(150,50));
		frame.add(output, BorderLayout.EAST);

	}
	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		if( src == sign ) {
			String text = "ID : "+id.getText() +"\n";
			text += "Password : "+new String(pass.getPassword())+"\n";
			text += "Gender : ";
			if(male.isSelected()) text += male.getText()+"\n";
			else if(female.isSelected()) text += female.getText()+"\n";
			else text += "Not Selected\n";
			text += "Address : "+addr.getSelectedItem()+"\n";
			output.setText(text);
		} else if(src == clear){
			id.setText("");
			pass.setText("");
			male.setSelected(true);			
			female.setSelected(false);
			addr.setSelectedIndex(0);
			output.setText("");
		}
	}
	public static void main(String[] args) {
		SwingTotal app = new SwingTotal();
		app.pack();
		app.setVisible(true);

	}

}
