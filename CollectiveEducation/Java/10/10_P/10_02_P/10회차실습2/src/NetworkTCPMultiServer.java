import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

public class NetworkTCPMultiServer extends JFrame implements ActionListener {

	JButton start = new JButton("Start");
	JButton stop = new JButton("Stop");
	
	public NetworkTCPMultiServer( ) {
		super("TCP Multi-SERVER");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		start.addActionListener(this);
		frame.add(start, BorderLayout.CENTER);

	}
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == start ) {
			try {
				ServerSocket server = new ServerSocket(8080);
				System.out.println("서버 시작");
				while(true) {
					Socket client = server.accept();
					System.out.println("접속 처리");
					
					ClientThread connect = new ClientThread(client);
					connect.start();
				}
				
			} catch(IOException ex) {
				System.out.println("서버 시작 실패!\n");
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
				System.out.println("읽기 실패!\n");
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
				System.out.println("접속 종료");
			} catch(IOException ex) {
				System.out.println("읽기 실패\n");
			}
		}
	}

	public static void main(String[] args) {
		NetworkTCPMultiServer app = new NetworkTCPMultiServer();
		app.setSize(300,100);
		app.setVisible(true);
	}
	

}
