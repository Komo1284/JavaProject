package jdbc;

import java.util.Scanner;

import model.StudentDAO;
import model.vo.StudentVO;
/*
	student 테이블을 사용하기 위한 프로그램을 작성
	
	1. 학생 목록
	2. 학생 추가
	3. 학생 검색
	4. 학생 변경
	5. 학생 삭제
	6. 종료
*/

class Controller {
	Scanner sc = new Scanner(System.in);
	StudentDAO dao = new StudentDAO();
	StudentVO stu = new StudentVO();
	
	void run() {
		int menu;
		do {
			viewMenu();
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: viewStu();		break;
			case 2:	addStu();		break;
			case 3:	searchStu();	break;
			case 4:	updateStu();	break;
			case 5:	deleteStu();	break;
			case 0:	System.out.println("프로그램을 종료합니다.");	break;
			}
		} while(menu != 6);
		sc.close();
		
	}
	
	void viewMenu() {
		System.out.println("----학생 관리 프로그램 ----");
		System.out.println("1. 학생 목록");
		System.out.println("2. 학생 추가");
		System.out.println("3. 학생 검색");
		System.out.println("4. 학생 변경");
		System.out.println("5. 학생 삭제");
		System.out.println("0. 종료\n");
	}
	
	void viewStu() {
		
		for(StudentVO row : dao.selectAll()) {
			System.out.println(row);
		}
	}
	
	void addStu() {
		
		stu.add(sc);
		int row = dao.insert(stu);
		String msg = "추가 실패";
		
		if(row != 0) {
			msg = "추가 성공";
		}
		
		System.out.println("\n" + msg + "\n");
	}
	
	void searchStu() {
		stu.search(sc);
		System.out.println(dao.selectOne(stu));
	}
	
	void updateStu() {
		stu.update(sc);
		
		if (dao.update(stu) != 0) {
			System.out.println("변경 성공");
		}
		
		
	}
	
	void deleteStu() {
		int idx;
		
		System.out.print("삭제할 계정 번호 : ");
		idx = sc.nextInt();
		
		int row = dao.delete(idx);
		String msg = "삭제 실패";
		
		if(row != 0) {
			msg = "삭제 성공";
		}
		
		System.out.println(msg);
		
	}
}

public class Quiz {
	public static void main(String[] args) {
		new Controller().run();
	}
}
