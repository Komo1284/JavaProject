import java.awt.*;
public class ConFileDialog {

	public static void main(String[] args) {
		
		Frame f = new Frame("FileDialog Test");
		f.setVisible(true);
		/*
		FileDialog load = new FileDialog(f, "���� �ҷ�����", FileDialog.LOAD);
		
		load.setVisible(true);
		
		System.out.println("Folder : "+ load.getDirectory());
		System.out.println("File : "+ load.getFile());
		*/
		FileDialog save = new FileDialog(f, "���� �����ϱ�", FileDialog.SAVE);

		save.setDirectory("C:\\Program Files");
		save.setFile("java.txt");
		
		save.setVisible(true);
		

	}

}
