import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

public class NetworkUDPClient extends JFrame implements ActionListener {

	Socket server;
	JTextField text = new JTextField();
	JTextArea output = new JTextArea();
	JButton start = new JButton("Start");
	
	public NetworkUDPClient( ) {
		super("UDP CLIENT");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		text.addActionListener(this);
		start.addActionListener(this);
		
	    JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(300,200));
		frame.add(sp, BorderLayout.CENTER);
		
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(text);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(start);
		p.add(Box.createRigidArea(new Dimension(10,0)));

		frame.add(p, BorderLayout.SOUTH);

	}
	public void actionPerformed(ActionEvent e) {

		try {
			
			byte[] data = new byte[512];
			DatagramSocket socket = new DatagramSocket();
			
			data = text.getText().getBytes();
			DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("localhost"), 8000);
			socket.send(packet);
			output.append("송신 : "+text.getText()+"\n");
			socket.close();
			
			text.setText("");
			
		} catch(SocketException ex) {
			output.append("소켓 생성 실패!\n");
		} catch(IOException ex) {
			output.append("패킷 송신 실패\n");
		}
		
	}

	public static void main(String[] args) {
		NetworkUDPClient app = new NetworkUDPClient();
		app.setSize(500,300);
		app.setVisible(true);

	}
	

}
