package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\FileTest\\test3.exe");
		FileOutputStream fos = new FileOutputStream(file);
		
		String msg = "안녕하세요";
		
		fos.write(msg.getBytes());
		System.out.println("파일 출력 완료");
		
		fos.close();
	}
}
