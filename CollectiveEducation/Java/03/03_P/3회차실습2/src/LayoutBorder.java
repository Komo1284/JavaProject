import java.awt.*;
public class LayoutBorder {

	public static void main(String[] args) {
		
		Frame f = new Frame("BorderLayout Test");
		f.setLayout(new BorderLayout());
		
		
		f.add(new Button("µ¿"),BorderLayout.EAST);
		f.add(new Button("¼­"),BorderLayout.WEST);
		f.add(new Button("³²"),BorderLayout.SOUTH);
		f.add(new Button("ºÏ"),BorderLayout.NORTH);
		f.add(new Button("Áß¾Ó"),BorderLayout.CENTER);
/*
		f.add(new Button("µ¿"),"East");
		f.add(new Button("¼­"),"West");
		f.add(new Button("³²"),"South");
		f.add(new Button("ºÏ"),"North");
		f.add(new Button("Áß¾Ó"),"Center");
*/
/*
		f.add("East", new Button("µ¿"));
		f.add("West", new Button("¼­"));
		f.add("South", new Button("³²"));
		f.add("North", new Button("ºÏ"));
		f.add("Center", new Button("Áß¾Ó"));
*/
		f.setSize(300,300);
		f.setVisible(true);

	}

}
