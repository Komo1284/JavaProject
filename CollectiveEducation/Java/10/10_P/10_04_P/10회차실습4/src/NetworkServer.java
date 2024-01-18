import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

public class NetworkServer extends JFrame implements ActionListener {

	JButton start = new JButton("Start");
	JTextField port = new JTextField();
	
	public NetworkServer( ) {
		super("TCP Multi-SERVER");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		start.addActionListener(this);
		
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.X_AXIS));
		p.add(new JLabel("Port : "));
		p.add(port);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(start);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		
		frame.add(p, BorderLayout.CENTER);

	}
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == start ) {
			int port_num = Integer.parseInt(port.getText());
			try {
				ServerSocket server = new ServerSocket(port_num);
				System.out.println("���� ����");
				while(true) {
					Socket client = server.accept();
					System.out.println("���� ó��");
					
					ClientThread connect = new ClientThread(client);
					connect.start();
				}
				
			} catch(IOException ex) {
				System.out.println("���� ���� ����!\n");
			}
		} 
	}
	
	public class ClientThread extends Thread {
		
		Socket client;
		InputStream is;
		BufferedReader br;
		OutputStream os;
		PrintWriter pw;

		public ClientThread(Socket client) {
			this.client = client;
			try {
				is = client.getInputStream();
				br = new BufferedReader(new InputStreamReader(is));
				os = client.getOutputStream();
				pw = new PrintWriter(os);

			} catch(IOException e) {
				System.out.println("�б� ����!\n");
			}
		}
		public void run() {
			String receive = null; 

			try {
				while(true) {
					
					receive = br.readLine();
					if( receive != null ) {
						pw.println("RE:"+receive);
						pw.flush();
						System.out.println(receive);
						if( receive.equals("STOP") ) break;
					}
				}
				is.close();
				br.close();
				client.close();
				System.out.println("���� ����");
			} catch(IOException ex) {
				System.out.println("�б� ����\n");
			}
		}
	}

	public static void main(String[] args) {
		NetworkServer app = new NetworkServer();
		app.setSize(300,80);
		app.setVisible(true);
	}
	

}
