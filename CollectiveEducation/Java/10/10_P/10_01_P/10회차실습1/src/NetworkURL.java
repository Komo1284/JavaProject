import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

public class NetworkURL extends JFrame implements ActionListener {

	JTextField hostname = new JTextField();
	JTextArea output_url = new JTextArea();
	JTextArea output_open = new JTextArea();
	JButton get = new JButton("Get");
	JButton open = new JButton("Open");
	JTabbedPane tpane;
	
	public NetworkURL( ) {
		super("URL");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		hostname.addActionListener(this);
		get.addActionListener(this);
		open.addActionListener(this);
		
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(new Label("Host Name"));
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(hostname);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(get);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(open);
		p.add(Box.createRigidArea(new Dimension(10,0)));

	    JScrollPane sp1 = new JScrollPane(output_url);
		output_url.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp1.setPreferredSize(new Dimension(300,200));
		
	    JScrollPane sp2 = new JScrollPane(output_open);
		output_open.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp2.setPreferredSize(new Dimension(300,200));

		tpane = new JTabbedPane();
		tpane.addTab("URL", sp1);
		tpane.addTab("OPEN", sp2);
		
		frame.add(p, BorderLayout.NORTH);
		frame.add(tpane, BorderLayout.CENTER);
	}
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == get || e.getSource() == hostname ) {
			tpane.setSelectedIndex(0);
			output_url.setText("");
			try {
				URL url = new URL(hostname.getText());
				output_url.append("Protocol : "+url.getProtocol()+"\n");
				output_url.append("Host Name : "+url.getHost()+"\n");
				output_url.append("Port : "+url.getPort()+"\n");
				output_url.append("Path : "+url.getPath()+"\n");
				output_url.append("File : "+url.getFile()+"\n");
				output_url.append("Query : "+url.getQuery()+"\n");
				output_url.append("Section : "+url.getRef()+"\n");
			} catch(MalformedURLException ex) {
				output_url.append("MalformedURLException : "+hostname.getText()+"\n");
			}
		} else if( e.getSource() == open ) {
			tpane.setSelectedIndex(1);
			output_open.setText("");
			try {
				URL url = new URL(hostname.getText());
				InputStream is = url.openStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String line;
				while( (line = br.readLine()) != null ) {
					output_open.append(line+"\n");
				}
				br.close();
				is.close();
			} catch(MalformedURLException ex) {
				output_open.append("MalformedURLException : "+hostname.getText()+"\n");
			} catch(IOException ex) {
				output_open.append("IOException : "+hostname.getText()+"\n");
			}

		}
	}

	public static void main(String[] args) {
		NetworkURL app = new NetworkURL();
		app.setSize(500,300);
		app.setVisible(true);

	}
	

}
