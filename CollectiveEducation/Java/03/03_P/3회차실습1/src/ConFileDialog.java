import java.awt.*;
public class ConFileDialog {

	public static void main(String[] args) {
		
		Frame f = new Frame("FileDialog Test");
		f.setVisible(true);
		/*
		FileDialog load = new FileDialog(f, "파일 불러오기", FileDialog.LOAD);
		
		load.setVisible(true);
		
		System.out.println("Folder : "+ load.getDirectory());
		System.out.println("File : "+ load.getFile());
		*/
		FileDialog save = new FileDialog(f, "파일 저장하기", FileDialog.SAVE);

		save.setDirectory("C:\\Program Files");
		save.setFile("java.txt");
		
		save.setVisible(true);
		

	}

}
