import java.awt.*;
public class LayoutGridBag {

	public static void main(String[] args) {
		
		Frame f = new Frame("GridBagLayout Test");
		GridBagLayout gbl = new GridBagLayout();
		f.setLayout(gbl);

		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.BOTH;
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		//gbc.fill = GridBagConstraints.VERTICAL;
		//gbc.fill = GridBagConstraints.NONE;
		
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		//gbc.weightx = 0.0;
		//gbc.weighty = 0.0;

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		
		Button b1 = new Button("버튼1");
		gbl.setConstraints(b1, gbc);
		f.add(b1);
		
		Button b2 = new Button("버튼2");
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbl.setConstraints(b2, gbc);
		f.add(b2);

		Button b3 = new Button("버튼3");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbl.setConstraints(b3, gbc);
		f.add(b3);

		Button b4 = new Button("버튼4");
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbl.setConstraints(b4, gbc);
		f.add(b4);

		f.setSize(300,100);
		f.setVisible(true);

	}

}
