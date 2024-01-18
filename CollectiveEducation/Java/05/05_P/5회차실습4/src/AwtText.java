import java.awt.*;
import java.awt.event.*;
public class AwtText extends Frame implements TextListener {

	TextField input;
	TextArea output;
	
	public AwtText() {
		super("TextEvent");

		input = new TextField();
		output = new TextArea();

		add(input,BorderLayout.NORTH);
		add(output, BorderLayout.CENTER);
		
		input.addTextListener(this);
		output.addTextListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}
	public void textValueChanged(TextEvent e ) {
		Object src = e.getSource();
		if( src == input ) {
			output.append(input.getText()+"\n");
		} else if( src == output ) {
			System.out.println("이벤트 발생!!");
		}
	}
	public static void main(String[] args) {
		AwtText app = new AwtText();
		//app.setSize(350,200);
		app.pack();
		app.setVisible(true);

	}

}
