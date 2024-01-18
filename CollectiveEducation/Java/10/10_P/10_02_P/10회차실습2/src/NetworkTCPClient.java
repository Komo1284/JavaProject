import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

public class NetworkTCPClient extends JFrame implements ActionListener {

	Socket server;
	JTextField text = new JTextField();
	JTextArea output = new JTextArea();
	JButton start = new JButton("Start");
	
	public NetworkTCPClient( ) {
		super("TCP CLIENT");
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
		if( e.getSource() == start || e.getSource() == text ) {
			
			try {
				output.append("서버 접속 시도\n");
				server = new Socket("localhost", 8080);
				output.append("접속 성공\n");

				OutputStream os = server.getOutputStream();
				PrintWriter pw = new PrintWriter(os);
				pw.println(text.getText());
				pw.flush();
				
				server.close();
				output.append("클라이언트 종료\n");

			} catch(Exception ex2) {
				output.append("클라이언트 시작 실패\n");
			}
		}
	}

	public static void main(String[] args) {
		NetworkTCPClient app = new NetworkTCPClient();
		app.setSize(500,300);
		app.setVisible(true);

	}
	

}
