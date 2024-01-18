import java.awt.*;
import java.awt.event.*;
public class AwtActionMenu extends Frame implements ActionListener {

	TextArea output;
	
	public AwtActionMenu() {
		super("ActionEvent MenuItem");

		output = new TextArea();
		add(output, BorderLayout.CENTER);
		
		MenuItem open = new MenuItem("Open");
		MenuItem save = new MenuItem("Save");
		MenuItem print = new MenuItem("Print");
		Menu file = new Menu("File");
		file.add(open);
		file.add(save);
		file.add(print);
		MenuBar mb = new MenuBar();
		mb.add(file);
		setMenuBar(mb);
		
		open.addActionListener(this);
		save.addActionListener(this);
		print.addActionListener(this);

		open.setActionCommand("����");
		save.setActionCommand("���̺�");
		print.setActionCommand("����Ʈ");

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}
	public void actionPerformed(ActionEvent e ) {
		MenuItem org = (MenuItem)e.getSource();
		String cmd = org.getActionCommand();
	
		if(cmd.equals("����")) {
			output.append("Open �޴��� ����\n");
		} else if(cmd.equals("���̺�")) {
			output.append("Save �޴��� ����\n");
		} else if(cmd.equals("����Ʈ")) {
			output.append("print �޴��� ����\n");
		}

	}
	public static void main(String[] args) {
		AwtActionMenu app = new AwtActionMenu();
		app.setSize(350,300);
		app.setVisible(true);

	}

}
