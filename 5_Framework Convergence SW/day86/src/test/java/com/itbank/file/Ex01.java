package com.itbank.file;

import java.io.File;

import org.junit.Test;

public class Ex01 {

	@Test
	public void test1() {
		// Java에선 File을 처리하기 위해 클래스로 제공 중
		// - 생성자에 파일의 경로를 문자열로 지정 가능
		// - 1. 상대경로는 프로젝트(dya85) 바로 아래가 된다.
		// - 2. 절대경로는 C: D: 같은 드라이브부터 경로를 명시한다.
		File dir1 = new File("FileFolder");
		File dir2 = new File("E:\\FileTest");
		
		System.out.println(dir1.exists());
		System.out.println(dir2.exists());
		
		System.out.println("폴더인가? " + dir1.isDirectory());
		System.out.println("파일인가? " + dir1.isFile());
		System.out.println("크기는? " + dir1.length());
		System.out.println("쓰기가능? " + dir1.canWrite());
		System.out.println("읽기가능? " + dir1.canRead());
		System.out.println("실행가능? " + dir1.canExecute());
		System.out.println("절대경로 : " + dir1.getAbsolutePath());
		System.out.println("상대경로 : " + dir1.getPath());
	}
}
