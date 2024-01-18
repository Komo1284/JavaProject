import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;

public class SwingPassword extends JFrame implements ActionListener {

	JPasswordField pass = new JPasswordField();
	JTextArea output = new JTextArea();
	
	public SwingPassword() {
		super("Swing Password");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		pass.setEchoChar('*');
		pass.addActionListener(this);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		BoxLayout bl = new BoxLayout(panel,BoxLayout.X_AXIS);
		panel.setLayout(bl);
	    panel.add(Box.createRigidArea(new Dimension(0,10)));
		panel.add(new JLabel(" Passord "));
	    panel.add(Box.createRigidArea(new Dimension(0,10)));
		panel.add(pass);
	    panel.add(Box.createRigidArea(new Dimension(0,10)));
	    
		frame.add(panel, BorderLayout.NORTH);
		frame.add(output, BorderLayout.CENTER);
		
	}
	public void actionPerformed(ActionEvent e) {
		String password = new String(pass.getPassword());
		output.append(password+"\n");
		pass.setText("");
	}
	public static void main(String[] args) {
		SwingPassword app = new SwingPassword();
		app.setSize(300,350);
		app.setVisible(true);

	}

}
