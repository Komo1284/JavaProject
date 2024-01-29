package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) throws IOException {
		// 보조 스트림을 활용한 속도 개선
		File src = new File("E:\\FileTest\\jdk-8u381-windows-x64.exe");
		File dst = new File("E:\\FileTest\\copy.exe");
		
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dst);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		
		while ((data = bis.read()) != -1) {
			bos.write(data);
		}
		
		System.out.println("복사 완료");
		
		bis.close();
		bos.close();
	}
}
