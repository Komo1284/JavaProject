import java.awt.*;
public class AwtChoice extends Frame {

	AwtChoice() {
		super("Checkbox Å¬·¡½º");
		setLayout(new FlowLayout());
		
		Choice c = new Choice();
		
		c.add("Melon");
		c.add("Apple");
		c.add("Cherry");
		c.add("Banana");

		c.remove(2);
		c.remove("Banana");
		
		c.insert("Banana", 1);
		c.insert("Cherry", 1);
		
		c.select(2);
		String select = c.getSelectedItem();
		int position = c.getSelectedIndex();
		System.out.println(position+":"+select);
		
		add(c);
	}
	public static void main(String[] args) {
		AwtChoice ab = new AwtChoice();
		ab.setSize(300,200);
		ab.setVisible(true);

	}

}
