import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

public class NetworkTCPMultiClient extends JFrame implements ActionListener {

	Socket server;
	OutputStream os;
	PrintWriter pw;
	InputStream is;
	BufferedReader br;

	JTextField text = new JTextField();
	JTextArea output = new JTextArea();
	JButton connect = new JButton("Connect");
	JButton disconnect = new JButton("Disconnect");
	
	public NetworkTCPMultiClient( ) {
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
		
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(text);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(connect);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(disconnect);
		p.add(Box.createRigidArea(new Dimension(10,0)));

		frame.add(p, BorderLayout.SOUTH);

	}
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == connect ) {
			
			try {
				server = new Socket("localhost", 8080);

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
		NetworkTCPMultiClient app = new NetworkTCPMultiClient();
		app.setSize(500,300);
		app.setVisible(true);

	}
	

}
