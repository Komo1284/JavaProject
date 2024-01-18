import java.awt.*;

public class ConScrollPane extends Frame {

	ConScrollPane() {
		super("ScrollPanel Test");
		setLayout(new GridLayout(1,3));
		
		ScrollPane sp1 = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		Panel p1 = new Panel();
		for(int i=0; i<5; i++) p1.add(new Button("버튼"+i));
		sp1.add(p1);
		
		ScrollPane sp2 = new ScrollPane(ScrollPane.SCROLLBARS_NEVER);
		Panel p2 = new Panel();
		for(int i=0; i<5; i++) p2.add(new Button("버튼"+i));
		sp2.add(p2);
		
		ScrollPane sp3 = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
		Panel p3 = new Panel();
		for(int i=0; i<5; i++) p3.add(new Button("버튼"+i));
		sp3.add(p3);
		
		add(sp1);
		add(sp2);
		add(sp3);
		
	}
	
	public static void main(String[] args) {

		ConScrollPane app = new ConScrollPane();
		app.setSize(500,200);
		app.setVisible(true);

	}

}
