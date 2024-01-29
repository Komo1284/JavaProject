package quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Controller {
	private Scanner std = new Scanner(System.in);
	Scanner fileOut;
	private LinkedList<Student> stus = new LinkedList<Student>();
	
	private void showMenu() {
		System.out.println("1. 학생 목록");
		System.out.println("2. 학생 정보 추가");
		System.out.println("3. 학생 정보 수정");
		System.out.println("4. 학생 정보 삭제");
		System.out.println("5. 저장");
		System.out.println("6. 불러오기");
		System.out.println("0. 종료");
		
		System.out.print("\n>>> ");
	}
	
	private void showStus() {
		System.out.println("이름   국   영   수");
		System.out.println("-------------");
		
		for (int i = 0; i < stus.size(); i++) {
			System.out.println(stus.get(i));
		}
	}
	
	private void addStu() {
		String name;
		int kor, eng, mat;
		
		System.out.print("이름 : ");
		name = std.next();
		
		System.out.print("국 영 수 : ");
		kor = std.nextInt();
		eng = std.nextInt();
		mat = std.nextInt();
		
		stus.add(new Student(name, kor, eng, mat));
		
		System.out.println("추가 완료");
	}
	
	private void updStu() {
		String name;
		
		System.out.print("변경할 학생 이름 : ");
		name = std.next();
		
		for (int i = 0; i < stus.size(); i++) {
			Student stu = stus.get(i);
			String curName = stu.getName();
			
			if (curName.equals(name)) {
				String newName;
				int kor, eng, mat;
				
				System.out.print("이름 : ");
				newName = std.next();
				
				System.out.print("국 영 수 : ");
				kor = std.nextInt();
				eng = std.nextInt();
				mat = std.nextInt();
				
				stu.update(newName, kor, eng, mat);
				
				stus.set(i, stu);
				
				System.out.println("수정 완료");
				return;
			}
		}
		
		System.out.println("해당 학생은 없습니다");
	}
	
	private void delStu() {
		String name;
		
		System.out.print("삭제할 학생 이름 : ");
		name = std.next();
		
		for (int i = 0; i < stus.size(); i++) {
			String curName = stus.get(i).getName();
			
			if (curName.equals(name)) {
				stus.remove(i);
				
				System.out.println("삭제 완료");
				return;
			}
		}
		
		System.out.println("해당 학생은 없습니다");
	}
	
	private void save() throws IOException {
		FileWriter fw = new FileWriter("stuSave.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (int i = 0; i < stus.size(); i++) {
			bw.write(stus.get(i) + "\n");
		}
		
		System.out.println("저장 완료");
		bw.close();
	}
	
	private void load() throws IOException {
		File save = new File("stuSave.txt");
		fileOut = new Scanner(save);
		
		String name;
		int kor, eng, mat;
		
		while (fileOut.hasNext()) {
			name = fileOut.next();
			kor = fileOut.nextInt();
			eng = fileOut.nextInt();
			mat = fileOut.nextInt();
			
			stus.add(new Student(name, kor, eng, mat));
		}
		
		System.out.println("불러오기 완료");
	}
	
	public void run() {
		try {
			int menu;
			
			do {
				showMenu();
				menu = std.nextInt();
				
				switch (menu) {
				case 1:		showStus();	break;
				case 2:		addStu();	break;
				case 3:		updStu();	break;
				case 4:		delStu();	break;
				case 5:		save();		break;
				case 6:		load();		break;
				case 0:		break;
				default:
					System.out.println("없는 메뉴 입니다");
				}
			
			} while (menu != 0);
			
			System.out.println("\n프로그램 종료");
		
		} catch(IOException e) {
			System.err.println("예외 메세지 : " + e.getMessage());
		} finally {
			System.out.println("\n프로그램 종료");
			std.close();
		}
	}
}
