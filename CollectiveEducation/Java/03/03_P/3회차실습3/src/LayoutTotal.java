import java.awt.*;
public class LayoutTotal extends Frame {

	public LayoutTotal() {
		super("Layout Total");
		setLayout(new BorderLayout());

		// NORTH 
		Panel north = new Panel();
		north.setLayout(new FlowLayout());
		north.add(new Label("�̸�:"));
		north.add(new TextField(10));
		north.add(new Label("����:"));
		Choice gender = new Choice();
		gender.add("Male");
		gender.add("Female");
		north.add(gender);
		add(north, BorderLayout.NORTH);
		
		// CENTER
		Panel center = new Panel();
		center.setLayout(new GridLayout(3,3));
		String[] name = { "�����", "�λ��", "������",
						  "���ֽ�", "�뱸��", "������",
						  "������", "õ�Ƚ�", "��õ��" };
		CheckboxGroup cg = new CheckboxGroup();
		for( String title : name) center.add(new Checkbox(title, false, cg));
		add(center);
				
		// SOUTH
		Panel south = new Panel();
		GridBagLayout gbl = new GridBagLayout();
		south.setLayout(gbl);

		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
				
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		
		Button b1 = new Button("����");
		gbl.setConstraints(b1, gbc);
		south.add(b1);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		
		Button b2 = new Button("���");
		gbl.setConstraints(b2, gbc);
		south.add(b2);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		
		Button b3 = new Button("Ȯ���ϱ�");
		gbl.setConstraints(b3, gbc);
		south.add(b3);

		add(south, BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		LayoutTotal app = new LayoutTotal();
		app.setSize(300,200);
		app.setVisible(true);

	}

}
