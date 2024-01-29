package file;

import java.io.File;

/*
	file : 파일
	- 디스크에 저장되는 데이터
	- 디스크라는 컴퓨터 보조 저장 장치에 데이터가 영구적으로 저장된 형태
	
	directory : 디렉토리
	- 다른 파일을 모아서 저장하는 특수 파일
	- 윈도우의 폴더와 같은 개념
*/

public class Ex01 {
	public static void main(String[] args) {
		// Java에서는 File이라는 객체로 파일을 처리할 수 있다
		File f1 = new File("E:\\FileTest");
		
		System.out.println("f1 = " + f1);
		System.out.println("파일인가? " + f1.isFile());
		System.out.println("디렉토리인가? " + f1.isDirectory() + "\n");
		
		System.out.println("읽기 가능? " + f1.canRead());
		System.out.println("쓰기 가능? " + f1.canWrite());
		System.out.println("실행 가능? " + f1.canExecute());
		
		f1.delete();
		System.out.println("\n삭제 되었습니다");
		
		f1.mkdir();
		
	}
}
