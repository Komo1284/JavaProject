// 이미지 출처 : 비즈니스 012 by 한국저작권위원회, 공유마당, CC BY
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingOptionPane extends JFrame implements ActionListener {

	String[] msg_data = { "ERROR", "INFORMATION", "WARNING", "QUESTION", "PLANE" };
	String[] option_data = { "DEFAULT", "YES_NO", "YES_NO_CANCEL", "OK_CANCEL" };
	int[] msg_type = { JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
			           JOptionPane.WARNING_MESSAGE, JOptionPane.QUESTION_MESSAGE,
			           JOptionPane.PLAIN_MESSAGE };
	int[] option_type = { JOptionPane.DEFAULT_OPTION, JOptionPane.YES_NO_OPTION,
	                      JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION };
	int[] return_value = { JOptionPane.DEFAULT_OPTION, JOptionPane.YES_NO_OPTION,
						   JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION };
	JList<String> msg_list, option_list;
	JButton msg_show, confirm_show, input_show, option_show;
	JLabel output = new JLabel("..", JLabel.CENTER);
		
	public SwingOptionPane() {
		super("JOptionPane");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		msg_list = new JList<String>(msg_data);
		option_list = new JList<String>(option_data);
		msg_list.setVisibleRowCount(3);
		option_list.setVisibleRowCount(3);
		msg_list.setSelectedIndex(0);
		option_list.setSelectedIndex(0);
		msg_show = new JButton("Show MessageDialog");
		confirm_show = new JButton("Show ConfirmDialog");
		input_show = new JButton("Show InputDialog");
		option_show = new JButton("Show OptionDialog");
		
		msg_show.addActionListener(this);
		confirm_show.addActionListener(this);
		input_show.addActionListener(this);
		option_show.addActionListener(this);

		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		p1.add(Box.createRigidArea(new Dimension(0,10)));
		p1.add(new JScrollPane(msg_list));
		p1.add(Box.createRigidArea(new Dimension(0,10)));
		p1.add(new JScrollPane(option_list));
		p1.add(Box.createRigidArea(new Dimension(0,10)));

		JPanel p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		p2.add(Box.createRigidArea(new Dimension(0,10)));
		p2.add(msg_show);
		p2.add(Box.createRigidArea(new Dimension(0,10)));
		p2.add(confirm_show);
		p2.add(Box.createRigidArea(new Dimension(0,10)));
		p2.add(input_show);
		p2.add(Box.createRigidArea(new Dimension(0,10)));
		p2.add(option_show);
		p2.add(Box.createRigidArea(new Dimension(0,10)));
		
		JPanel p3 = new JPanel();
		p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
		p3.add(Box.createRigidArea(new Dimension(10,0)));
		p3.add(p1);
		p3.add(Box.createRigidArea(new Dimension(10,0)));
		p3.add(p2);
		p3.add(Box.createRigidArea(new Dimension(10,0)));
		
		frame.add(p3, BorderLayout.CENTER);
		frame.add(output, BorderLayout.PAGE_END);
			
	}
	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		if( src == msg_show ) {
				
			int index = msg_list.getSelectedIndex();
			int msgType = msg_type[index];
			String title = (String)msg_list.getSelectedValue();
			String message = "Java Programming";

			JOptionPane.showMessageDialog(this, message, title, msgType);
				
		} else if( src == confirm_show ) {
				
			int index_msg = msg_list.getSelectedIndex();
			int msgType = msg_type[index_msg];
			int index_option = option_list.getSelectedIndex();
			int optionType = option_type[index_option];
			String title = (String)msg_list.getSelectedValue();
			title += ","+(String)option_list.getSelectedValue();
			String message = "Java Programming";

			int ret = JOptionPane.showConfirmDialog(this, message, title, optionType, msgType);
			showReturn(ret);
				
		} else if( src == input_show ) {

			int index = msg_list.getSelectedIndex();
			int msgType = msg_type[index];
			String title = (String)msg_list.getSelectedValue();
			String message = "Java Programming";
			String text = JOptionPane.showInputDialog(this, message, title, msgType);
			output.setText("Input : "+text);
			
		} else if( src == option_show ) {
			
			int index_msg = msg_list.getSelectedIndex();
			int msgType = msg_type[index_msg];
			int index_option = option_list.getSelectedIndex();
			int optionType = option_type[index_option];
			String title = (String)msg_list.getSelectedValue();
			title += ","+(String)option_list.getSelectedValue();
			String message = "Java Programming";
			Object[] options = { "Yes....", "No....", "Others....", "Other" };
			int ret = JOptionPane.showOptionDialog(this, message, title, optionType, msgType,
					                              new ImageIcon("1.png"), options, options[1]);
			showReturn(ret);
		}
	}
	void showReturn(int ret) {
		String text = "";
		switch(ret) {
		case JOptionPane.YES_OPTION :  // == JOptionPane.OK_OPTION
			text = "RETURN [ YES or OK ]";
			break;
		case JOptionPane.NO_OPTION :
			text = "RETURN [ NO ]";
			break;
		case JOptionPane.CANCEL_OPTION :
			text = "RETURN [ CANCEL ]";
			break;
		case JOptionPane.CLOSED_OPTION :
			text = "RETURN [ CLOSED ]";
			break;
		default : text = Integer.toString(ret);
		 	break;
		}
		output.setText(text);
	}
	public static void main(String[] args) {
		SwingOptionPane app = new SwingOptionPane();
		app.pack();
		app.setVisible(true);

	}

}
