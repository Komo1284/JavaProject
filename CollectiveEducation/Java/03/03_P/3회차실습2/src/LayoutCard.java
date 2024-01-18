import java.awt.*;
import java.awt.event.*;

public class LayoutCard {

	public static void main(String[] args) {
		
		Frame f = new Frame("CardLayout Test");
		
		CardLayout card = new CardLayout();
		f.setLayout(card);
		
		Panel[] panel = new Panel[5];
		for(int i=0; i<panel.length; i++) {
			panel[i] = new Panel();
			panel[i].add(new Button("Card"+(i+1)));
			f.add(panel[i], "Card"+(i+1));
		}
		
		card.show(f, "Card3");
		//card.first(f);
		//card.last(f);
	
		f.setSize(300,300);
		f.setVisible(true);

		class MouseHandle extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
					card.next(f);
					//card.previous(f);
			}
		}

		for(int i=0; i<panel.length; i++) {
			panel[i].addMouseListener(new MouseHandle());
		}
		
	}

}
