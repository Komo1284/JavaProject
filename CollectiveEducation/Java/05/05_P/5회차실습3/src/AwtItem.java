import java.awt.*;
import java.awt.event.*;
public class AwtItem extends Frame implements ItemListener {

	Checkbox black, white, blue;
	Choice option;
	List model;
	CheckboxMenuItem global, local;
	TextArea output;
	
	public AwtItem() {
		super("ItemEvent");

		black = new Checkbox("검정");
		white = new Checkbox("흰색");
		blue = new Checkbox("청색");
		option = new Choice();
		option.add("통풍시트");
		option.add("LED 헤드램프");
		option.add("헤드업 디스플레이");
		option.add("후측방 경고시스템");
		model = new List(4);
		model.add("승용");
		model.add("트럭");
		model.add("버스");
		model.add("SUV");
		model.add("택시");
		model.add("전기차");
		
		MenuBar mb  = new MenuBar();
		Menu car = new Menu("자동차");
		mb.add(car);
		global = new CheckboxMenuItem("Global");
		local = new CheckboxMenuItem("Local");
		car.add(global);
		car.add(local);
		setMenuBar(mb);
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(1,2));
		p1.add(model);
		
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(4,1));
		p2.add(option);
		p2.add(black);
		p2.add(white);
		p2.add(blue);
		p1.add(p2);

		add(p1,BorderLayout.NORTH);
		
		output = new TextArea();
		add(output, BorderLayout.CENTER);
		
		black.addItemListener(this);
		white.addItemListener(this);
		blue.addItemListener(this);
		option.addItemListener(this);
		model.addItemListener(this);
		global.addItemListener(this);
		local.addItemListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}
	public void itemStateChanged(ItemEvent e ) {
		Object src = e.getSource();
		if( src == model ) {
			List list = (List)src;
			output.append("[List] "+list.getSelectedIndex()+
				      " : "+list.getSelectedItem()+"\n");
			//output.append("[List] "+model.getSelectedIndex()+
			//		      " : "+model.getSelectedItem()+"\n");
		} else if( src == option ) {
			//Choice choice = (Choice)src;
			//output.append("[Choice] "+choice.getSelectedIndex()+
			//	      " : "+choice.getSelectedItem()+"\n");
			output.append("[Choice] "+option.getSelectedIndex()+
					      " : "+option.getSelectedItem()+"\n");
		} else if (src == black || src == white || src == blue ) {
			output.append("[Checkbox] "+e.getItem());
			if( e.getStateChange() == ItemEvent.SELECTED)
				 output.append(" : SELECTED\n");
			else output.append(" : DESELECTED\n");
		} else if( src == global || src == local ) {
			output.append("[CheckboxMenuItem] "+e.getItem());
			if( e.getStateChange() == ItemEvent.SELECTED)
				 output.append(" : SELECTED\n");
			else output.append(" : DESELECTED\n");
		}
	}
	public static void main(String[] args) {
		AwtItem app = new AwtItem();
		//app.setSize(350,200);
		app.pack();
		app.setVisible(true);

	}

}
