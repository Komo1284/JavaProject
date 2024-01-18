import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.filechooser.*;

public class SwingChooser extends JFrame implements ActionListener {

	JButton open, save, color;
	JTextArea output = new JTextArea();
	
	public SwingChooser() {
		super("JFileCooser, JColorChooser");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();

		open = new JButton("File Open");
		open.addActionListener(this);
		save = new JButton("File Save");
		save.addActionListener(this);
		color = new JButton("Color Chooser");
		color.addActionListener(this);
		
		JPanel p = new JPanel();
		p.add(open);
		p.add(save);
		p.add(color);

	    JScrollPane sp = new JScrollPane(output);
		output.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		sp.setPreferredSize(new Dimension(300,200));

		frame.add(p, BorderLayout.NORTH);
		frame.add(sp, BorderLayout.CENTER);
		
	}
	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton)e.getSource();
		if( src == open ) {
			JFileChooser chooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File", "txt", "java");
		    chooser.setFileFilter(filter);
		    int returnVal = chooser.showOpenDialog(this);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		        output.append(chooser.getCurrentDirectory().getAbsolutePath()+"\n");
		        output.append(chooser.getSelectedFile().getName()+"\n");
		    	output.append(chooser.getSelectedFile().getPath()+"\n");
		    	fileOpen(chooser.getSelectedFile().getPath());
		    }
		} else if( src == save ) {
			JFileChooser chooser = new JFileChooser();
			chooser.setCurrentDirectory(new File("C:\\"));
			chooser.setSelectedFile(new File("aaa.txt"));
		    int returnVal = chooser.showSaveDialog(this);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		        output.append(chooser.getCurrentDirectory().getAbsolutePath()+"\n");
		        output.append(chooser.getSelectedFile().getName()+"\n");
		    	output.append(chooser.getSelectedFile().getPath()+"\n");
		    	fileSave(chooser.getSelectedFile().getPath());
		    }
		} else if( src == color ) {
			Color select = JColorChooser.showDialog(this, "Background Color", output.getForeground());
			output.setBackground(select);
		}
	}
	public void fileOpen(String fname) { 
	
		File source = new File(fname);
		String line;
		try {
			FileReader fr = new FileReader(source);
			BufferedReader br = new BufferedReader(fr);
			while( (line=br.readLine()) != null ) {
				output.append(line+"\n");
			}
			fr.close();
			br.close();
		} catch( Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void fileSave(String fname) { 
		try {
			PrintWriter pw = new PrintWriter(fname);
			pw.println(output.getText());
			pw.flush();
			pw.close();
		} catch( Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		SwingChooser app = new SwingChooser();
		app.setSize(350,300);
		app.setVisible(true);
	}

}
