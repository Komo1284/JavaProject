import java.awt.*;
public class AwtCheckbox extends Frame {

	AwtCheckbox() {
		super("Checkbox Å¬·¡½º");
		setLayout(new GridLayout(6,1));
		
		Checkbox c1 = new Checkbox("Melon", true);
		Checkbox c2 = new Checkbox("Apple");
		Checkbox c3 = new Checkbox("Banana");

		if( c1.getState() ) c1.setState(false);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox c4 = new Checkbox("Strawberry", true, group);
		Checkbox c5 = new Checkbox("Mango", false, group);
		Checkbox c6 = new Checkbox("Cherry", false, group);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
	}
	public static void main(String[] args) {
		AwtCheckbox ab = new AwtCheckbox();
		ab.setSize(300,200);
		ab.setVisible(true);

	}

}
