// 이미지 출처 : 비즈니스 012 by 한국저작권위원회, 공유마당, CC BY
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingPopup extends JFrame implements ActionListener, ItemListener {

	JPopupMenu popup;
	JMenuItem open_file, save, save_all, sub_open, sub_save; 
	JRadioButtonMenuItem close_file, close_all;
	JCheckBoxMenuItem reflash, revert;
	JTextArea output = new JTextArea();
	
	public SwingPopup() {
		super("Swing Popup");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		popup = new JPopupMenu();

		MenuHandler mh = new MenuHandler();
		
		open_file = new JMenuItem("Open", KeyEvent.VK_O);
		open_file.addActionListener(this);
		popup.add(open_file);
		popup.addSeparator();

		save = new JMenuItem("Save", new ImageIcon("1.png"));
		save.addActionListener(this);
		popup.add(save);
		
		save_all = new JMenuItem("Save All", new ImageIcon("2.png"));
		save_all.addActionListener(this);
		popup.add(save_all);
		popup.addSeparator();
		
		ButtonGroup bg = new ButtonGroup();

		close_file = new JRadioButtonMenuItem("Close file", true);
		close_file.addItemListener(this);
		popup.add(close_file);
		
		close_all = new JRadioButtonMenuItem("Close all");
		close_all.addItemListener(this);
		popup.add(close_all);
		popup.addSeparator();
		
		bg.add(close_file);
		bg.add(close_all);
		
		reflash = new JCheckBoxMenuItem("Reflash", true);
		reflash.addItemListener(this);
		popup.add(reflash);
		
		revert = new JCheckBoxMenuItem("Revert");
		revert.addItemListener(this);
		popup.add(revert);
		
		JMenu sub = new JMenu("Secondary");
		sub.setMnemonic(KeyEvent.VK_S);
		sub.addMenuListener(mh);

		sub_open = new JMenuItem("Open sub");
		sub_open.addActionListener(this);
		sub.add(sub_open);
		
		sub_save = new JMenuItem("Save sub");
		sub_save.addActionListener(this);
		sub.add(sub_save);
		
		popup.add(sub);
		
		output.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				if( e.isPopupTrigger() ) {
					popup.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});

		frame.add(output, BorderLayout.CENTER);
	}
	public void actionPerformed(ActionEvent e) {
		JMenuItem src = (JMenuItem)e.getSource();
		output.append("["+src.getText()+"]\n");
	}
	public void itemStateChanged(ItemEvent e) {
		JMenuItem src = (JMenuItem)e.getSource();
		if( e.getStateChange() == ItemEvent.SELECTED ) {
			output.append("["+src.getText()+"] SELECTED\n");
		} else {
			output.append("["+src.getText()+"] DESELECTED\n");
		}
	}
	class MenuHandler implements MenuListener {
		public void menuCanceled(MenuEvent e) {
			JMenu src = (JMenu)e.getSource();
			output.append("["+src.getText()+"] Canceled\n");
		}
		public void menuDeselected(MenuEvent e) {
			JMenu src = (JMenu)e.getSource();
			output.append("["+src.getText()+"] DeSelected\n");
		}
		public void menuSelected(MenuEvent e) {
			JMenu src = (JMenu)e.getSource();
			output.append("["+src.getText()+"] Selected\n");
		}
	}
	
	public static void main(String[] args) {
		SwingPopup app = new SwingPopup();
		app.setSize(300,350);
		app.setVisible(true);

	}

}
