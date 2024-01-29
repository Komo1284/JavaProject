package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
	입출력 보조 스트림
	- 입출력을 좀 더 효율적으로 돕는 객체
	
	바이트 단위		: BufferedInputStream, BufferedOutputStream
	문자 단위 		: BufferedReader, BufferedWriter
*/

public class Ex03 {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("E:\\FileTest\\test1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		// readLine()은 문서의 마지막 줄에 도달하면 null을 반환
		// 이를 활용해서 문서 전체를 읽어올 수 있다
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}
}
