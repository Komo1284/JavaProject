import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;
import javax.swing.border.*;

public class NetworkInetAddress extends JFrame implements ActionListener {

	JTextField hostname = new JTextField();
	JTextArea output = new JTextArea();
	JButton get = new JButton("Get");
	
	public NetworkInetAddress( ) {
		super("InetAddress");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		hostname.addActionListener(this);
		get.addActionListener(this);
		
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(new Label("Host Name"));
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(hostname);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(get);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		
	    JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(300,200));

		frame.add(p, BorderLayout.NORTH);
		frame.add(sp, BorderLayout.CENTER);
	}
	public void actionPerformed(ActionEvent e) {
		try {
			InetAddress addr = InetAddress.getByName(hostname.getText());
			output.append("IP Address : "+addr.getHostAddress()+"\n");
			output.append("Host Name : "+addr.getHostName()+"\n");
		} catch(UnknownHostException ex) {
			output.append("UnknownHostException : "+hostname.getText()+"\n");
		}
	}

	public static void main(String[] args) {
		NetworkInetAddress app = new NetworkInetAddress();
		app.setSize(350,300);
		app.setVisible(true);

	}
	

}
