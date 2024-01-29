package file;

import java.io.FileWriter;
import java.io.IOException;

/*
	입출력 : 컴퓨터에 데이터를 입력 및 출력하는 것
	1. 표준 입출력 : 콘솔을 통해서 데이터를 입출력
	2. 파일 입출력 : 디스크에 저장된 파일에서 데이터를 입출력
	
	※ 입출력의 기준은 프로그램이다
	- 프로그램에서 데이터가 나온다 -> 출력
	- 프로그램으로 데이터가 들어간다 <- 입력
	
	파일 출력 : 파일에 쓰기
	파일 입력 : 파일에서 읽기

	프로그램 -> 파일 (= 출력, 쓰기) 
	프로그램 <- 파일 (= 입력, 읽기)
*/

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// 파일 출력
		FileWriter fw = new FileWriter("E:\\FileTest\\test1.txt");
		
		fw.write("Hello World!!!\n");
		fw.write("파일 출력 테스트 입니다");
		
		System.out.println("파일 출력 완료");
		
		fw.close();
	}
}
