import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

public class NetworkUDPServer extends JFrame implements ActionListener {

	JButton start = new JButton("Start");
	
	public NetworkUDPServer( ) {
		super("UDP SERVER");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		start.addActionListener(this);
		frame.add(start, BorderLayout.CENTER);

	}
	
	public void actionPerformed(ActionEvent e) {

		byte[] data = new byte[512];
			
		try {
			DatagramSocket socket = new DatagramSocket(8000);
			System.out.println("UDP ���� ����! (8000)");
			while(true) {
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				String receive = new String(packet.getData(),0,packet.getLength());
				System.out.println("���� : "+receive);
				if( receive.equals("STOP") ) break;
			}
			socket.close();
		} catch(SocketException ex) {
			System.out.println("���� ���� ����!\n");
		} catch(IOException ex) {
			System.out.println("��Ŷ ���� ����\n");
		}
		
		 
	}

	public static void main(String[] args) {
		NetworkUDPServer app = new NetworkUDPServer();
		app.setSize(300,100);
		app.setVisible(true);

	}
	

}
