// 이미지 출처 : 비즈니스 012 by 한국저작권위원회, 공유마당, CC BY
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingMenu extends JFrame implements ActionListener, ItemListener {

	JMenuItem open_file, save, save_all, sub_open, sub_save; 
	JRadioButtonMenuItem close_file, close_all;
	JCheckBoxMenuItem reflash, revert;
	JTextArea output = new JTextArea();
	
	public SwingMenu() {
		super("Swing Menu");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		MenuHandler mh = new MenuHandler();
		
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		file.addMenuListener(mh);
		mb.add(file);
		
		open_file = new JMenuItem("Open", KeyEvent.VK_O);
		open_file.addActionListener(this);
		file.add(open_file);
		file.addSeparator();

		save = new JMenuItem("Save", new ImageIcon("1.png"));
		save.addActionListener(this);
		file.add(save);
		
		save_all = new JMenuItem("Save All", new ImageIcon("2.png"));
		save_all.addActionListener(this);
		file.add(save_all);
		file.addSeparator();
		
		ButtonGroup bg = new ButtonGroup();

		close_file = new JRadioButtonMenuItem("Close file", true);
		close_file.addItemListener(this);
		file.add(close_file);
		
		close_all = new JRadioButtonMenuItem("Close all");
		close_all.addItemListener(this);
		file.add(close_all);
		file.addSeparator();
		
		bg.add(close_file);
		bg.add(close_all);
		
		reflash = new JCheckBoxMenuItem("Reflash", true);
		reflash.addItemListener(this);
		file.add(reflash);
		
		revert = new JCheckBoxMenuItem("Revert");
		revert.addItemListener(this);
		file.add(revert);
		
		JMenu sub = new JMenu("Secondary");
		sub.setMnemonic(KeyEvent.VK_S);
		sub.addMenuListener(mh);

		sub_open = new JMenuItem("Open sub");
		sub_open.addActionListener(this);
		sub.add(sub_open);
		
		sub_save = new JMenuItem("Save sub");
		sub_save.addActionListener(this);
		sub.add(sub_save);
		
		file.add(sub);
		
		mb.add(file);
		
		setJMenuBar(mb);
		
		frame.add(new JScrollPane(output));
		
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
		SwingMenu app = new SwingMenu();
		app.setSize(300,350);
		app.setVisible(true);

	}

}
