import java.awt.*;
import java.awt.event.*;

public class AwtMenu extends Frame {

	AwtMenu() {
		super("풀다운(pull-down) 메뉴");

		MenuBar mb = new MenuBar();
		Menu file = new Menu("File");
		mb.add(file);
		
		MenuItem newmenu = new MenuItem("New");
		MenuItem open = new MenuItem("Open", new MenuShortcut(KeyEvent.VK_O, false));
		MenuItem close = new MenuItem("Close", new MenuShortcut(KeyEvent.VK_C, true));
		CheckboxMenuItem save = new CheckboxMenuItem("Save", true);
		CheckboxMenuItem print = new CheckboxMenuItem("Print", false);
		
		Menu recent = new Menu("Recent");
		MenuItem check = new MenuItem("Check");
		MenuItem verify = new MenuItem("Verify");
		recent.add(check);
		recent.add(verify);
		
		file.add(newmenu);
		file.add(open);
		file.add(close);
		file.add(recent);
		file.addSeparator();
		file.add(save);
		file.add(print);
		
		Menu edit = new Menu("Edit");
		Menu help = new Menu("Help");
		
		mb.add(edit);
		mb.add(help);
		
		setMenuBar(mb);
				
	}
	public static void main(String[] args) {
		AwtMenu ab = new AwtMenu();
		ab.setSize(350,250);
		ab.setVisible(true);

	}

}

