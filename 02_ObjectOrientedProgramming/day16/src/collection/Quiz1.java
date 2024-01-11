package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/*
	학생 정보 관리 프로그램
	1. Student 클래스		필드 : 이름, 학번, 국 영 수
	
	2. Controller 클래스	관리 프로그램 메뉴를 출력하고 관리할 클래스
	
	메뉴)
	1. 학생 정보		(간단히 학번, 이름, 합계만 출력)
	2. 학생 정보 추가
	3. 학생 정보 검색	(지정 학생 모든 정보를 출력)
	4. 학생 정보 수정
	5. 학생 정보 삭제
	6. 성적 순으로 내림차순
	0. 종료
*/

class Student{
	String name;
	int kor,eng,mat,code;
	int sum = kor+eng+mat;
	
}

class Controller{
	private Scanner sc = new Scanner(System.in);
	LinkedList<Student> list = new LinkedList<Student>();
	private void showMenu() {
		System.out.println("--학생 정보 관리 프로그램--");
		System.out.println("1. 학생 정보");
		System.out.println("2. 학생 정보 추가");
		System.out.println("3. 학생 정보 검색");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("6. 성적순으로 정렬하기");
		System.out.println("0. 종료\n");
		
		System.out.print(">>> ");
	}
	private void modifyShowMenu() {
		System.out.println("수정하고 싶은 항목을 골라주세요.");
		System.out.println("1. 학생 이름");
		System.out.println("2. 학생 학번");
		System.out.println("3. 학생 국어점수");
		System.out.println("4. 학생 영어점수");
		System.out.println("5. 학생 수학점수");
		System.out.println("0. 종료\n");
		
		System.out.print(">>> ");
		
	}
	private void showInfo() {
		System.out.println("<<학생 목록>>");
		for (int i = 0; i < list.size(); i++) {
			int sum = list.get(i).kor + list.get(i).eng + list.get(i).mat;
			System.out.printf("학번: %d, 이름: %s, 합계: %d\n",
					list.get(i).code,list.get(i).name,sum);
		}
	}
	private void addlist() {
		System.out.println("학생 정보를 추가합니다.");
		System.out.print("학생의 이름을 입력해주세요 >> ");
		Student stu = new Student();
		stu.name = sc.next();
		System.out.print("학생의 학번을 입력해주세요 >> ");
		stu.code = sc.nextInt();
		System.out.print("학생의 점수를 국영수 순으로 입력해주세요 >> ");
		stu.kor = sc.nextInt();
		stu.eng = sc.nextInt();
		stu.mat = sc.nextInt();
		list.add(stu);
		System.out.println("학생정보추가를 완료하였습니다.");
	}
	private void searchInfo() {
		System.out.print("상세정보를 보고싶은 학생의 이름을 입력하세요 >> ");
		String name = sc.next();
		for(int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).name)) {
				int sum = list.get(i).kor + list.get(i).eng + list.get(i).mat;
				System.out.printf("학번 : %d\n",list.get(i).code);
				System.out.printf("이름 : %s\n",list.get(i).name);
				System.out.printf("국어점수 : %d\n",list.get(i).kor);
				System.out.printf("영어점수 : %d\n",list.get(i).eng);
				System.out.printf("수학점수 : %d\n",list.get(i).mat);
				System.out.printf("합계 : %d\n",sum);
			}
		}
	}
	private void modifyInfo() {
		System.out.print("정보 수정을 하고싶은 학생의 이름을 입력하세요 >> ");
		String name = sc.next();
		for(int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).name)) {
				
				int menu;
				do {
					modifyShowMenu();
					menu = sc.nextInt();
					switch(menu) {
					case 1 : 
						System.out.print("수정할 학생의 이름을 입력해주세요 >> ");
						String name1 = sc.next();
						list.get(i).name = name1;
						break;
					case 2 :
						System.out.print("수정할 학생의 학번을 입력해주세요 >> ");
						int code = sc.nextInt();
						list.get(i).code = code;
						break;
					case 3 :
						System.out.print("수정할 학생의 국어점수를 입력해주세요 >> ");
						int kor = sc.nextInt();
						list.get(i).kor = kor;
						break;
					case 4 :
						System.out.print("수정할 학생의 영어점수를 입력해주세요 >> ");
						int eng = sc.nextInt();
						list.get(i).eng = eng;
						break;
					case 5 :
						System.out.print("수정할 학생의 수학점수를 입력해주세요 >> ");
						int mat = sc.nextInt();
						list.get(i).mat = mat;
						break;
					case 0 :
						System.out.println("수정 종료");
					}
				} while (menu != 0);
				
			}
		}
	}
	private void removeInfo() {
		System.out.print("정보 삭제를 하고싶은 학생의 이름을 입력하세요 >> ");
		String name = sc.next();
		for(int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).name)) {
				list.remove(i);
			}
		}
	}
	private void sortRank() {
		Comparator<Student> desc = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int o1sum = o1.kor + o1.eng + o1.mat;
				int o2sum = o2.kor + o2.eng + o2.mat;
				return o2sum - o1sum;
			}
		};
		list.sort(desc);
	}
	
	void run() {
		int menu;
		
		do {
			showMenu();
			menu = sc.nextInt();
			
			switch(menu){
			case 1 : showInfo(); break;
			case 2 : addlist(); break;
			case 3 : searchInfo(); break;
			case 4 : modifyInfo(); break;
			case 5 : removeInfo(); break;
			case 6 : sortRank(); break;
			case 0 : System.out.println("프로그램 종료");
			}
			
		}while(menu != 0);
		
		sc.close();
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		new Controller().run();
	}
}
