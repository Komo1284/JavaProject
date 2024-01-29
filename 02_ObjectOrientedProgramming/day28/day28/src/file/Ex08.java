package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex08 {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\FileTest\\test3.exe");
		FileInputStream fis = new FileInputStream(file);
		
		byte[] buf = new byte[100];
		fis.read(buf);

		System.out.println(Arrays.toString(buf));
		fis.close();
	}
}
