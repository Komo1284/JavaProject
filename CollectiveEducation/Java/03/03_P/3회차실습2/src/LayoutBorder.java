import java.awt.*;
public class LayoutBorder {

	public static void main(String[] args) {
		
		Frame f = new Frame("BorderLayout Test");
		f.setLayout(new BorderLayout());
		
		
		f.add(new Button("��"),BorderLayout.EAST);
		f.add(new Button("��"),BorderLayout.WEST);
		f.add(new Button("��"),BorderLayout.SOUTH);
		f.add(new Button("��"),BorderLayout.NORTH);
		f.add(new Button("�߾�"),BorderLayout.CENTER);
/*
		f.add(new Button("��"),"East");
		f.add(new Button("��"),"West");
		f.add(new Button("��"),"South");
		f.add(new Button("��"),"North");
		f.add(new Button("�߾�"),"Center");
*/
/*
		f.add("East", new Button("��"));
		f.add("West", new Button("��"));
		f.add("South", new Button("��"));
		f.add("North", new Button("��"));
		f.add("Center", new Button("�߾�"));
*/
		f.setSize(300,300);
		f.setVisible(true);

	}

}
