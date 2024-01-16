import java.awt.*;
public class AwtList extends Frame {

	AwtList() {
		super("List Å¬·¡½º");
		setLayout(new FlowLayout());
		
		List c1 = new List(3);
		
		c1.add("Melon");
		c1.add("Apple");
		c1.add("Banana");
		c1.add("Cherry");
		c1.add("Strawberry",2);
		
		c1.select(1);
		c1.select(2);
		
		System.out.println(c1.getSelectedIndex()+":"+c1.getSelectedItem());
		
		List c2 = new List(3, true);

		c2.add("Melon");
		c2.add("Apple");
		c2.add("Banana");
		c2.add("Cherry");
		
		c2.select(1);
		c2.select(2);
		
		for( int index : c2.getSelectedIndexes()) 
			System.out.println(index);
		
		for( String item : c2.getSelectedItems()) 
			System.out.println(item);

		add(c1);
	    add(c2);
	}
	public static void main(String[] args) {
		AwtList ab = new AwtList();
		ab.setSize(300,200);
		ab.setVisible(true);

	}

}
