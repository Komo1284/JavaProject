// 이미지 출처 : 비즈니스 012 by 한국저작권위원회, 공유마당, CC BY
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SwingTotal extends JFrame implements ActionListener {

	JToolBar bar;
	JTabbedPane tpane;
	JTextArea output = new JTextArea();

	public SwingTotal() {
		super("File Open Test");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		JButton btn1 = new JButton(new ImageIcon("1.png"));
		JButton btn2 = new JButton(new ImageIcon("2.png"));
		JButton btn3 = new JButton(new ImageIcon("3.png"));
		JButton btn4 = new JButton(new ImageIcon("4.png"));
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn1.setActionCommand("Open");
		btn2.setActionCommand("Close");
		btn3.setActionCommand("Save");
		btn4.setActionCommand("Exit");
		btn1.setToolTipText("Open");
		btn2.setToolTipText("Close");
		btn3.setToolTipText("Save");
		btn4.setToolTipText("Exit");
		
		bar = new JToolBar(JToolBar.HORIZONTAL);
		bar.add(btn1);
		bar.add(btn2);
		bar.add(btn3);
		bar.add(btn4);
		bar.setFloatable(false);
		
	    JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(320,200));

		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(sp, BorderLayout.CENTER);
		
		tpane = new JTabbedPane();
		tpane.addTab("Ouput", p);
		
		frame.add(bar,BorderLayout.PAGE_START);
		frame.add(tpane,BorderLayout.CENTER);
		
	}
	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		if( src.getActionCommand().equalsIgnoreCase("Open")) {
			JFileChooser chooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File", "txt", "java");
		    chooser.setFileFilter(filter);
		    int returnVal = chooser.showOpenDialog(this);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		        output.append(chooser.getCurrentDirectory().getAbsolutePath()+"\n");
		        output.append(chooser.getSelectedFile().getName()+"\n");
		    	output.append(chooser.getSelectedFile().getPath()+"\n");

		    	JTextArea openView = new JTextArea();
			    JScrollPane sp = new JScrollPane(openView);
				output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
				sp.setPreferredSize(new Dimension(320,200));

				JPanel p = new JPanel();
				p.setLayout(new BorderLayout());
				p.add(sp, BorderLayout.CENTER);

		    	String fileName = chooser.getSelectedFile().getName();
		    	tpane.addTab(fileName, p);

		    	String filePath = chooser.getSelectedFile().getPath();
		    	fileOpen(filePath, openView);
		    }

		} else if( src.getActionCommand().equalsIgnoreCase("Close")) {
			int index = tpane.getSelectedIndex();
			if( index != 0 ) {

				String title = tpane.getTitleAt(index);
				
				int ret = JOptionPane.showConfirmDialog(this,title+"삭제하시겠습니까?",
						                                title, JOptionPane.OK_CANCEL_OPTION, 
						                                JOptionPane.WARNING_MESSAGE);
				if( ret == JOptionPane.OK_OPTION ) {
					output.append("["+tpane.getTitleAt(index) + "] 탭을 삭제합니다!\n");
					tpane.removeTabAt(index);
				}
			}
			
		} else if( src.getActionCommand().equalsIgnoreCase("Save")) {
			JOptionPane.showMessageDialog(this, "구현해 보시기 바랍니다.!", "저장하기", 
					                     JOptionPane.INFORMATION_MESSAGE);
			
		} else if( src.getActionCommand().equalsIgnoreCase("Exit")) {
			this.setVisible(false);
			this.dispose();
		}
	}
	public void fileOpen(String fname, JTextArea openView) { 
		
		File source = new File(fname);
		String line;
		try {
			FileReader fr = new FileReader(source);
			BufferedReader br = new BufferedReader(fr);
			while( (line=br.readLine()) != null ) {
				openView.append(line+"\n");
			}
			fr.close();
			br.close();
		} catch( Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		SwingTotal app = new SwingTotal();
		app.pack();
		app.setVisible(true);

	}

}
