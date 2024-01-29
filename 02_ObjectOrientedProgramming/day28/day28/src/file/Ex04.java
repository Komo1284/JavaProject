package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		File dir = new File("E:\\FileTest2");
		File file = new File(dir, "test2.txt");
		
		if (dir.exists() == false) {
			dir.mkdir();
		}
		
		// 단순히 문자열로 Writer의 경로를 지정해도 되지만, file 객체를 활용하는 것이 권장됨
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("보조 스트림을 활용한 출력 입니다\n");
		bw.write("반갑습니다~");
		
		System.out.println("출력 종료");
		bw.close();
	}
}
