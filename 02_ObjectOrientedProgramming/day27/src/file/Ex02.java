package file;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("E:\\FileTest");
		
		if(!f1.exists()) {
			f1.mkdir();
			System.out.println("폴더 생성");
		}
		
		File f2 = new File(f1,"test1.txt");
		
		if (!f2.exists()) {
			f2.createNewFile();
			System.out.println("새 파일 생성");
		}
		
	}
}
