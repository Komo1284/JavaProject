package com.itbank.file;

import java.io.File;

import org.junit.Test;

public class Ex02 {

	@Test
	public void test2() {
		File dir = new File("FileFolder");
		
		File file = new File(dir, "test1.txt");
		// File file = new File()"fileFolder//test1.txt");
		
		System.out.println("dir 유무? " + dir.exists());
		System.out.println("file 유무? " + file.exists() + "\n");
		
		System.out.println("디렉토리? " + dir.isDirectory());
		System.out.println("파일? " + file.isFile());
		
		for (File f : dir.listFiles()) {
			int dot = f.getName().indexOf(".");
			String ext = f.getName().substring(dot, f.getName().length());
			
			
			System.out.print(f + " - 타입 : ");
			System.out.println(ext);
		}
		
	}
	
}
