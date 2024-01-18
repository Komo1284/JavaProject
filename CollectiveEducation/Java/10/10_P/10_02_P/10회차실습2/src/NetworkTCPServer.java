import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

public class NetworkTCPServer extends JFrame implements ActionListener {

	ServerSocket server;
	Socket client;
	JTextArea output = new JTextArea();
	JButton start = new JButton("Start");
	
	public NetworkTCPServer( ) {
		super("TCP SERVER");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		start.addActionListener(this);

		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(start);
		frame.add(p, BorderLayout.NORTH);

	    JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(300,200));
		frame.add(sp, BorderLayout.CENTER);

	}
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == start ) {
			
			try {
				server = new ServerSocket(8080);
				client = server.accept();
				
				InputStream is = client.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
				String receive = null;
				while( ( receive = br.readLine() ) == null );

				output.append("읽음 : "+receive+"\n");
				
				client.close();
				server.close();

				output.append("서버 종료\n");
				
			} catch(IOException ex) {
				output.append("서버 시작 실패\n");
			}
			
		} 
	}

	public static void main(String[] args) {
		NetworkTCPServer app = new NetworkTCPServer();
		app.setSize(500,300);
		app.setVisible(true);

	}
	

}
