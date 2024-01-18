import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

public class NetworkClient extends JFrame implements ActionListener {

	Socket server;
	OutputStream os;
	PrintWriter pw;
	InputStream is;
	BufferedReader br;

	JTextField text = new JTextField();
	JTextArea output = new JTextArea();
	JButton connect = new JButton("Connect");
	JButton disconnect = new JButton("Disconnect");
	JTextField host = new JTextField();
	JTextField port = new JTextField();
	
	public NetworkClient( ) {
		super("TCP CLIENT");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		text.addActionListener(this);
		connect.addActionListener(this);
		disconnect.addActionListener(this);
		
	    JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(300,200));
		frame.add(sp, BorderLayout.CENTER);

		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(new JLabel("Host : "));
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(host);
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(new JLabel("Port : "));
		p1.add(Box.createRigidArea(new Dimension(10,0)));
		p1.add(port);
		p1.add(Box.createRigidArea(new Dimension(10,0)));

		JPanel p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(text);
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(connect);
		p2.add(Box.createRigidArea(new Dimension(10,0)));
		p2.add(disconnect);
		p2.add(Box.createRigidArea(new Dimension(10,0)));

		frame.add(p1, BorderLayout.NORTH);
		frame.add(p2, BorderLayout.SOUTH);

	}
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == connect ) {
			int port_num = Integer.parseInt(port.getText());
			try {
				server = new Socket(host.getText(), port_num);

				os = server.getOutputStream();
				pw = new PrintWriter(os);
				is = server.getInputStream();
				br = new BufferedReader(new InputStreamReader(is));
				
				output.append("접속 성공\n");
				
			} catch(Exception ex2) {
				output.append("접속 실패\n");
			}
			
		} else if( e.getSource() == disconnect ) {
			try {
				pw.println("STOP");
				pw.flush();
				server.close();
				output.append("접속 종료\n");
			} catch(IOException ex3) {
				output.append("접속 종료 실패\n");
			}
		} else if( e.getSource() == text ) {
			pw.println(text.getText());
			pw.flush();
			
			try {
				String receive = null;
				while( (receive = br.readLine()) == null);
				output.append(receive+"\n");
				
			} catch(IOException ex3) {
				output.append("데이터 전송 실패\n");
			}
			text.setText("");
		}
	}

	public static void main(String[] args) {
		NetworkClient app = new NetworkClient();
		app.setSize(500,300);
		app.setVisible(true);

	}
	

}
