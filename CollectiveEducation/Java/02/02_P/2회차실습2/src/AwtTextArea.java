import java.awt.*;
public class AwtTextArea extends Frame {

	AwtTextArea() {
		super("TextArea 클래스");
		setLayout(new GridLayout(1,2));

		TextArea t1 = new TextArea();
		TextArea t2 = new TextArea("안녕하세요", 5, 10, TextArea.SCROLLBARS_BOTH);
		
		t1.append("Java Application!!\n");
		t1.append("Java Application!!\n");
		t1.insert("JAVA\n", 19);
		t1.replaceRange("JAVA",0,4);
		
		add(t1);
		add(t2);
				
	}
	public static void main(String[] args) {
		AwtTextArea ab = new AwtTextArea();
		ab.setSize(300,200);
		ab.setVisible(true);

	}

}

